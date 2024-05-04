package com.javaproject.searchtypeahead.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class DBToCacheSyncManager implements Runnable{

    private final SuggestionsDataStructure dataStructure;


    @Autowired
    public DBToCacheSyncManager(SuggestionsDataStructure suggestionsDataStructure){
        this.dataStructure = suggestionsDataStructure;
    }

    @Override
    public void run(){
        sync();
    }

    public void sync(){
        while(true){
            try{
                Thread.sleep(30000);
            } catch (InterruptedException e){
                throw new RuntimeException(e);
            }
            System.out.println("starting to sync...");
            this.dataStructure.reload();
            System.out.println("finished sync...");
        }
    }

}
