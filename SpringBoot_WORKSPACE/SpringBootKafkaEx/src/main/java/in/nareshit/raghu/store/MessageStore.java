package in.nareshit.raghu.store;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import in.nareshit.raghu.entity.StockQuote;
import in.nareshit.raghu.repo.StockQuoteRepository;

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
