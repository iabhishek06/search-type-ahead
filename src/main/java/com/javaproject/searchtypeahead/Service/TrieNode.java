package com.javaproject.searchtypeahead.Service;


import java.util.ArrayList;
import java.util.List;

public class TrieNode {

    private boolean isEndOfWord;

    private List<Suggestion> topSuggestions;
    private final List<TrieNode> pointers; // point to every node

    public TrieNode(){
        this.isEndOfWord = false;
        this.topSuggestions = new ArrayList<>();

        this.pointers = new ArrayList<>();

        for(int i=0;i<26;i++){
            this.pointers.add(null);  // adding nulls means from the root, no any edges are coming out
                                        // there is no any edge that corresponds to a, b, c , etc
        }
    }

    public boolean isEndOfWord(){
        return isEndOfWord;
    }

    public List<TrieNode> getPointers(){
        return pointers;
    }

    public List<Suggestion> getTopSuggestions(){
        return topSuggestions;
    }

    public void setEndOfWord(boolean endOfWord){
        isEndOfWord = endOfWord;
    }

    public void setTopSuggestions(List<Suggestion> topSuggestions){
        this.topSuggestions = topSuggestions;
    }
}
