package com.javaproject.searchtypeahead.Service;


import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TopKSuggestionsCache implements SuggestionsCache { // a specific type of cache based on trie



    private final SuggestionsDataStructure dataStructure;

    public TopKSuggestionsCache(SuggestionsDataStructure dataStructure){
        this.dataStructure = dataStructure;
    }


//    int thresHold = 5;
//    TrieNode root;
//
//
//    public void initTrie(){
//        // talk to DB, fetch all key value pair, then make a trie
//    }
//
//    public TopKSuggestionsCache(){  // //constructor based DI
//        //logic to initialize the trie
//    }
//
//    public swich_root(){
//        // this method will be called when a thread will update the trie
//        // after fetching new data from db and will ask the root to point to
//        // new root and leave the old root
//
//        // root will depend on the new queries fetched fom the db
//    }
}
