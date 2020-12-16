/**
 * 
 */
package com.design.sagar.controller.impl;

import com.design.sagar.controller.RequestController;
import com.design.sagar.data.RequestQueue;
import com.design.sagar.domain.Request;

/**
 * @author seemasagar
 *
 */
public class RequestControllerImpl implements RequestController {

	private static final RequestControllerImpl instance = new RequestControllerImpl();

	// private constructor to avoid client applications to use constructor
	private RequestControllerImpl() {
	}

	public static RequestControllerImpl getInstance() {
		return instance;
	}

	@Override
	public boolean addRequest(Request request) {
		RequestQueue.getInstance().add(request);
		if (request.getRequestType().equalsIgnoreCase("INT")) {
			System.out.println(" Adding request to the Queue for priority " + request.getPriority() + " Direction "
					+ request.getDirection() + " from " + request.getSrcFloor() + " from elevator "
					+ request.getElevatorId());
		} else if (request.getRequestType().equalsIgnoreCase("EXT")) {
			System.out.println(" Adding request to the Queue for priority " + request.getPriority()
					+ " for sendig elevator to " + request.getSrcFloor() + " for going " + request.getDirection());
		}
		return true;
	}

	@Override
	public boolean removeRequest(Request request) {
		// will remove the row if present matched by equals method
		RequestQueue.getInstance().remove(request);
		if (request.getRequestType().equalsIgnoreCase("INT")) {
			System.out.println(" Removing request to the Queue for priority " + request.getPriority() + " Direction "
					+ request.getDirection() + " from " + request.getSrcFloor() + " from elevator "
					+ request.getElevatorId());
		} else if (request.getRequestType().equalsIgnoreCase("EXT")) {
			System.out.println(" Removing request to the Queue for priority " + request.getPriority() + " for going "
					+ request.getDirection() + " from " + request.getSrcFloor());
		}
		return true;
	}
	/**
	 * 
	 * @return
	 */

}
