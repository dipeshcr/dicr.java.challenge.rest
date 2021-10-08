package com.witsoftware.dicr.java.challenge.rest.transformer;

import java.math.BigDecimal;

import com.witsoftware.dicr.java.challenge.rest.model.Result;
import com.witsoftware.dicr.java.challenge.rest.model.dto.ResultDTO;

public interface IResultTransformer {

	public abstract Result transformFromDTO(final BigDecimal resultDTO);

	public abstract ResultDTO transformToDTO(final BigDecimal result);
}
