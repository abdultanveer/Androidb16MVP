package com.example.admin.androidb16mvp.main;

import com.example.admin.androidb16mvp.data.Task;
import com.example.admin.androidb16mvp.data.souce.TaskDataSource;
import com.example.admin.androidb16mvp.data.souce.TaskRespository;

public class MainPresenter implements MainContract.Presenter,TaskDataSource.GetTaskCallback {
    MainContract.View view;
    TaskDataSource repository;

    public MainPresenter(MainActivity activity) {

        this.view = activity;
        repository = new TaskRespository();
    }

    @Override
    public void onButtonClicked() {
        //tell the view to show a toast
        repository.getTask(this);//step2
    }

    @Override
    public void onTaskLoaded(Task task) {
        view.showToast(task.getTitle()+"\n"+task.getNotes());//step7

    }
}
