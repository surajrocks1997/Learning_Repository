package com.spring.Spring_Boot_Demo;

import org.springframework.stereotype.Component;

@Component
public class Laptop {

	private int Lid;
	private String LBrand;
	public int getLid() {
		return Lid;
	}
	public void setLid(int lid) {
		Lid = lid;
	}
	public String getLBrand() {
		return LBrand;
	}
	public void setLBrand(String lBrand) {
		LBrand = lBrand;
	}
	@Override
	public String toString() {
		return "Laptop [Lid=" + Lid + ", LBrand=" + LBrand + "]";
	}
	
	public void complie() {
		System.out.println("Compiling...");
	}
}
