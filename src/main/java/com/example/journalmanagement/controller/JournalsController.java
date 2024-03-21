package com.example.journalmanagement.controller;

import com.example.journalmanagement.model.Journal;
import com.example.journalmanagement.repositories.JournalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class JournalsController {

    @Autowired
    private JournalRepository journalRepository;

    @GetMapping(value = "/jounals")
    public ResponseEntity<List<Journal>> getAllJournals(){
        List<Journal> journals = journalRepository.findAll();
        return ResponseEntity.ok(journals);
    }

}



