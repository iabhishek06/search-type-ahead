package com.javaproject.searchtypeahead.Service;

import com.javaproject.searchtypeahead.Entity.QueryFrequency;
import java.util.List;

public interface ISuggestionService {

    public List<QueryFrequency> getSuggestion(String query);
}
