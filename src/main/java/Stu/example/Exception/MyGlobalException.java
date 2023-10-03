package Stu.example.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
@RestControllerAdvice
public class MyGlobalException {
@ExceptionHandler(PriceAboveException.class)
public ResponseEntity<Object>handlePrice(PriceAboveException p){
	return new ResponseEntity<Object>("please enter valid price",HttpStatus.BAD_REQUEST);
}
@ExceptionHandler(ModelNotFoundException.class)
public ResponseEntity<Object>handleModel(PriceAboveException p){
	return new ResponseEntity<Object>("please enter valid price",HttpStatus.BAD_REQUEST);
}
}
