package com.taskmanager.Controller;

import com.taskmanager.Entity.Task;
import com.taskmanager.Service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.*;
import javax.swing.text.Document;
import java.util.List;

@RestController
@RequestMapping("/task-manager")
public class TaskManager {
    @Autowired
    private TaskService taskService;

    @GetMapping("/{filter}")
    public List<Task> getAllTasksByFilter(@PathVariable boolean filter){
        List<Task> tasks = taskService.getTasks(filter);
        return tasks;
    }
    @GetMapping("/{id}")
    public List<Task> getAllTasksById(@PathVariable boolean id){
        List<Task> tasks = taskService.getTasks(id);
        return tasks;
    }
    @PostMapping("/task")
    public Task saveAllTasks(@RequestBody Task task){
        Task newTask = (Task) taskService.addTasks(task);
        return newTask;
    }
}
