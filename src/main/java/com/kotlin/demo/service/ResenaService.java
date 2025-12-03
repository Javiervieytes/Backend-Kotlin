package com.kotlin.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kotlin.demo.model.Resena;
import com.kotlin.demo.repository.ResenaRepository;

@Service
public class ResenaService {

    @Autowired
    private ResenaRepository resenaRepository;

    public List<Resena> getAllResenas() {
        return resenaRepository.findAll();
    }

    public Resena getResenaById(Long id) {
        return resenaRepository.findById(id).orElse(null);
    }

    public Resena saveResena(Resena resena) {
        return resenaRepository.save(resena);
    }

    public void deleteResena(Long id) {
        resenaRepository.deleteById(id);
    }
}
