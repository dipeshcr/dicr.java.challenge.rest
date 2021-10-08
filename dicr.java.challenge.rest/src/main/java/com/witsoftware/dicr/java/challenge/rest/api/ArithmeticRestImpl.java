package com.witsoftware.dicr.java.challenge.rest.api;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.witsoftware.dicr.java.challenge.rest.model.dto.ArithmeticRequest;
import com.witsoftware.dicr.java.challenge.rest.service.IRequestService;

@RestController
@RequestMapping("api/arithmeticOperations")
public class ArithmeticRestImpl implements IArithmeticRest {

	@Autowired
	private IRequestService requestServiceImpl;

	@Override
	@GetMapping("/soma")
	public ResponseEntity<Object> getSum(@RequestHeader(value = "requestUUID") String requestUUID,
			@RequestBody ArithmeticRequest arithmeticRequest) {

		HttpHeaders headers = setHttpHeaders(requestUUID);

		requestServiceImpl.requestSum(requestUUID, arithmeticRequest);

		return new ResponseEntity<Object>(arithmeticRequest, headers, HttpStatus.ACCEPTED);

	}


	@Override
	@GetMapping("/subtraccao")
	public ResponseEntity<Object> getSubtraction(@RequestHeader(value = "requestUUID") String requestUUID,
			@RequestBody ArithmeticRequest arithmeticRequest) {

		HttpHeaders headers = setHttpHeaders(requestUUID);
		
		requestServiceImpl.requestSubtraction(requestUUID,arithmeticRequest);

		return new ResponseEntity<Object>(arithmeticRequest, headers, HttpStatus.ACCEPTED);
	}

	@Override
	@GetMapping("/divisao")
	public ResponseEntity<Object> getDivision(@RequestHeader(value = "requestUUID") String requestUUID,
			@RequestBody ArithmeticRequest arithmeticRequest) {

		HttpHeaders headers = setHttpHeaders(requestUUID);

		requestServiceImpl.requestDivision(requestUUID,arithmeticRequest);

		return new ResponseEntity<Object>(arithmeticRequest, headers, HttpStatus.ACCEPTED);
	}

	@Override
	@GetMapping("/multiplicacao")
	public ResponseEntity<Object> getMultiplication(@RequestHeader(value = "requestUUID") String requestUUID,
			ArithmeticRequest arithmeticRequest) {

		HttpHeaders headers = setHttpHeaders(requestUUID);

		requestServiceImpl.requestMultiplication(requestUUID,arithmeticRequest);

		return new ResponseEntity<Object>(arithmeticRequest, headers, HttpStatus.ACCEPTED);
	}
	
	private HttpHeaders setHttpHeaders(String requestUUID) {
		HttpHeaders headers = new HttpHeaders();
		headers.add("requestUUID", requestUUID);
		return headers;
	}

}
