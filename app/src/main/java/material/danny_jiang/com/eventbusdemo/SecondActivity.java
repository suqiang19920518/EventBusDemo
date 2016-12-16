package material.danny_jiang.com.eventbusdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import org.simple.eventbus.EventBus;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void sendPost(View view) {
        //EventBus.getDefault().post(1);

        EventBus.getDefault().post(new Event("春江水暖鸭先知"));
    }
}
