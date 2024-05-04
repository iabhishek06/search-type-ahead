package com.javaproject.searchtypeahead.Service;

public class Suggestion {

    // Query("app") -> apple(900),appy,...
    // TrieNode(isEndOfWord,List<Suggestion>)


    private final String suggestedText;
    private final int frequency;

    public Suggestion(String suggestedText, int frequency){
        this.frequency = frequency;
        this.suggestedText = suggestedText;
    }

    public String getSuggestedText(){
        return suggestedText;
    }

    public int getFrequency(){
        return frequency;
    }
}
