/**
 * 
 */
package com.design.sagar.domain;

/**
 * @author seemasagar
 *
 */
public class ElevatorRequest extends Request{

	private String requestType;	
	
	/**
	 * @return the requestType
	 */
	public String getRequestType() {
		return requestType;
	}
	/**
	 * @param requestType the requestType to set
	 */
	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}
	
	
	@Override
	public String toString() {
		return "ElevatorRequest [getRequestType()=" + getRequestType() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
}
