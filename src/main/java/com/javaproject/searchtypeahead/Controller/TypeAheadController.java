package com.javaproject.searchtypeahead.Controller;

import com.javaproject.searchtypeahead.Service.QueryUpdater;
import com.javaproject.searchtypeahead.Service.Suggestion;
import com.javaproject.searchtypeahead.Service.SuggestionsManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/search_type_ahead")
public class TypeAheadController {

    private final SuggestionsManager suggestionsManager;
    private final QueryUpdater queryUpdater;

    @Autowired
    public TypeAheadController(SuggestionsManager suggestionsManager, QueryUpdater queryUpdater){
        this.suggestionsManager = suggestionsManager;
        this.queryUpdater = queryUpdater;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/suggestions")
    public List<Suggestion> getSuggestionsForQuery(@RequestParam String query){

        if(query == null || query.length() == 0){
            throw new RuntimeException("Invalid Query");
        }

        return this.suggestionsManager.getSuggestions(query);
    }


    @RequestMapping(method = RequestMethod.POST, path = "/update")
    public String updateQueries(String query){

        if(query == null || query.length() = 0){
            throw new RuntimeException("Invalid Query");
        }

        this.queryUpdater.update(query);
        return "Successfully updated...";
    }
}
