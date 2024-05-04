package com.javaproject.searchtypeahead.Dao;

import com.javaproject.searchtypeahead.Entity.FrequencyCount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FrequencyCountRepository extends JpaRepository<FrequencyCount, Long> {

    FrequencyCount findByQuery(String query);
}

