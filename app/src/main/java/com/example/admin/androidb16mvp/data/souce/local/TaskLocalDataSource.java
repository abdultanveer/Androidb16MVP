package com.example.admin.androidb16mvp.data.souce.local;

import com.example.admin.androidb16mvp.data.Task;
import com.example.admin.androidb16mvp.data.souce.TaskDataSource;

public class TaskLocalDataSource implements TaskDataSource {
    DatabaseOperations operations;

    public TaskLocalDataSource() {
        operations = new DatabaseOperations();
    }

    @Override
    public void getTask(GetTaskCallback callback) {
        Task task = operations.readTask();//step4
        callback.onTaskLoaded(task);//step6
    }
}
