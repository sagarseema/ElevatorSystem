/**
 * 
 */
package com.design.sagar.data;

import java.util.PriorityQueue;

import com.design.sagar.domain.Request;

/**
 * @author seemasagar
 *
 */
public class RequestQueue extends PriorityQueue<Request> {

	private static final RequestQueue instance = new RequestQueue();

	// private constructor to avoid client applications to use constructor
	private RequestQueue() {
	}

	public static RequestQueue getInstance() {
		return instance;
	}

}
