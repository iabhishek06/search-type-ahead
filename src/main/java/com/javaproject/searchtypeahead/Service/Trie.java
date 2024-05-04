package com.javaproject.searchtypeahead.Service;

import com.javaproject.searchtypeahead.Dao.FrequencyCountRepository;
import com.javaproject.searchtypeahead.Entity.FrequencyCount;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Trie implements SuggestionsDataStructure {


    @Autowired
    private FrequencyCountRepository queryRepository;
  // always code against interface
    private final TrieNode root;
    private int k;

    public Trie(){
        this.root = new TrieNode();
    }

    @Override
    void init(int maxSuggestions) {
        this.k = maxSuggestions;

        // code to fetch data from DB and make trie
        List<FrequencyCount> wordsList = queryRepository.findAll();
        Map<String,Integer> wordFrequencyMap = new HashMap<>();
        for(String word : wordsList){

        }
    }


    // insert a word in trie
//     public void insert(String word){
//        TrieNode curr = root;
//        for(int i=0;i<word.length();i++){
//            char ch = word.charAt(i);
//            int idx = ch - 'a';
//
//            if(curr.topSuggestion[idx] == null){
//                curr.topSuggestion[idx] = new TrieNode();
//            }
//            curr = curr.topSuggestion[idx];
//        }
//        curr.isEndOfWord = true;
//    }



    // search in trie
    @Override
    public List<Suggestion> getTopSuggestions(String query) {
        return null;
    }

}
