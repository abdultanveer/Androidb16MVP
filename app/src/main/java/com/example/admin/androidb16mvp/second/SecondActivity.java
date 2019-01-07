package com.example.admin.androidb16mvp.second;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.admin.androidb16mvp.R;

public class SecondActivity extends AppCompatActivity implements SecondContract.View {

    SecondPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        presenter = new SecondPresenter(this);
    }

    public void handleClick(View view) {
        presenter.onButtonClicked();
    }

    @Override
    public void showToast(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
}
