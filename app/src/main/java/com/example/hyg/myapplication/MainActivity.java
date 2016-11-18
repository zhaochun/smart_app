package com.example.hyg.myapplication;

import android.content.DialogInterface;
import android.graphics.Color;
import android.preference.DialogPreference;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public TextView text2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        FrameLayout frameLayout = new FrameLayout(this);     //创建帧布局管理器
//        frameLayout.setBackgroundDrawable(this.getResources().getDrawable(
//                R.drawable.background)); // 设置背景
//        setContentView(frameLayout);
        setContentView(R.layout.activity_test2);
//        TextView text1= new TextView(this);
//        text1.setText("在代码中控制UI界面");
//        text1.setTextSize(TypedValue.COMPLEX_UNIT_PX,24);
//        text1.setTextColor(Color.rgb(1,1,1));
//        frameLayout.addView(text1);
//
//        text2 = new TextView(this);
//        text2 = (TextView)findViewById(R.id.text3);
//        text2.setText("单击进入游戏......"); // 设置显示文字
//        text2.setTextSize(TypedValue.COMPLEX_UNIT_PX, 24); // 设置文字大小，单位为像素
//        text2.setTextColor(Color.rgb(1, 1, 1)); // 设置文字的颜色
//        FrameLayout.LayoutParams params = new FrameLayout.LayoutParams(
//                ViewGroup.LayoutParams.WRAP_CONTENT,
//                ViewGroup.LayoutParams.WRAP_CONTENT); // 创建保存布局参数的对象
//
//        params.gravity = Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL;
//        text2.setLayoutParams(params); // 设置布局参数
//        text2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                new AlertDialog.Builder(MainActivity.this).setTitle("系统提示")
//                        .setMessage("游戏有风险，进入需谨慎，真的要进入嘛？")
//                        .setPositiveButton("确定", new DialogInterface.OnClickListener(){
//                            @Override
//                            public void onClick(DialogInterface dialog,int which){
//                                Log.i("3.2","进入游戏");
//                            }
//                        }).setNegativeButton("退出",new DialogInterface.OnClickListener(){
//                    @Override
//                    public void onClick(DialogInterface dialog,int which){
//                        Log.i("3.2","退出游戏");
//                        finish();
//                    }
//                }).show();
//            }
//        });
//        frameLayout.addView(text2);
    }
}
