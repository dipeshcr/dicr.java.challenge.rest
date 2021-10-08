package com.witsoftware.dicr.java.challenge.rest.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.witsoftware.dicr.java.challenge.rest.model.dto.ArithmeticResponse;

@RestController
@RequestMapping("api/arithmeticOperations/resultado")
public class ResponseServiceImpl implements IResponseServiceService {

	private ArithmeticResponse arithmeticResponse;

	@Override
	@RabbitListener(queues = "queue.B")
	public void processArithmeticResponse(ArithmeticResponse arithmeticResponse) {

		this.arithmeticResponse = arithmeticResponse;
	}

	@Override
	@GetMapping
	public ResponseEntity<Object> getResult() {

		HttpHeaders headers = setHttpHeaders(arithmeticResponse.getRequestUUID());

		return new ResponseEntity<Object>(arithmeticResponse.getResultDTO(), headers, HttpStatus.OK);

	}

	private HttpHeaders setHttpHeaders(String requestUUID) {
		HttpHeaders headers = new HttpHeaders();
		headers.add("requestUUID", requestUUID);
		return headers;
	}

}
