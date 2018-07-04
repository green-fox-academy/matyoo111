package com.example.list_todos_embedded_database.controllers;

import com.example.list_todos_embedded_database.repositories.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ToDoController {


  @Autowired
  ToDoRepository toDoRepository;

  public ToDoController(ToDoRepository toDoRepository) {
    this.toDoRepository = toDoRepository;
  }



  @GetMapping("/todo")
  public String renderToDo(Model model) {
    model.addAttribute("todos", toDoRepository.findAll());
    return "todo";
  }


  @GetMapping("")
  @ResponseBody
  public String list(Model model) {
    return "This is my first todo";
  }

  @GetMapping("/list")
  public String listReturn(Model model) {
    return "todolist";
  }
}
