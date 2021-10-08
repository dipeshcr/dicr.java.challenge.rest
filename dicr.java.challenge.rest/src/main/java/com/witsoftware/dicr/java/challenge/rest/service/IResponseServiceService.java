package com.witsoftware.dicr.java.challenge.rest.service;

import org.springframework.http.ResponseEntity;

import com.witsoftware.dicr.java.challenge.rest.model.dto.ArithmeticResponse;

public interface IResponseServiceService {

	public abstract void processArithmeticResponse(final ArithmeticResponse arithmeticResponse);

	public abstract ResponseEntity<Object> getResult();
	
}
