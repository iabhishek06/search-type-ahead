package com.javaproject.searchtypeahead.Dao;

import com.javaproject.searchtypeahead.Entity.QueryFrequency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QueryRepository extends JpaRepository<QueryFrequency, Long> {
}

