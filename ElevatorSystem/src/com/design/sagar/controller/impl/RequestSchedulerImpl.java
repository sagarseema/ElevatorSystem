/**
 * 
 */
package com.design.sagar.controller.impl;

import java.util.Random;

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
			ElevatorRequest elevatorRequest = deriveElevatorToUse(request);
			ElevatorControllerImpl.getInstance().moveElevator(elevatorRequest);
			System.out.println(" Moving elevator " + elevatorRequest.getElevatorId()+ " for processing request with priority "+request.getPriority() + " from floor "+request.getSrcFloor()
			+ " to floor "+request.getDestFloor() + " in the direction going "+request.getDirection());
		}
		return true;
	}

	private ElevatorRequest deriveElevatorToUse(Request request) {
		// Check in data base and decide which elevator to be moved
		// sample output		
		Random rn = new Random();
		int elevatorId = rn.nextInt(5) + 1;
		ElevatorRequest elevatorRequest = new ElevatorRequest("MOVE ELEVATOR",String.valueOf(elevatorId),"2","3",Direction.UP,"1");
		return elevatorRequest;
	}

}
