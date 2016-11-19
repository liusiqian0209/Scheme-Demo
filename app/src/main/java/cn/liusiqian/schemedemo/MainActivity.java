package cn.liusiqian.schemedemo;

import android.os.Bundle;
import android.webkit.WebView;
import android.widget.TextView;

public class MainActivity extends BaseSchemeAcitivity
{
    private WebView webview;
    private TextView tv;

    @Override
    protected void initWidgets(Bundle savedInstanceState)
    {
        tv = (TextView) findViewById(R.id.txt);
        webview = (WebView) findViewById(R.id.web);
    }

    @Override
    protected int setLayoutRes()
    {
        return R.layout.activity_main;
    }
}
