package com.example.admin.androidb16mvp.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.admin.androidb16mvp.R;

public class MainActivity extends AppCompatActivity implements MainContract.View{
    //activity is a view/noticeboard it should be as dumb as possible
    //no logic in the view

    MainPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new MainPresenter(this);
    }

    public void clickHandler(View view){
        //view should tell presenter that
        //hey presenter someone clicked the button what should i do
        presenter.onButtonClicked();//step1
    }

    @Override
    public void showToast(String message) {
        Toast.makeText(this,message,Toast.LENGTH_SHORT).show();//step8
    }
}
