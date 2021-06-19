package com.ju.learnandroid.lifecycle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

import android.os.Bundle;
import android.util.Log;

import com.ju.learnandroid.R;

public class LifeCycleDemoActivity extends AppCompatActivity {

    private static final String TAG = "LifeCycleDemoActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle_demo);
        getLifecycle().addObserver(new MyObserver());
    }
    public class MyObserver implements LifecycleObserver {

        @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
        void onResume(){
            Log.d(TAG, "Lifecycle call onResume");
        }
        @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
        void onPause(){
            Log.d(TAG, "Lifecycle call onPause");
        }
        @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
        void onDestroy(){
            Log.d(TAG, "Lifecycle call onDestroy");
        }
    }

}