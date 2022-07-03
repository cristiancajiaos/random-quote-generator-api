package com.example.quote.controller;

import com.example.quote.model.Quote;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class QuoteController {

    public List<Quote> list;

    public QuoteController() {
        this.setQuotes();
    }

    @GetMapping("/quote")
    public Quote getQuote() {
        int index = (int) Math.floor(Math.random() * list.size());
        return list.get(index);
    }

    public List<Quote> setQuotes() {
        list = new ArrayList<Quote>();
        list.add(new Quote("The greatest trick the devil ever pulled was convincing the world he didn’t exist.", "Roger Kint, The Usual Suspects (1995)"));
        list.add(new Quote("May the Force be with you.", "Han Solo, Star Wars (1977)"));
        list.add(new Quote("Say hello to my little friend!", "Tony Montana, Scarface (1983)"));
        list.add(new Quote("This is Sparta!", "Leonidas, 300"));
        list.add(new Quote("Houston, we have a problem.", "Jim Lovell, Apollo 13 (1995)"));
        list.add(new Quote("You either die a hero or live long enough to see yourself become the villain.", "Harvey Dent, The Dark Knight (2008)"));
        list.add(new Quote("If you build it, he will come.", "Mysterious voice, Field of Dreams (1989)"));
        list.add(new Quote("A million dollars isn’t cool. You know what’s cool? A billion dollars.", "Sean Parker, The Social Network (2010)"));
        list.add(new Quote("I’m as mad as hell, and I’m not going to take this anymore!", "Howard Beale, Network (1976)"));
        list.add(new Quote("Keep your friends close, but your enemies closer.", "Michael Corleone, The Godfather: Part II (1974)"));
        return list;
    }
}
