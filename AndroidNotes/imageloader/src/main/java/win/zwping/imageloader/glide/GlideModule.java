package win.zwping.imageloader.glide;

import android.content.Context;

import com.bumptech.glide.Glide;
import com.bumptech.glide.GlideBuilder;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.engine.cache.ExternalPreferredCacheDiskCacheFactory;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.module.AppGlideModule;
import com.bumptech.glide.request.RequestOptions;

import java.io.InputStream;

/**
 * <p>describe：
 * <p>    note：Glide默认加载Bitmap格式为RGB_565，Picasso默认加载Bitmap格式为ARGB_8888
 * <p>    note: Glide重写{@link AppGlideModule}也可以加载ARGB_8888格式的Bitmap、将缓存地址更换至SD卡，并将缓存大小调整为原来的2倍(500M)
 * <p>    note: 同时需要增加{@link com.bumptech.glide.annotation.GlideModule}注解标签，重新编译生成{@link GlideApp}，后期使用直接使用GlideApp即可
 * <p>    note:
 * <p> @author：zwp on 2017/12/26 0026 mail：1101558280@qq.com web: http://www.zwping.win </p>
 */
@com.bumptech.glide.annotation.GlideModule
public class GlideModule extends AppGlideModule {

    public static final int DISK_CACHE_SIZE = 500 * 1024 * 1024;

    @Override
    public void applyOptions(Context context, GlideBuilder builder) {
        super.applyOptions(context, builder);
        builder.setDiskCache(new ExternalPreferredCacheDiskCacheFactory(context,DISK_CACHE_SIZE)); //更换缓存地址及扩充缓存大小
        builder.setDefaultRequestOptions(new RequestOptions().format(DecodeFormat.PREFER_ARGB_8888).disallowHardwareConfig()); //更换编码格式
    }

    @Override
    public void registerComponents(Context context, Glide glide, Registry registry) {
        super.registerComponents(context, glide, registry);
//        registry.replace(GlideUrl.class, InputStream.class, new OkHttpUrlLoader.Factory());
    }
}
