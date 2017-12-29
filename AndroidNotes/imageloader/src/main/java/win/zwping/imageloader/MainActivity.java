package win.zwping.imageloader;

import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.SimpleTarget;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.request.transition.Transition;

import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

import win.zwping.imageloader.glide.GlideUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String url = "https://raw.githubusercontent.com/zwping-win/RESOURCES/master/test/img-01.jpg";
        String url1 = "https://raw.githubusercontent.com/zwping-win/RESOURCES/master/test/gif-01.gif";

        final ImageView img = findViewById(R.id.img);
        Glide.with(this).asGif().apply(new RequestOptions().centerCrop()).load(url1).into(new SimpleTarget<GifDrawable>() {
            @Override
            public void onResourceReady(GifDrawable resource, Transition<? super GifDrawable> transition) {
                gifDrawable = resource;
                img.setImageDrawable(resource);
            }
        });

        ImageView img1 = findViewById(R.id.img1);
        Glide.with(this).load(new File("file:///android_asset/v.mp4")).apply(new RequestOptions().error(R.drawable.ic_launcher_background)).into(img1);

    }

    GifDrawable gifDrawable;

    public void onClick(View view) {
        if (null != gifDrawable) {
            if (gifDrawable.isRunning()) {
                gifDrawable.stop();
            } else {
                gifDrawable.start();
            }
        } else {
            Toast.makeText(this, "123123123", Toast.LENGTH_SHORT).show();
        }
    }
}
