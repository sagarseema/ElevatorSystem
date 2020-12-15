/**
 * 
 */
package com.design.sagar.requestor;

import com.design.sagar.domain.Request;

/**
 * @author seemasagar
 *
 */
public interface ButtonInterface {
	
	public boolean onPress(Request request);
	
	public boolean onCancellation(Request request);

}
