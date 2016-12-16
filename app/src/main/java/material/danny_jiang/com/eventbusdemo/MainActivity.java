package material.danny_jiang.com.eventbusdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.simple.eventbus.EventBus;
import org.simple.eventbus.Subcriber;

public class MainActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EventBus.getDefault().register(this);

        textView = ((TextView) findViewById(R.id.text_Main));
    }

    public void click(View view) {
        switch (view.getId()) {
            case R.id.startSec:
                startActivity(new Intent(this, SecondActivity.class));
                break;
            case R.id.startThird:
                startActivity(new Intent(this, ThirdActivity.class));
                break;
        }
    }

    @Subcriber
    public void onEventMainThread(String string) {
        Toast.makeText(this, "MainActivity接收到的订阅的string is " +
                string, Toast.LENGTH_SHORT).show();

        textView.setText(string);
    }

    @Subcriber
    public void onEventMainThread(Event event) {
        Toast.makeText(this, "MainActivity接收到的订阅的event is " +
                event.getBody(), Toast.LENGTH_SHORT).show();

        textView.setText(event.getBody());
    }
}
















