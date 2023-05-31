package ru.zrn.CRUDapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/people")
public class PeopleController {
    @GetMapping
    public String index(Model model) {
        // получим всех людей
        return null;
    }

    @GetMapping("/{id}")
    public String show(@PathVariable("id") int id, Model model) {
        // получим человека из бд
        return null;
    }
}
