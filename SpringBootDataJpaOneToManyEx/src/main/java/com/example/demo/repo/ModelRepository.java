package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Model;


public interface ModelRepository 
extends JpaRepository<Model, Integer> {

}

