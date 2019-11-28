package com.example.cgy.mydemofactory.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;

import com.example.cgy.mydemofactory.R;
import com.example.cgy.mydemofactory.app.BaseActivity;

public class WebGoActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_go);
        WebView webView = findViewById(R.id.wv);
        webView.loadUrl("file:///android_asset/schame-test.html");//example.html 存放在assets文件夹内
    }

    public static void start(Context context) {
        Intent starter = new Intent(context, WebGoActivity.class);
        context.startActivity(starter);
    }
}
