package com.technovation.parkoala.ui.todolist;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class TodolistViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public TodolistViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Hey girls! Here's your todo list " +
                "\n[ ] Add a button to the app." +
                "\n[ ] Add an OnClick function to your button" +
                "\n[ ] Open a Toast notification when the user clicks the button");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
