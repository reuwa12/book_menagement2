package com.MH.book_management2.controller;

import com.MH.book_management2.model.Author;
import com.MH.book_management2.repository.AuthorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/authors")
@RequiredArgsConstructor
public class AuthorController {
    private final AuthorRepository authorRepository;

    @GetMapping
    public String list(Model model) {
        model.addAttribute("authors", authorRepository.finalAll());

        return "authors";
    }

    @GetMapping("/new")
    public String form(Model model) {
        model.addAttribute("author", new Author());

        return "author_form";
    }

    @PostMapping
    public String save(@ModelAttribute Author author) {
        authorRepository.save(author);

        return "redirect:/authors";
    }

    @GetMapping("/{id}/edit")
    public String edit(@PathVariable Long id, Model model) {
        model.addAttribute("author", authorRepository.findById(id));

        return "author_form";
    }

    @PostMapping("/{id}/edit")
    public String update(@PathVariable Long id, @ModelAttribute Author author) {
        author.setId(id);
        authorRepository.update(author);

        return "redirect:/authors";
    }

    @PostMapping("/{id}/delete")
    public String delete(@PathVariable Long id) {
        authorRepository.delete(id);

        return "redirect:/authors";
    }
}