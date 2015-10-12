package com.esprit;

import static org.junit.Assert.*;

import org.junit.*;

import com.esprit.exception.CouldNotStartException;

public class CarTest {

	Car car;
	
	@Before
	public void setUP() throws Exception{
		//car= new Car();
	}
	
	
	@Test
	public void itshouldStartWhenKeyIsTurnedRight(){
		
		String direction="RIGHT";
		car.turnKey(direction);
		
		assertTrue(car.isStarted());
		
	}
	
	@Test
	public void itShouldStartWhenKeyIsTurnedLeft(){
		String direction="LEFT";
		car.turnKey(direction);	
		assertFalse(car.isStarted());
	}
	
	@Test(expected=CouldNotStartException.class)
	public void itShouldThrowAnCouldNotStartExceptionWhenWrongArumentIsGiven(){
		String direction="WRONG";
		car.turnKey(direction);
	}
	
	@Test
	public void itShouldSendSMSNotificationWhenWrongArgumentIsGiven(){
		try{
		String direction="Wrong";
		car.turnKey(direction);
	} catch (CouldNotStartException e){
		
	} finally{
		
	}
	}
}
	