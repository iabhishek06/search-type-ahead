package com.javaproject.searchtypeahead.Controller;

import com.javaproject.searchtypeahead.Service.ISuggestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/search")
public class QueryController {

    @Autowired
    private ISuggestionService iSuggestionService;

    @GetMapping("/query")
    public List<String> getSuggestion(String query){
        return null;
    }


}
