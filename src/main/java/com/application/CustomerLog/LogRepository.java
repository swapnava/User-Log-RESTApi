package com.application.CustomerLog;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

public interface LogRepository extends CrudRepository<LogModel,String>{
	
	public ArrayList<LogModel> findByDate(String date);
	
}
