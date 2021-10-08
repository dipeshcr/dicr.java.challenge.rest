package com.witsoftware.dicr.java.challenge.rest.api;

import org.springframework.http.ResponseEntity;

import com.witsoftware.dicr.java.challenge.rest.model.dto.ArithmeticRequest;

public interface IArithmeticRest {

	public abstract ResponseEntity<Object> getSum(final String requestUUID, final ArithmeticRequest arithmeticRequest);
	
	public abstract ResponseEntity<Object> getSubtraction(final String requestUUID,final ArithmeticRequest arithmeticRequest);
	
	public abstract ResponseEntity<Object> getDivision(final String requestUUID,final ArithmeticRequest arithmeticRequest);
	
	public abstract ResponseEntity<Object> getMultiplication(final String requestUUID, final ArithmeticRequest arithmeticRequest);


}
