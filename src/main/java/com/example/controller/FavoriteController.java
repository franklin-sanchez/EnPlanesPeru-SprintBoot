package com.example.controller;

import com.example.entities.FavoritePackage;
import com.example.service.FavoriteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/favorites")
public class FavoriteController {

	@Autowired
	private FavoriteService favoriteservice;
	

	@GetMapping
	public String showAllFavorite(Model model) {
		model.addAttribute("favorites", favoriteservice.getAll());
		return "favorites/list";
	}
	
	@GetMapping("/new")
    public String newFavoriteForm(Model model) {
        model.addAttribute("favorite", new FavoritePackage());
        return "favorites/new";
    }
	
	@PostMapping("/save")
    public String saveNewFavorite(FavoritePackage favorite) {
        long id = favoriteservice.create(favorite);
        return "redirect:/favorites";
    }
	
	@PostMapping("/delete/{id}")
    public String deleteFavorite(@PathVariable("id") long id) {	
		favoriteservice.delete(id);
        return "redirect:/favorites";   
    }
	
	

}
