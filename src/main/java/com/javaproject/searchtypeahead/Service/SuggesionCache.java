package com.javaproject.searchtypeahead.Service;

import java.util.List;

public interface SuggesionCache {

    List<Suggestion> getCachedSuggestions(String query);

}
