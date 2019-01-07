package com.example.admin.androidb16mvp.main;

public interface MainContract {

    interface View{
        void showToast(String message);
    }
    interface Presenter{
         void onButtonClicked();
    }
}
