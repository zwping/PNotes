package win.zwping.imageloader;

import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.SimpleTarget;
import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.request.transition.Transition;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int maxMemory = (int) (Runtime.getRuntime().maxMemory() / 1024);
        System.out.println("Max memory is " + maxMemory + "KB");

//        Glide.with(this).asGif().load("123").apply(new RequestOptions().dontTransform().override(Target.SIZE_ORIGINAL,Target.SIZE_ORIGINAL).transform()).into(new ImageView(this));

        Set<Integer> sets = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            sets.add(new Random().nextInt(5));
        }

        Iterator iterator = sets.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
