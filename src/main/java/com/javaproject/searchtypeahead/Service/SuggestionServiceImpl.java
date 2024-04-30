package com.javaproject.searchtypeahead.Service;


import com.javaproject.searchtypeahead.Entity.QueryFrequency;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SuggestionServiceImpl implements ISuggestionService{




    @Override
    public List<QueryFrequency> getSuggestion(String query) {
        return null;
    }
}
