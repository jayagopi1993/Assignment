package com.rabobank.testcase;

import java.io.File;
import java.util.List;

import com.rabobank.model.Record;
import com.rabobank.service.ExtractorServiceImpl;
import com.rabobank.service.ValidatorServiceImpl;

public class TestCases {

	
	public static void main(String[] args) {
		ExtractorServiceImpl ExtractorServiceImpl = new ExtractorServiceImpl();
		ValidatorServiceImpl validatorServiceImpl =  new ValidatorServiceImpl();
		try {
			//List<Records> ss = ExtractorServiceImpl.extractStatmentFromCSV(new File("D:\\records.csv"));
			List<Record> ss = ExtractorServiceImpl.extractStatmentFromXML(new File("D:\\records.xml"));
			List<Record> dup = validatorServiceImpl.getDuplicateRecords(ss);
			List<Record> enderr = validatorServiceImpl.getEndBalanceErrorRecords(ss);
			//List<Records> ss = ExtractorServiceImpl.extractStatmentFromXML(new File("D:\\records.xml"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
