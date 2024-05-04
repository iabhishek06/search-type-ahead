package com.javaproject.searchtypeahead.Entity;


import jakarta.persistence.*;

@Entity
@Table(name = "frequency_count")
public class FrequencyCount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "query_id")
    private long id;

    @Column(name = "query")
    private String query;

    @Column(name = "query_frequency")
    private long frequency;

    public FrequencyCount(String query, long frequency) {
        this.query = query;
        this.frequency = frequency;
    }

    public FrequencyCount(){}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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
