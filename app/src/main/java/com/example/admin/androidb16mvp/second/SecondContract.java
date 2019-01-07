package com.example.admin.androidb16mvp.second;

public interface SecondContract {
    interface View{
        void showToast(String msg);
    }
    interface Presenter{
        void onButtonClicked();
    }

    interface  GetNotesCallBack{
        void onNoteLoaded(Note note);
    }

    void getNote(GetNotesCallBack getNotesCallBack);
}
