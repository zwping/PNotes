package win.zwping.imageloader.glide;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.load.engine.DiskCacheStrategy;

/**
 * <p>describe：
 * <p>    note：
 * <p> @author：zwp on 2017/12/27 0027 mail：1101558280@qq.com web: http://www.zwping.win </p>
 */
public class GlideUtil {

    public static void glide(Context context, String url, ImageView imageView) {
        GlideApp.with(context).load(url).skipMemoryCache(true).into(imageView);
    }
    public static void glide1(Context context, String url, ImageView imageView) {
        GlideApp.with(context).load(url).skipMemoryCache(false).into(imageView);
    }
}
