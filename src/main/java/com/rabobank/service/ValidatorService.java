package com.rabobank.service;

import java.util.List;

import com.rabobank.model.Record;

public interface ValidatorService {
	
	public List<Record> getDuplicateRecords(List<Record> records);
	
	public List<Record> getEndBalanceErrorRecords(List<Record> records);

}
