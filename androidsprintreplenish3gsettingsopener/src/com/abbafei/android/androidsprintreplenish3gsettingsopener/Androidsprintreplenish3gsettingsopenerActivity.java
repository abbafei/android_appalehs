package com.abbafei.android.androidsprintreplenish3gsettingsopener;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import java.lang.System;

public class Androidsprintreplenish3gsettingsopenerActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Intent it = new Intent(Intent.ACTION_MAIN);
        it.setComponent(new ComponentName("com.android.phone", "com.android.phone.CdmaSettings"));
        startActivity(it);
        System.exit(0);
    }
}
