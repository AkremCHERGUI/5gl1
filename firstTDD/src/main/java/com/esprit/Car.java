package com.esprit;

import java.util.Arrays;
import java.util.List;

import com.esprit.exception.CouldNotStartException;

//this is a car
public class Car {
	
	SMSModule smsModule;

	public boolean started=false;
	
	public void turnKey(String direction) {
		
		List<String> directionValues=Arrays.asList("RIGHT","LEFT");
		if(!directionValues.contains(direction)){
			
			smsModule.send("0021698555666", "message");
			
			throw new CouldNotStartException();
		}
		if("RIGHT".equals(direction)) {started=true;}
		if("LEFT".equals(direction)) {started=false;}
		
	}

	public boolean isStarted() {
		// TODO Auto-generated method stub
		return started;
	}
	
	

}
