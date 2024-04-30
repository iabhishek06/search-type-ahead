package com.javaproject.searchtypeahead.Service;

import java.util.List;

public interface SuggestionsDataStructure {


    void init(int maxSuggestions);
    // this method will initialize the data structure when it will be called

    List<Suggestion> getTopSuggestions(String query);
}
