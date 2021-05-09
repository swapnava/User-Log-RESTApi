package com.application.CustomerLog;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogService {
	@Autowired
	private LogRepository logRepository;

	public List<LogModel> getAllLog(){
		List<LogModel> logModel = new ArrayList<>();
		logRepository.findAll().forEach(logModel::add);
		return logModel;
	}
	
	public List<LogModel> getLogByDate(String date){
		String[] dateComp = date.split("/");
		int year=Integer.parseInt(dateComp[0]),month=Integer.parseInt(dateComp[1]),dayOfMonth=Integer.parseInt(dateComp[2]);
		LocalDate localdate=LocalDate.of(year, month, dayOfMonth);
		List<LogModel> logModel = new ArrayList<>();
		logRepository.findByDate(localdate.toString()).forEach(logModel::add);
		return logModel;
	}
	
	public void checkIn(String name) {
		LogModel logModel = new LogModel();
		logModel.setName(name);
		logModel.setLogType("IN");
		logModel.setDate(LocalDate.now().toString());
		String time = LocalTime.now().toString();
		logModel.setTime(time);
		logModel.setId(name, time);
		logRepository.save(logModel);
	}
	
	public void checkOut(String name) {
		LogModel logModel = new LogModel();
		logModel.setName(name);
		logModel.setLogType("OUT");
		logModel.setDate(LocalDate.now().toString());
		String time = LocalTime.now().toString();
		logModel.setTime(time);
		logModel.setId(name, time);
		logRepository.save(logModel);
	}
	
}
