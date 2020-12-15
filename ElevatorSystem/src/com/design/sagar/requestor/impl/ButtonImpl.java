/**
 * 
 */
package com.design.sagar.requestor.impl;

import com.design.sagar.controller.impl.RequestControllerImpl;
import com.design.sagar.domain.Request;
import com.design.sagar.requestor.ButtonInterface;

/**
 * @author seemasagar
 *
 */
public class ButtonImpl implements ButtonInterface {

	private String buttonType;
	private String floor;

	public ButtonImpl(String buttonType, String floor) {
		super();
		this.buttonType = buttonType;
		this.floor = floor;
	}

	/**
	 * @return the floor
	 */
	public String getFloor() {
		return floor;
	}

	/**
	 * @param floor the floor to set
	 */
	public void setFloor(String floor) {
		this.floor = floor;
	}

	/**
	 * @return the buttonType
	 */
	public String getButtonType() {
		return buttonType;
	}

	/**
	 * @param buttonType the buttonType to set
	 */
	public void setButtonType(String buttonType) {
		this.buttonType = buttonType;
	}

	@Override
	public String toString() {
		return "ButtonImpl [buttonType=" + buttonType + ", floor=" + floor + "]";
	}

	@Override
	public boolean onPress(Request request) {
		System.out.println(" Request recieved on pressing button " + request.toString());
		RequestControllerImpl.getInstance().addRequest(request);
		return true;
	}

	@Override
	public boolean onCancellation(Request request) {
		RequestControllerImpl.getInstance().addRequest(request);
		System.out.println(" Request recieved on cancelling button " + request.toString());
		return true;
	}

}
