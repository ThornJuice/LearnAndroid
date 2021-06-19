package com.ju.learnandroid.livedata;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;

import com.ju.learnandroid.R;

public class LiveDataDemoActivity extends AppCompatActivity {

    private static final String TAG = "LiveDataDemoActivity";
    MutableLiveData<String> mutableLiveData1;
    MutableLiveData<String> mutableLiveData2;
    MediatorLiveData<String> liveDataMerger;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live_data_demo);
        mutableLiveData1 = new MutableLiveData<>();
        mutableLiveData2 = new MutableLiveData<>();
        liveDataMerger = new MediatorLiveData<String>();
        liveDataMerger.addSource(mutableLiveData1, new Observer() {
            @Override
            public void onChanged(Object o) {
                Log.d(TAG, "onChanged1:" + o.toString());
            }
        });

        liveDataMerger.addSource(mutableLiveData2, new Observer() {
            @Override
            public void onChanged(Object o) {
                Log.d(TAG, "onChanged2:" + o.toString());
            }
        });
        liveDataMerger.observe(this, new Observer() {
            @Override
            public void onChanged(Object o) {
                Log.d(TAG, "onChanged:" + o.toString());
            }
        });
        mutableLiveData1.postValue("mutableLiveData1");
        mutableLiveData2.postValue("mutableLiveData2");
    }

    public void postValue(View view) {

    }
}