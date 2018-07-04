package com.greenfoxacademy.connection_with_mysql.controllers;

import com.greenfoxacademy.connection_with_mysql.models.ToDo;
import com.greenfoxacademy.connection_with_mysql.repositories.ToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Controller
public class ToDoController {


  @Autowired
  ToDoRepository toDoRepository;

  public ToDoController(ToDoRepository toDoRepository) {
    this.toDoRepository = toDoRepository;
  }




  @GetMapping(value = {"/todo", ""})
  public String renderToDo(Model model, @RequestParam(value = "isActive", required = false) Boolean isActive) {
    model.addAttribute("todos", toDoRepository.findAll());
    try {
      List<ToDo> doneList = new ArrayList<>();
      List<ToDo> unDoneList = new ArrayList<>();
      if (isActive == true) {
        for (ToDo todo : toDoRepository.findAll()) {
          if (todo.isDone()) {
            doneList.add(todo);
          } else {
            unDoneList.add(todo);
          }
        }
        model.addAttribute("todos", doneList);
      }
      model.addAttribute("todos", unDoneList);
    } catch (NullPointerException e) {
      model.addAttribute("todos", toDoRepository.findAll());

    }
    return "todo";
  }

  @GetMapping("/{id}/edit")
  public String editToDo(@PathVariable("id") long id, Model model) {
    model.addAttribute("todo1", toDoRepository.findById(id).get());
    return "edit";
  }

  @PostMapping("/{id}/edit")
  public String editToDo(@PathVariable("id") long id, @RequestParam(value = "urgent", required = false) Boolean urgent, @RequestParam(value = "done", required = false) Boolean done, @RequestParam(value = "title", required = false) String title) {
    boolean urgentEdit = false;
    boolean doneEdit = false;
    if (! (title == null)) {
      toDoRepository.findById(id).get().setTitle(title);
    }
    if (! (urgent == null)){
      if (urgent) {
        urgentEdit = true;
      }
    }
    if (! (done == null)) {
      if (done) {
        doneEdit = true;
      }
    }
    if (urgentEdit) {
      toDoRepository.findById(id).get().setUrgent(true);
    } else {
      toDoRepository.findById(id).get().setUrgent(false);
    }
    if (doneEdit) {
      toDoRepository.findById(id).get().setDone(true);
    } else {
      toDoRepository.findById(id).get().setDone(false);
    }
    toDoRepository.save(toDoRepository.findById(id).get());
    return "redirect:/todo";
  }

  @GetMapping("/todo/add")
  public String renderToDoAdd() {
    return "add";
  }

  @PostMapping("/todo/add")
  public String addToDo(@ModelAttribute("newtodo") String title) {
    toDoRepository.save(new ToDo(title));
    return "redirect:/todo";
  }

  @PostMapping("/{id}/delete")
  public String deleteToDo(@PathVariable("id") long id) {
    toDoRepository.deleteById(id);
    return "redirect:/todo";
  }



}
