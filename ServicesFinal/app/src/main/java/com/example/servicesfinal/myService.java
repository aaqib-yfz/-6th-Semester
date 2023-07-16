package com.example.servicesfinal;

import android.app.Service;
import android.content.Intent;
import android.nfc.Tag;
import android.os.IBinder;
import android.util.Log;

import androidx.annotation.Nullable;

import java.security.Provider;
import java.util.List;
import java.util.Map;

public class myService extends Service {
        private static final String TAG = "myService";

    @Override
    public void onCreate(){
        super.onCreate();
        Log.i(TAG, "Service Created");
    }

    public int onStartCommand(Intent intent, int flags, int startId){
        Log.i(TAG,"Service Started");
        return  START_STICKY;
    }

//    @Override
    public void onDestory(){
        super.onDestroy();
        Log.i(TAG, "Service Destroyed");
    }
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}

