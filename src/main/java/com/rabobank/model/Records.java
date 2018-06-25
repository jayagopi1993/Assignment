package com.rabobank.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * @author Gopinath RM JAXB API XML to POJO convention
 */
@XmlRootElement
public class Records {

	public Records() {
	}

	public Records(List<Record> records) {
		super();
		this.records = records;
	}

	private List<Record> records;

	@XmlElement
	public List<Record> getRecords() {
		return records;
	}

	public void setRecords(List<Record> records) {
		this.records = records;
	}

}
