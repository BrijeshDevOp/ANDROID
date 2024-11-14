package com.example.app;

import android.os.Bundle;
import android.webkit.WebView;
import androidx.appcompat.app.AppCompatActivity;



public class WebViewActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.web_view); // Make sure this matches your layout XML name

        // Initialize the WebView
        webView = (WebView) findViewById(R.id.myWebView); // Ensure ID matches the XML
        // Prevents loading in external browser
        webView.loadUrl("https://www.example.com");
    }

}
