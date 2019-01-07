package com.example.admin.androidb16mvp.second;

public class NotesDataSourceDB implements SecondContract {
    @Override
    public void getNote(GetNotesCallBack getNotesCallBack) {
        //i am hardcoding this note , in real app you need to query the db and return the note
        Note note = new Note("my title","my sub");
        getNotesCallBack.onNoteLoaded(note);

    }
}
