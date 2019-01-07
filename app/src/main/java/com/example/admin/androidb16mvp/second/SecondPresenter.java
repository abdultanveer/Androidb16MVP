package com.example.admin.androidb16mvp.second;

public class SecondPresenter  implements SecondContract.Presenter,SecondContract.GetNotesCallBack{
    SecondContract.View view;
    NotesDataSourceDB notesDataSourceDB;


    public SecondPresenter(SecondActivity secondActivity) {
        view = secondActivity;
        notesDataSourceDB = new NotesDataSourceDB();
    }

    @Override
    public void onButtonClicked() {
        notesDataSourceDB.getNote(this);
    }

    @Override
    public void onNoteLoaded(Note note) {
        view.showToast(note.title +"\n"+ note.subTitle);

    }
}
