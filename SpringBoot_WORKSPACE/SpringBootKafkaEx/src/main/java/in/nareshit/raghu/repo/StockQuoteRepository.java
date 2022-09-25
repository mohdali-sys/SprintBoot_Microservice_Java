package in.nareshit.raghu.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.nareshit.raghu.entity.StockQuote;

public interface StockQuoteRepository 
	extends JpaRepository<StockQuote, Integer>{

}
