package com.example.mvvmdemo.View;


import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.BindingAdapter;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;


import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.mvvmdemo.R;
import com.example.mvvmdemo.databinding.ActivityMainBinding;
import com.google.android.material.snackbar.Snackbar;

import ViewModel.UserViewModel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        activityMainBinding.setViewModel(new UserViewModel());
        activityMainBinding.executePendingBindings();

    }

    @BindingAdapter({"message"})
    public static void messageNotifier(View view, String message){
        if(message != null && !message.isEmpty()){
            Snackbar.make(view,message,Snackbar.LENGTH_LONG).show();
        }
    }

}