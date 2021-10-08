package com.witsoftware.dicr.java.challenge.rest.service;

import com.witsoftware.dicr.java.challenge.rest.model.dto.ArithmeticRequest;

public interface IRequestService {

	public abstract void requestSum(final String requestUUID, final ArithmeticRequest arithmeticRequest);
	
	public abstract void requestSubtraction(final String requestUUID, final ArithmeticRequest arithmeticRequest);
	
	public abstract void requestMultiplication(final String requestUUID, final ArithmeticRequest arithmeticRequest);

	public abstract void requestDivision(final String requestUUID, final ArithmeticRequest arithmeticRequest);



	
}
