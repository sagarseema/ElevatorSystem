/**
 * 
 */
package com.design.sagar.controller.impl;

import com.design.sagar.controller.ElevatorController;
import com.design.sagar.domain.ElevatorRequest;

/**
 * @author seemasagar
 *
 */
public class ElevatorControllerImpl implements ElevatorController {

	private static final ElevatorControllerImpl instance = new ElevatorControllerImpl();

	// private constructor to avoid client applications to use constructor
	private ElevatorControllerImpl() {
	}

	public static ElevatorControllerImpl getInstance() {
		return instance;
	}

	@Override
	public boolean moveElevator(ElevatorRequest request) {
		// TODO Auto-generated method stub
		return false;
	}

}
