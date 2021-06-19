package com.ju.learnandroid.viewmodel;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.ju.learnandroid.R;

public class ViewModelDemoActivity extends AppCompatActivity {

    private static final String TAG ="ViewModelDemoActivity" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_model_demo);
        MyViewModel model = new ViewModelProvider(this, new MyViewModelFactory()).get(MyViewModel.class);
        model.getName().observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                Log.d(TAG, "name："+s);
            }
        });
        getApplication();
        getApplicationContext();
    }


    static class MyViewModelFactory implements ViewModelProvider.Factory {

        @NonNull
        @Override
        public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
            if (modelClass == MyViewModel.class) {
                return (T) new MyViewModel();
            }
            return null;
        }
    }
}