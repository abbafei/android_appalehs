package com.abbafei.android.androidsoundrecorderopener;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.content.ComponentName;
import java.lang.System;

public class AndroidsoundrecorderopenerActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Intent it = new Intent(Intent.ACTION_MAIN);
        it.setComponent(new ComponentName("com.android.soundrecorder", "com.android.soundrecorder.SoundRecorder"));
        startActivity(it);
        System.exit(0);
    }
}
