package com.rabobank.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.rabobank.model.Record;

/**
 * @author Gopinath RM
 *	Validate given records.
 *	(duplicate check,end balance check)
 */
public class ValidatorServiceImpl implements ValidatorService {

	/**
	 * @return List<Records>
	 * to get duplicate records form given list.
	 */
	public List<Record> getDuplicateRecords(List<Record> records) {
		Map<Integer, Record> uniqeRecords = new HashMap<Integer, Record>();
		List<Record> duplicateRecords = new ArrayList<Record>();
		for (Record record : records) {
			if (uniqeRecords.containsKey(record.getTransactionRef())) {
				duplicateRecords.add(record);
			} else {
				uniqeRecords.put(record.getTransactionRef(), record);
			}
		}
		List<Record> finalDuplicateRecords = new ArrayList<Record>();
		finalDuplicateRecords.addAll(duplicateRecords);
		for (Record record : duplicateRecords) {
			finalDuplicateRecords.add(uniqeRecords.get(record.getTransactionRef()));
		}
		return finalDuplicateRecords;
	}

	/**
	 * @return List<Records>
	 * if startbalance - mutation != endbalance then endbalance is wrong that list ll be returned.
	 */
	public List<Record> getEndBalanceErrorRecords(List<Record> records) {
		List<Record> endBalanceErrorRecords = new ArrayList<Record>();
		for (Record record : records) {
			if ((record.getStartBalance() - record.getMutation() - record.getEndBalance()) != 0) {
				endBalanceErrorRecords.add(record);
			}
		}
		return endBalanceErrorRecords;
	}

}
