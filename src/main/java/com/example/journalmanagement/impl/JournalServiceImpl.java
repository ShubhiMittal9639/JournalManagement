package com.example.journalmanagement.impl;

import com.example.journalmanagement.model.Journal;
import com.example.journalmanagement.repositories.JournalRepository;
import com.example.journalmanagement.services.JournalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class JournalServiceImpl implements JournalService {

    @Autowired
    JournalRepository journalRepository;

    @KafkaListener(topics = "user-events", groupId = "journal-consumer")
    public void consume(String msg) {
        Journal journal = new Journal();
        journal.setMessage(msg);
        journal.setTimeStamp(LocalDateTime.now());
        journalRepository.save(journal);
    }
}
