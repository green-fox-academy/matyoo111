package com.greenfoxacademy.connection_with_mysql.controllers;

import com.greenfoxacademy.connection_with_mysql.models.Assignee;
import com.greenfoxacademy.connection_with_mysql.models.ToDo;
import com.greenfoxacademy.connection_with_mysql.repositories.AssigneeRepository;
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


  ToDoRepository toDoRepository;
  AssigneeRepository assigneeRepository;

  @Autowired
  public ToDoController(ToDoRepository toDoRepository, AssigneeRepository assigneeRepository) {
    this.toDoRepository = toDoRepository;
    this.assigneeRepository = assigneeRepository;
  }


  @GetMapping(value = {"/todo", ""})
  public String renderToDo(Model model,
                           @RequestParam(value = "isActive", required = false) boolean isActive,
                           @RequestParam(value = "search", required = false) String search) {
    if (isActive) {
      model.addAttribute("todos", toDoRepository.findByDone(false));
    }
    if (search != null){
      model.addAttribute("todos", toDoRepository.findAllByTitleContaining(search));
    }
    else {
      model.addAttribute("todos", toDoRepository.findAllByOrderByIdAsc());
    }
    return "todo";
  }

  @GetMapping("/{id}/edit")
  public String editToDo(@PathVariable("id") long id, Model model) {
    model.addAttribute("todo1", toDoRepository.findById(id).get());
    model.addAttribute("assignees", assigneeRepository.findAll());
    return "edit";
  }

  @PostMapping("/{id}/edit")
  public String editToDo(@PathVariable("id") long identification,
                         @RequestParam(value = "urgent", required = false) Boolean urgent,
                         @RequestParam(value = "done", required = false) Boolean done,
                         @RequestParam(value = "title", required = false) String title) {
    boolean urgentEdit = false;
    boolean doneEdit = false;
    if (!(title == null) && !(title.equals(""))) {
      toDoRepository.findById(identification).get().setTitle(title);
    }
    if (urgent != null){
      if (urgent) {
        urgentEdit = true;
      }
    }
    if (done != null) {
      if (done) {
        doneEdit = true;
      }
    }
    if (urgentEdit) {
      toDoRepository.findById(identification).get().setUrgent(true);
    } else {
      toDoRepository.findById(identification).get().setUrgent(false);
    }
    if (doneEdit) {
      toDoRepository.findById(identification).get().setDone(true);
    } else {
      toDoRepository.findById(identification).get().setDone(false);
    }
    toDoRepository.save(toDoRepository.findById(identification).get());
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

  @PostMapping("/{id}/assign")
  public String assign(@PathVariable("id") long id, @ModelAttribute("assignee") long assigneeID) {
    toDoRepository.findById(id).get().setAssignee(assigneeRepository.findById(assigneeID).get());
    toDoRepository.save(toDoRepository.findById(id).get());
    return "redirect:/todo";
  }

}
