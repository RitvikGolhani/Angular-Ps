package com.example.demo.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Lead;
import com.example.demo.repository.LeadRepository;


@RestController
@CrossOrigin("http://localhost:4200")
public class LeadController {
    @Autowired
    private LeadRepository leadRepository;

    @PostMapping("/create")
    public ResponseEntity<Lead> create(@RequestBody Lead lead) {
        Lead savedLead = leadRepository.save(lead);
        return new ResponseEntity<>(savedLead, HttpStatus.CREATED);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Lead>> getAll() {
        List<Lead> allLeads = leadRepository.findAll();
        return new ResponseEntity<>(allLeads, HttpStatus.OK);
    }
}
