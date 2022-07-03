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
        list.add(new Quote("quote1", "author1"));
        list.add(new Quote("quote2", "author2"));
        list.add(new Quote("quote3", "author3"));
        list.add(new Quote("quote4", "author4"));
        list.add(new Quote("quote5", "author5"));
        return list;
    }
}
