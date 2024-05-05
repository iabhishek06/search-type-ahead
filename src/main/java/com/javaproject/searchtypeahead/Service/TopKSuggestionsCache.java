package com.javaproject.searchtypeahead.Service;


import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TopKSuggestionsCache implements SuggestionCache { // a specific type of cache based on trie



    private final SuggestionsDataStructure dataStructure;

    public TopKSuggestionsCache(SuggestionsDataStructure dataStructure){
        this.dataStructure = dataStructure;
    }


}
