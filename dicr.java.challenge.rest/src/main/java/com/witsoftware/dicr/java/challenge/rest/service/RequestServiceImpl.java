package com.witsoftware.dicr.java.challenge.rest.service;


import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.witsoftware.dicr.java.challenge.rest.model.ArithmeticOperationType;
import com.witsoftware.dicr.java.challenge.rest.model.dto.ArithmeticRequest;

@Service
public class RequestServiceImpl implements IRequestService {

	@Autowired
	private RabbitTemplate rabbitTemplate;

	@Autowired
	private TopicExchange topicExchange;

	@Override
	public void requestSum(String requestUUID, ArithmeticRequest arithmeticRequest) {

		arithmeticRequest.setRequestUUID(requestUUID);
		arithmeticRequest.setArithmeticOperationType(ArithmeticOperationType.ADDITION);
		
		rabbitTemplate.convertAndSend(topicExchange.getName(), "routing.A", arithmeticRequest);

	}

	@Override
	public void requestSubtraction(String requestUUID, ArithmeticRequest arithmeticRequest) {
		
		arithmeticRequest.setRequestUUID(requestUUID);
		arithmeticRequest.setArithmeticOperationType(ArithmeticOperationType.SUBTRACTION);
		
		rabbitTemplate.convertAndSend(topicExchange.getName(), "routing.A", arithmeticRequest);
		
	}

	@Override
	public void requestMultiplication(String requestUUID, ArithmeticRequest arithmeticRequest) {
		
		arithmeticRequest.setRequestUUID(requestUUID);
		arithmeticRequest.setArithmeticOperationType(ArithmeticOperationType.MULTIPLICATION);
		
		rabbitTemplate.convertAndSend(topicExchange.getName(), "routing.A", arithmeticRequest);
		
	}

	@Override
	public void requestDivision(String requestUUID, ArithmeticRequest arithmeticRequest) {
		
		arithmeticRequest.setRequestUUID(requestUUID);
		arithmeticRequest.setArithmeticOperationType(ArithmeticOperationType.DIVISION);
		
		rabbitTemplate.convertAndSend(topicExchange.getName(), "routing.A", arithmeticRequest);
		
	}

}
