package com.javaproject.searchtypeahead.Entity;


import jakarta.persistence.*;

@Entity
@Table(name = "query_frequency")
public class QueryFrequency {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "query_id")
    private long id;

    @Column(name = "query_string")
    private String query;

    @Column(name = "query_frequency")
    private long frequency;

    public QueryFrequency(String query, long frequency) {
        this.query = query;
        this.frequency = frequency;
    }

    public QueryFrequency(){

    }

    public String getWord() {
        return query;
    }

    public void setWord(String query) {
        this.query = query;
    }

    public long getFrequency() {
        return frequency;
    }

    public void setFrequency(long frequency) {
        this.frequency = frequency;
    }
}
