package com.application.CustomerLog;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogController {
	@Autowired
	private LogService logService;
	
	@GetMapping(value="/checkIn")
	public void checkin(@RequestParam("name") String name) {
		logService.checkIn(name);
	}
	
	@GetMapping(value="/checkOut")
	public void checkout(@RequestParam("name") String name) {
		logService.checkOut(name);
	}
	
	@GetMapping(value="/getLog")
	public List<LogModel> getLogByDate(@RequestParam("date") String date) {
		return logService.getLogByDate(date);
	}
	
	@GetMapping(value="/getAllLog")
	public List<LogModel> getAllLog(){
		return logService.getAllLog();
	}
}
