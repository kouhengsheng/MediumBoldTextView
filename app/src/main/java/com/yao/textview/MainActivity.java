package com.yao.textview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.kou.text.MediumBoldTextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 主要的使用方法在布局文件里。
        // 主要的代码在lib_textview这个模块里，
        // 可以把lib_textview导入到你自己的项目里，即可使用，也可以把MediumBoldTextView类，还有attr.xml复制到你的项目里来使用

        MediumBoldTextView tvCustom = findViewById(R.id.tvCustom);
        tvCustom.setStrokeWidth(0.1F);

    }
}