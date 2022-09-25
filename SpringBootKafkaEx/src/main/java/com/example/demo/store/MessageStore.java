package com.example.demo.store;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.StockQuote;
import com.example.demo.repo.StockQuoteRepository;

@Component
public class MessageStore {

	@Autowired
	private StockQuoteRepository repo;

	public void add(StockQuote quote) {
		repo.save(quote);
	}

	public List<StockQuote> getAll() {
		return repo.findAll();
	}

}
