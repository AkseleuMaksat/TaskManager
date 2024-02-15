package com.Task.Manager.Controllers;

import com.Task.Manager.Model.TaskModel;
import com.Task.Manager.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    private TaskRepository taskRepository;

    @GetMapping(value = "/")
    public String index(Model model){
        List<TaskModel> TaskList = taskRepository.findAll();
        model.addAttribute("tasktar", TaskList);
        return "index";
    }
    @PostMapping(value = "/add-task")
    public String addMusic(TaskModel taskModel){
        taskRepository.save(taskModel);
        return "redirect:/";
    }
    @GetMapping(value = "/task-details")
    public  String getTask(@RequestParam(name = "id") Long id, Model model){
        TaskModel taskModel = taskRepository.findById(id).orElse(null);
        model.addAttribute("task", taskModel);
        return "/details.html";
    }
    @PostMapping(value = "/delete-task")
    public String deleteMusic(@RequestParam(name="id")Long id){
        taskRepository.deleteById(id);
        return "redirect:/";
    }
    @PostMapping(value = "/save-task")
    public String SaveMusic (TaskModel taskModel){
        taskRepository.save(taskModel);
        return "redirect:/";
    }
    @GetMapping(value ="/add-task")
    public String addTaskPage( Model model){
        return "/add_page";
    }
}
