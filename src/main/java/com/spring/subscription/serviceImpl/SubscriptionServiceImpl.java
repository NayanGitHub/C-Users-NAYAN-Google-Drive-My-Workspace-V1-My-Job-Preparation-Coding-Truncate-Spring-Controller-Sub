package com.spring.subscription.serviceImpl;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import com.spring.subscription.service.SubscriptionService;

@Service
public class SubscriptionServiceImpl implements SubscriptionService {

	private static final String middleString = " ... (truncated) ... ";

	@Override
	public String getOrderDetails(HttpServletRequest request) {
		return "123456789012345678901234567890";
	}

	@Override
	public String truncate(String orderDetails, int noOfCharacters) {
		if (noOfCharacters < middleString.length()) {
			return orderDetails;
		}
		StringBuilder finalString = new StringBuilder();
		String start = "";
		int index = (noOfCharacters - middleString.length()) / 2;
		if (index % 2 == 0) {
			start = orderDetails.substring(0, index);
		} else {
			start = orderDetails.substring(0, index + 1);
		}
		String end = orderDetails.substring(orderDetails.length() - index);
		if (noOfCharacters < orderDetails.length()) {
			return finalString.append(start).append(middleString).append(end).toString();
		}
		return orderDetails;
	}
}
