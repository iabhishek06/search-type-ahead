package com.javaproject.searchtypeahead.Service;

import java.util.List;

public interface SuggestionsDataStructure {

    // This interface likely defines methods related to managing and retrieving suggestions.


    // This method is likely used to initialize or configure the data structure.
    void init(int maxSuggestions);


    // It returns a list of Suggestion objects, likely representing the top suggestions for the given query.
    List<Suggestion> getTopSuggestions(String query);


    // This method is likely used to reload or refresh the data structure,
    // possibly to reflect changes in real-time or near real-time.
    void reload();
    // cache(RAM) <=in-sync=> table(DB)


}
