/**
 * 
 */
package com.design.sagar.elevator.impl;

import com.design.sagar.controller.ElevatorController;
import com.design.sagar.domain.ElevatorRequest;

/**
 * @author seemasagar
 *
 */
public class Elevator implements ElevatorController{
	
	private String elevatorId;
	private String state; 
	

	@Override
	public boolean moveElevator(ElevatorRequest request) {
		// physical movement as per the destination folder and direction
		return true;
	}

}
