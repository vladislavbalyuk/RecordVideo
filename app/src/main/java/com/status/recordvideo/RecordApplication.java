package com.status.recordvideo;

import android.app.Application;
import android.content.Intent;


public class RecordApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        startService(new Intent(this, RecordService.class));
    }

}