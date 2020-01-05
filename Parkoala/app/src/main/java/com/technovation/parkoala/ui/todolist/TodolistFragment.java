package com.technovation.parkoala.ui.todolist;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.technovation.parkoala.ui.dashboard.DashboardViewModel;

public class TodolistFragment extends Fragment {

    private TodolistViewModel TodolistFragment;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        TodolistFragment =
                ViewModelProviders.of(this).get(TodolistViewModel.class);
        View root = inflater.inflate(com.technovation.parkoala.R.layout.fragment_todolist, container, false);
        final TextView textView = root.findViewById(com.technovation.parkoala.R.id.text_todolist);
        TodolistFragment.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
