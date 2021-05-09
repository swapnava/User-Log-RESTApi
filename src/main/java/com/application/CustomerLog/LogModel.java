package com.application.CustomerLog;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LogModel {
	@Id
	private String id;
	private String name;
	private String logType;
	private String date;
	private String time;
	
	public String getId() {
		return id;
	}
	public void setId(String name, String time) {
		id = name+time;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLogType() {
		return logType;
	}
	public void setLogType(String logType) {
		this.logType = logType;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
}
