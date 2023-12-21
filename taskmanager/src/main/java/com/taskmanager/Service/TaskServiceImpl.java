package com.taskmanager.Service;

import com.taskmanager.Entity.Task;
import com.taskmanager.Repository.TaskEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Configuration
public class TaskServiceImpl implements TaskService{
    @Autowired
    TaskEntityRepository taskEntityRepository;
    @Override
    public Task addTasks(Task tasks) {
        System.out.println(tasks.getTitle());
        return taskEntityRepository.save(tasks);
    }

    @Override
    public List<Task> getTasks(boolean filter) {

        return null;
    }

    @Override
    public Optional<Task> getTask(int taskId) {
        return taskEntityRepository.findById(taskId);
    }

    @Override
    public Task updateTask(int taskId) {
        return null;
    }

    @Override
    public Task deleteTask(int taskId) {
        return null;
    }
}
