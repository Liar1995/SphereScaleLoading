package com.spherescaleloading;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

//    circleRadius：设置圆的半径
//    circleSpacing：设置圆间距
//    cycle: 设置动画周期，即某一个圆从最大状态到最小状态，最后又恢复到最大状态的时间，单位是毫秒

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GyqVideoAnim view= (GyqVideoAnim) findViewById(R.id.view);
    }
}
