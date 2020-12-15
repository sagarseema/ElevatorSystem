/**
 * 
 */
package com.design.sagar.requestor.impl;

import com.design.sagar.requestor.ButtonInterface;

/**
 * @author seemasagar
 *
 */
public class InternalButtonImpl extends ButtonImpl implements ButtonInterface {

	private String elevatorId;
	

	/**
	 * @return the elevatorId
	 */
	public String getElevatorId() {
		return elevatorId;
	}


	/**
	 * @param elevatorId the elevatorId to set
	 */
	public void setElevatorId(String elevatorId) {
		this.elevatorId = elevatorId;
	}


	public InternalButtonImpl(String buttonType, String floor, String elevatorId) {
		super(buttonType, floor);
		this.elevatorId = elevatorId;
	}

	
}
