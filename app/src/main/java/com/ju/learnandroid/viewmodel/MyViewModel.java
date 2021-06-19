package com.ju.learnandroid.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/**
 * @author: wxj
 * @date: 2021/6/18
 * @description:
 */
public class MyViewModel extends ViewModel {
    private MutableLiveData<String> name;
    public LiveData<String> getName() {
        if (name == null) {
            name = new MutableLiveData<String>();
            addName();
        }
        return name;
    }
    private void addName() {
        name.setValue("张三");
    }
}
