package com.rabobank.service;

import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.HeaderColumnNameTranslateMappingStrategy;
import com.rabobank.model.Record;
import com.rabobank.model.Records;

/**
 * 
 * @author Gopinath RM
 *	class to extract the uploaded file and convert to list of record java object.
 */
public class ExtractorServiceImpl implements ExtractorService {

	/**
	 * @return List<Records>
	 */
	public List<Record> extractStatmentFromCSV(File file) throws Exception {
		HeaderColumnNameTranslateMappingStrategy<Record> beanStrategy = new HeaderColumnNameTranslateMappingStrategy<Record>();
		beanStrategy.setType(Record.class);

		Map<String, String> columnMapping = new HashMap<String, String>();
		columnMapping.put("Reference", "transactionRef");
		columnMapping.put("AccountNumber", "accountNumber");
		columnMapping.put("Description", "description");
		columnMapping.put("Start Balance", "startBalance");
		columnMapping.put("Mutation", "mutation");
		columnMapping.put("End Balance", "endBalance");

		beanStrategy.setColumnMapping(columnMapping);

		CsvToBean<Record> csvToBean = new CsvToBean<Record>();
		CSVReader reader = new CSVReader(new FileReader(file));
		List<Record> records = csvToBean.parse(beanStrategy, reader);
		return records;
	}

	/**
	 * @return List<Records>
	 */
	public List<Record> extractStatmentFromXML(File file) throws Exception {
		  
        JAXBContext jaxbContext = JAXBContext.newInstance(Records.class);  
   
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();  
        Records rootRecord= (Records) jaxbUnmarshaller.unmarshal(file);  

		return rootRecord.getRecord();
	}

}
