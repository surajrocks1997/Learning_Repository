package com.suraj.springAnnotationEx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Samsung {

	@Autowired
	@Qualifier("appleBionic")
	Processor mobileProcessor;
	
	public Processor getMobileProcessor() {
		return mobileProcessor;
	}

	public void setMobileProcessor(Processor mobileProcessor) {
		this.mobileProcessor = mobileProcessor;
	}

	public void config() {
		System.out.println("Best in-class processor ram and everything");
		mobileProcessor.process();
	}
}
