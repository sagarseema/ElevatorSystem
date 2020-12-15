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
		System.out.println(" Adding request to the Queue "+request.toString());
		System.out.println(" Size of the Queue " + RequestQueue.getInstance().size());
		return true;
	}

	@Override
	public boolean removeRequest(Request request) {
		RequestQueue.getInstance().remove(request);
		System.out.println(" Removing request to the Queue "+request.toString());
		return true;
	}
	/**
	 * 
	 * @return
	 */	


}
