package com.taskmanager.Service;

import com.taskmanager.Entity.Task;

import java.util.List;
import java.util.Optional;

public interface TaskService {
    public Task addTasks(Task tasks);
    public List<Task> getTasks(boolean filter);
    public Optional<Task> getTask(int taskId);
    public Task updateTask(int taskId);
    public Task deleteTask(int taskId);
}
