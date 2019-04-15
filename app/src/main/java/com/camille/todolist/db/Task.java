package com.camille.todolist.db;

import android.provider.BaseColumns;

public class Task {
    public static final String DB_NAME = "com.example.todolist20.db";
    public static final int DB_VERSION = 1;

    public class TaskEntry implements BaseColumns {
        public static final String COL_TASK_TITLE = "title";
        public static final String TABLE = "tasks";
    }
}
