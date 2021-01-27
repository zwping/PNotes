## 获取当前App的fir（内测分发平台）下载路径 - 安卓

``` kotlin
import android.content.Context
import android.os.Handler
import android.os.Looper
import android.widget.Toast
import okhttp3.Callback
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response
import org.json.JSONObject
import java.io.IOException
import java.text.SimpleDateFormat
import java.util.*


/**
 * 获取fir内测分发平台文件下载地址
 * zwping @ 1/27/21
 */
object FirUtil {

    private const val api_token = "xxx" // https://fir.im 账号xx的token

    /**
     * 根据包名获取fir中app的最新下载地址
     * https://www.jappstore.com/docs/install
     */
    fun getDownUrl(ctx: Context?, lis: (url: String, des: String)->Unit){
        val okHttpClient = OkHttpClient()
        val reqApps = Request.Builder().url("http://api.bq04.com/apps?api_token=$api_token").build()
        okHttpClient.newCall(reqApps).enqueue(object: Callback{
            override fun onFailure(call: okhttp3.Call, e: IOException) {
                handler.post { Toast.makeText(ctx, "${e.message}", Toast.LENGTH_SHORT).show() }
            }

            override fun onResponse(call: okhttp3.Call, response: Response) {
                try {
                    val apps = optJSONArray3(JSONObject(response.body()?.string()), "items") { JSONObject(it.toString()) }
                    val name = ctx?.packageName
                    apps?.filter { it.optString("bundle_id") == name }?.forEach {
                        val aid = it.optString("id") // fir app ID
                        val aname = it.optString("name")
                        val utime = SimpleDateFormat("yyyy-MM-dd HH:mm").format(Date(it.optLong("updated_at") * 1000))
                        val durl = "${it.optString("download_domain")}/${it.optString("short")}"

                        val reqDToken = Request.Builder().url("http://api.bq04.com/apps/$aid/download_token?api_token=$api_token").build()
                        okHttpClient.newCall(reqDToken).enqueue(object: Callback{
                            override fun onFailure(call: okhttp3.Call, e: IOException) {
                                Toast.makeText(ctx, "${e.message}", Toast.LENGTH_SHORT).show()
                            }

                            override fun onResponse(call: okhttp3.Call, response: Response) {
                                val token = JSONObject(response.body()?.string()).optString("download_token")
                                val url = "http://download.bq04.com/apps/$aid/install?download_token=$token"

                                handler.post { lis.invoke(url, "$aname 内测版~\n$utime\n\n$durl") }
                            }

                        })
                    }
                }catch (e: Exception) {
                    handler.post { Toast.makeText(ctx, "${e.message}", Toast.LENGTH_SHORT).show() }
                }
            }
        })
    }

    private val handler by lazy { Handler(Looper.getMainLooper()) }

    private fun <BasicType> optJSONArray3(obj: JSONObject?, key: String?, lis: (Any?) -> BasicType?): MutableList<BasicType>? {
        var data: MutableList<BasicType>? = null
        obj?.optJSONArray(key)?.apply {
            data = mutableListOf()
            for (i in 0 until length()) {
                lis.invoke(get(i))?.also { data?.add(it) }
            }
        }
        return data
    }
}

```