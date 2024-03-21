package com.example.journalmanagement.repositories;

import com.example.journalmanagement.model.Journal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JournalRepository extends JpaRepository<Journal, Long> {



}
