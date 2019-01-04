package com.example.admin.androidb16mvp.data.souce;

import com.example.admin.androidb16mvp.data.souce.local.TaskLocalDataSource;

public class TaskRespository implements  TaskDataSource {
    TaskLocalDataSource localDataSource;

    public TaskRespository() {
        this.localDataSource = new TaskLocalDataSource();
    }

    @Override
    public void getTask(GetTaskCallback callback) {
        localDataSource.getTask(callback);//step3
    }
}
