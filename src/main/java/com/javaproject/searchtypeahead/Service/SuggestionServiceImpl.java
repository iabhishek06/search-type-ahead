package com.javaproject.searchtypeahead.Service;


import com.javaproject.searchtypeahead.Entity.FrequencyCount;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SuggestionServiceImpl implements ISuggestionService{




    @Override
    public List<FrequencyCount> getSuggestion(String query) {
        return null;
    }
}
