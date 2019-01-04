package com.example.admin.androidb16mvp.data.souce;

import com.example.admin.androidb16mvp.data.Task;

public interface TaskDataSource  {

        interface GetTaskCallback { //we'll get the data on a background thread

        void onTaskLoaded(Task task);
    }
    void getTask( GetTaskCallback callback);

}
