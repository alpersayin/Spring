package com.alpersayin.com;

import org.springframework.stereotype.Component;

@Component
public class Dizel implements Motor {

	@Override
	public String start() {
		// TODO Auto-generated method stub
		return "Start Dizel motor.";
	}

	@Override
	public String stop() {
		// TODO Auto-generated method stub
		return "Stop Dizel motor.";
	}

}
