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
	private String destFloor;
	

	/**
	 * @return the destFloor
	 */
	public String getDestFloor() {
		return destFloor;
	}


	/**
	 * @param destFloor the destFloor to set
	 */
	public void setDestFloor(String destFloor) {
		this.destFloor = destFloor;
	}


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


	public InternalButtonImpl(String buttonType, String scrFloor, String destFloor, String elevatorId) {
		super(buttonType, scrFloor);
		this.elevatorId = elevatorId;
		this.destFloor = destFloor;
	}

	
}
