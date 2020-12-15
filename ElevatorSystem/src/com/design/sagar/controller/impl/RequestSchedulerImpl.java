/**
 * 
 */
package com.design.sagar.controller.impl;

import com.design.sagar.controller.RequestScheduler;
import com.design.sagar.data.RequestQueue;
import com.design.sagar.domain.Direction;
import com.design.sagar.domain.ElevatorRequest;
import com.design.sagar.domain.Request;

/**
 * @author seemasagar
 *
 */
public class RequestSchedulerImpl implements RequestScheduler {

	@Override
	public boolean assignElevator() {
		// logic to decide the elevator to support the request
		// status to be maintained in database
		// invoke method on controller to invoke the method
		Request request = RequestQueue.getInstance().poll();
		if (null != request) {
			System.out.println("Extracting from Queue " + request.toString());
			ElevatorControllerImpl.getInstance().moveElevator(deriveElevatorToUse(request));
			System.out.println(" Moving elevator ");
		}
		return true;
	}

	private ElevatorRequest deriveElevatorToUse(Request request) {
		// Check in data base and decide which elevator to be moved
		// sample output
		ElevatorRequest elevatorRequest = new ElevatorRequest();
		elevatorRequest.setRequestType("MOVE ELEVATOR");
		elevatorRequest.setElevatorId("1");
		elevatorRequest.setDestFloor("5");
		elevatorRequest.setSrcFloor("1");
		elevatorRequest.setDirection(Direction.UP);
		System.out.println(" Decided to use " + elevatorRequest.toString());
		return new ElevatorRequest();
	}

}
