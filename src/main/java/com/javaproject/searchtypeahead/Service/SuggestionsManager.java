package com.javaproject.searchtypeahead.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class SuggestionsManager {

    private final SuggestionsManager suggestionsManager;

    @Autowired
    public SuggestionsManager(SuggestionsManager suggestionsManager){
        this.suggestionsManager = suggestionsManager;
    }

    public List<Suggestion> getSuggestions(String query){
        if(query.length() > Constants.MAX_QUERY_SIZE){
            throw new RuntimeException("length out of limit");
        }

        query = query.toLowerCase(); // and other logics specific to manager

        return this.suggesionCache.getCachedSuggestions(query);
    }

}
