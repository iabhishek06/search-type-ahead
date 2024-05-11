package com.javaproject.searchtypeahead.Service;

import com.javaproject.searchtypeahead.Entity.FrequencyCount;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.*;

public class Main {

    public static void main(String[] args){
        populateDB();
    }

    public static void populateDB(){
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("AccountPersistence");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        List<FrequencyCount> data = generateData();

        for(FrequencyCount frequencyCount : data){
            em.persist(frequencyCount);

            // it goes into DB @Entity
        }

        em.getTransaction().commit();
        em.close();

    }

    public List<FrequencyCount> generateData(){
        List<FrequencyCount> data = new ArrayList<>();
        String alphabets = "abc";
        Map<String, Integer> freqMAp = new HashMap<>();
        Random r = new Random();

        for(int i=0;i<100000;i++){
            int length = r.nextInt(1,7);
            String query = "";

            for(int j=0;j<length;j++){
                query += alphabets.charAt(r.nextInt(0,3));
            }

            if(freqMAp.containsKey(query)){
                freqMAp.put(query, freqMAp.get(query)+1);
            } else{
                freqMAp.put(query,1);
            }
        }

        for(Map.Entry<String,Integer> entry : freqMAp.entrySet()){
            FrequencyCount frequencyCount = new FrequencyCount();
            frequencyCount.setQuery(entry.getKey());
            frequencyCount.setFrequency(entry.getValue());
            data.add(frequencyCount);
        }

        return data;
    }
}
