package com.suraj.springAnnotationEx;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary  //we need primary when you have multiple component & primary tag will call
//			the file which has primary tag in it. But it can be overrider using 
//			qualifier tag which you can see in the Samsung.java file.
public class AppleBionic implements Processor {

	public void process() {
		// TODO Auto-generated method stub
		System.out.println("World's fastest CPU");

	}

}
