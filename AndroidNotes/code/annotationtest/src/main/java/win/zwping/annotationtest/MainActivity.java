package win.zwping.annotationtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import win.zwping.annotationtest.Inject.ContentView;
import win.zwping.annotationtest.Inject.OnClick;
import win.zwping.annotationtest.Inject.ViewInject;
import win.zwping.annotationtest.Inject.ViewInjectUtils;

/***
 * 从《Android高级进阶》第十一章一书入手，基于鸿洋Ioc入门文章练手之作 Link:https://blog.csdn.net/lmj623565791/article/details/39269193
 * ***/
@ContentView(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {

    @ViewInject(R.id.btn1)
    Button btn1;
    @ViewInject(R.id.btn2)
    Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        ViewInjectUtils.inject(this);

        btn2.setText(btn2.getText().toString() + "----1");
    }

    @OnClick({R.id.btn1, R.id.btn2})
    public void CusOnClick(View view) {
        switch (view.getId()) {
            case R.id.btn1:
                Toast.makeText(this, "实现事件注入", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
