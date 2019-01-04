package com.example.admin.androidb16mvp;

public class MainPresenter implements MainContract.Presenter {
    MainContract.View view;

    public MainPresenter(MainActivity activity) {

        this.view = activity;
    }

    @Override
    public void onButtonClicked() {
        //tell the view to show a toast
        view.showToast("message from presenter");
    }
}
