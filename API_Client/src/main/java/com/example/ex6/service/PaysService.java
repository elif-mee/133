package com.example.ex6.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ex6.model.Pays;
import com.example.ex6.repository.PaysRepository;

import jakarta.transaction.Transactional;

@Service
public class PaysService {
    private final PaysRepository paysRepository;

    @Autowired
    public PaysService(PaysRepository paysRepository) {
        this.paysRepository = paysRepository;
    }

    @Transactional
    public String addNewPays(String name) {
        Pays newPays = new Pays();
        newPays.setNom(name);
        paysRepository.save(newPays);
        return "saved";
    }
    
}
