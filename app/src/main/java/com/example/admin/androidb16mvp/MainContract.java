package com.example.admin.androidb16mvp;

public interface MainContract {

    interface View{
        void showToast(String message);
    }
    interface Presenter{
         void onButtonClicked();
    }
}
