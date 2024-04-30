package com.javaproject.searchtypeahead.Service;

import java.util.List;

public interface SuggestionsCache {

    // we can implement different cache mechanism also in future, like hashmap, instead od Trie.
    // So,


    List<Suggestion> getTopSuggestions(String query);
}
