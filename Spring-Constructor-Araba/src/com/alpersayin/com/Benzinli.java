package com.alpersayin.com;

import org.springframework.stereotype.Component;

@Component
public class Benzinli implements Motor {

	@Override
	public String start() {
		// TODO Auto-generated method stub
		return "Start Benzinli motor.";
	}

	@Override
	public String stop() {
		// TODO Auto-generated method stub
		return "Stop Benzinli motor.";
	}

}
