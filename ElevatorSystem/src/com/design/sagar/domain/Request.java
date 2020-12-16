/**
 * 
 */
package com.design.sagar.domain;

/**
 * @author seemasagar
 *
 */
public class Request implements Comparable<Request>{

	private String requestType;
	private String elevatorId;
	private String srcFloor;
	private String destFloor;
	private Direction direction;
	private String priority;
	
	
	
	
	public Request(String requestType, String elevatorId, String srcFloor, String destFloor, Direction direction,
			String priority) {
		super();
		this.requestType = requestType;
		this.elevatorId = elevatorId;
		this.srcFloor = srcFloor;
		this.destFloor = destFloor;
		this.direction = direction;
		this.priority = priority;
	}
	/**
	 * @return the priority
	 */
	public String getPriority() {
		return priority;
	}
	/**
	 * @param priority the priority to set
	 */
	public void setPriority(String priority) {
		this.priority = priority;
	}
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
	/**
	 * @return the srcFloor
	 */
	public String getSrcFloor() {
		return srcFloor;
	}
	/**
	 * @param srcFloor the srcFloor to set
	 */
	public void setSrcFloor(String srcFloor) {
		this.srcFloor = srcFloor;
	}
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
	 * @return the direction
	 */
	public Direction getDirection() {
		return direction;
	}
	/**
	 * @param up the direction to set
	 */
	public void setDirection(Direction up) {
		this.direction = up;
	}
	@Override
	public String toString() {
		return "Request [requestType=" + requestType + ", elevatorId=" + elevatorId + ", srcFloor=" + srcFloor
				+ ", destFloor=" + destFloor + ", direction=" + direction + "]";
	}
	@Override
	public int compareTo(Request req) {
		return this.getPriority().compareTo(req.getPriority());
	}
	
	public boolean equals(Request req) {
		// TODO Auto-generated method stub
		return super.equals(req);
	}
	
	
	
	
	
}
