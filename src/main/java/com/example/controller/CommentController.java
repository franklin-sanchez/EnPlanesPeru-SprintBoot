package com.example.controller;

import java.util.List;

import com.example.entities.Comments;
import com.example.service.CommentsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/comments")
public class CommentController {

	@Autowired
	private CommentsService commentservice;
	

	@GetMapping
	public String showAllComment(Model model) {
		model.addAttribute("comments", commentservice.getAll());
		return "comments/list";
	}
	
	@GetMapping("/new")
    public String newCommentForm(Model model) {
        model.addAttribute("comment", new Comments());
        return "comments/new";
    }
	
	@PostMapping("/save")
    public String saveNewComment(Comments comment) {
        long id = commentservice.create(comment);
        return "redirect:/comments";
    }
	@GetMapping("/edit/{id}")
    public String editCommentForm(@PathVariable("id") long id, Model model) {
		Comments comment = commentservice.getOneById(id);
        model.addAttribute("comment", comment);
        return "comments/edit";
    }
	
	@GetMapping("/eliminar/{id}")
	public String delete(Model model, @PathVariable long id) {
		commentservice.delete(id);
		return "redirect:/comments";
	}
	

}
