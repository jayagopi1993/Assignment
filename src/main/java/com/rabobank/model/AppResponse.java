package com.rabobank.model;

import java.util.List;

/**
 * 
 * @author Gopinath RM
 *
 */
public class AppResponse {
	private String responseMessage;
	private int responseCode;
	private List<Record> Records;

	public String getResponseMessage() {
		return responseMessage;
	}

	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}

	public int getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(int responseCode) {
		this.responseCode = responseCode;
	}

	@Override
	public String toString() {
		return "Error [responseMessage=" + responseMessage + ", responseCode=" + responseCode + "]";
	}

	public List<Record> getRecords() {
		return Records;
	}

	public void setRecords(List<Record> records) {
		Records = records;
	}
}
