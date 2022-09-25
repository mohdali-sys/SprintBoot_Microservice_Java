package in.nareshit.raghu.util;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import in.nareshit.raghu.entity.StockQuote;

@Component
public class JsonUtil {

	//Object-->JSON
	public String toJosn(StockQuote sq) {
		try {
			return new ObjectMapper().writeValueAsString(sq);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	//JSON->Object
	public StockQuote fromJson(String json) {
		try {
			return new ObjectMapper().readValue(json, StockQuote.class);
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return null;
	}
}
