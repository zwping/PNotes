package win.zwping.imageloader.glide;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.load.resource.bitmap.FitCenter;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;

import win.zwping.imageloader.R;

import static com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions.withCrossFade;

/**
 * <p>describe：
 * <p>    note：
 * <p> @author：zwp on 2017/12/27 0027 mail：1101558280@qq.com web: http://www.zwping.win </p>
 */
public class GlideUtil {

    public static void glide(Context context, String url, ImageView imageView) {
//        GlideApp.with(context).load(url).placeholder(R.drawable.ic_launcher_background).transition(withCrossFade())
//                .skipMemoryCache(true).diskCacheStrategy(DiskCacheStrategy.NONE).thumbnail(0.01f).transforms(new FitCenter(),new RoundedCorners(100)).into(imageView);
    }
    public static void glide1(Context context, String url, ImageView imageView) {
//        GlideApp.with(context).load(url).placeholder(R.drawable.ic_launcher_background).skipMemoryCache(true).diskCacheStrategy(DiskCacheStrategy.RESOURCE).fitCenter().into(imageView);
    }
}
