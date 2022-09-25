package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.StockQuote;

public interface StockQuoteRepository 
extends JpaRepository<StockQuote, Integer>{

}

