package com.witsoftware.dicr.java.challenge.rest.transformer;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

import com.witsoftware.dicr.java.challenge.rest.model.Result;
import com.witsoftware.dicr.java.challenge.rest.model.dto.ResultDTO;

@Component
public class ResultTransformerImpl implements IResultTransformer {

	@Override
	public Result transformFromDTO(BigDecimal resultDTO) {

		Result result = new Result();
		result.setResult(resultDTO);

		return result;
	}

	@Override
	public ResultDTO transformToDTO(BigDecimal result) {

		ResultDTO resultDTO = new ResultDTO();
		resultDTO.setResult(result);

		return resultDTO;
	}

}
