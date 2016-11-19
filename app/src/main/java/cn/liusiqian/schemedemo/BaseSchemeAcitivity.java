package cn.liusiqian.schemedemo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.Map;

/**
 * Créé par liusiqian 16/11/19.
 */

public abstract class BaseSchemeAcitivity extends AppCompatActivity
{
    protected Map<String,String> mParams;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(setLayoutRes());
        initData(getIntent());
        initWidgets(savedInstanceState);
    }

    protected abstract void initWidgets(Bundle savedInstanceState);

    protected void initData(Intent intent)
    {
        if(intent == null || intent.getData() == null){
            return;
        }
        Uri uri = intent.getData();
        Log.i(getClass().getSimpleName(),"getquery = "+uri.getQuery());
    }

    protected abstract @LayoutRes int setLayoutRes();
}
