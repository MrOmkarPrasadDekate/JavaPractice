package com.todo.ToDo.Services;

import java.nio.file.Path;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.todo.ToDo.Controller.TaskServices;
import com.todo.ToDo.models.Task;

@Controller
// @RequestMapping("/tasks")
public class TaskController {
    private final TaskServices taskServices;
    public TaskController(TaskServices taskServices) {
        this.taskServices = taskServices;
    }
    @GetMapping 
    public String getTasks(Model model){
        List<Task> tasks = taskServices.getAllTasks();
        model.addAttribute("tasks", tasks);
        return "Task";
    }
    @PostMapping 
    public String createTask(@RequestParam String title ){
        taskServices.createTask(title);
        return "redirect:/";
    }
    @GetMapping("/{id}/delete")
    public String deleteTasks(@PathVariable Long id){
        taskServices.deleteTask(id);
        return "redirect:/";
    }
    @GetMapping("/{id}/toggle")
    public String toggleTasks(@PathVariable Long id){
        taskServices.toggleTask(id);
        return "redirect:/";
    }
}
