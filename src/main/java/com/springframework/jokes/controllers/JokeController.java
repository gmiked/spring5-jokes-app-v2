/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.springframework.jokes.controllers;

import com.springframework.jokes.services.JokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author gmike
 */
@Controller
public class JokeController {
    
    private JokeService jokeService;
    
    JokeController(JokeService jokeService){
        this.jokeService = jokeService;
    }
    
     @RequestMapping({"/", ""})
    public String getJoke(Model model){
        model.addAttribute("joke",jokeService.getJoke());
        return "index";
    }
    
}
