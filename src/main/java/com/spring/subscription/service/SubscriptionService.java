package com.spring.subscription.service;

import javax.servlet.http.HttpServletRequest;

/**
 * 
 * @author Nayan
 *
 */
public interface SubscriptionService {
	public String getOrderDetails(HttpServletRequest request);
	public String truncate(String orderDetails, int numberOfCharacters);
}
