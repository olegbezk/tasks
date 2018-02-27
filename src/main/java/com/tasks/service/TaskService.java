package com.tasks.service;

import com.tasks.domain.Task;

public interface TaskService {

    Iterable<Task> getAllTasks();

    Task saveTask(Task task);
}
