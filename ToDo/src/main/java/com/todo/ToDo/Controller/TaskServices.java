package com.todo.ToDo.Controller;

import java.util.List;

import org.springframework.stereotype.Service;

import com.todo.ToDo.Repository.TaskRepository;
import com.todo.ToDo.models.Task;

@Service
public class TaskServices {
    private final TaskRepository taskRepository;

    public TaskServices(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }
    
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public void createTask(String title) {
        Task task = new Task();
        task.setTitle(title);
        task.setCompleted(false);
        taskRepository.save(task);
    }

    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }

    public void toggleTask(Long id) {
        Task task = taskRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid task Id:"));
        task.setCompleted(!task.isCompleted());
        taskRepository.save(task);
    }

}
