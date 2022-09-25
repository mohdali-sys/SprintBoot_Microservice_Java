package in.nareshit.raghu.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import in.nareshit.raghu.exception.ProductNotFoundException;

/**
 * If any exception is occurred at RestController and thrown
 * then this class is called
 *
 */
@RestControllerAdvice
public class MyCustomGlobalExceptionHandler {

	/**
	 * If exception raised one is ProductNotFoundException
	 * then execute below code
	 */
	@ExceptionHandler(ProductNotFoundException.class)
	public ResponseEntity<String> handleProductNotFoundException(
			ProductNotFoundException e) 
	{
		
		return new ResponseEntity<String>(
				e.getMessage(), 
				HttpStatus.INTERNAL_SERVER_ERROR); //500
	}
	
	//@ExceptionHandler(IOException.class) RE<> m1{}
	//@ExceptionHandler(AbcException.class) RE<> m2{}
}
