package com.suraj;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionDemo {

	public static void main(String[] args) {
		List values = new ArrayList();
		values.add(6);
		values.add(5);
		values.add(9);
		values.add(2, 7);
		
		System.out.println(values);
		
		for(Object o: values)
			System.out.println(o);
		

	}

}
