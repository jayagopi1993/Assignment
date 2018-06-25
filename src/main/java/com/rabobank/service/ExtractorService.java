package com.rabobank.service;

import java.io.File;
import java.util.List;

import com.rabobank.model.Record;
/**
 * 
 * @author Gopinath RM
 *
 */
public interface ExtractorService {

	public List<Record> extractStatmentFromCSV(File file) throws Exception;
	
	public List<Record> extractStatmentFromXML(File file) throws Exception;
	
}
