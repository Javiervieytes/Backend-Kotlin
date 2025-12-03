package com.kotlin.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kotlin.demo.model.Resena;

public interface ResenaRepository extends JpaRepository<Resena, Long> {
}
