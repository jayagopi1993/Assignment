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

	public Records(List<Record> record) {
		super();
		this.record = record;
	}

	private List<Record> record;

	@XmlElement(name="record")
	public List<Record> getRecord() {
		return record;
	}

	public void setRecord(List<Record> record) {
		this.record = record;
	}

}
