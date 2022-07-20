/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.springframework.jokes.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

/**
 *
 * @author gmike
 */
@Service
public class JokeServiceImp implements JokeService {
    
    @Override
    public String getJoke(){
        ChuckNorrisQuotes quote = new ChuckNorrisQuotes();
        
        return quote.getRandomQuote();
        //return "";
    }
    
}
