package com.xworkz.gunTask;

public class BulletDTO {
	private float grams;
	private double mm;
	private String component;
	
	public float getGrams() {
		return grams;
	}
	public void setGrams(float grams) {
		this.grams = grams;
	}
	public double getMm() {
		return mm;
	}
	public void setMm(double mm) {
		this.mm = mm;
	}
	public String getComponent() {
		return component;
	}
	public void setComponent(String component) {
		this.component = component;
	}
	
	@Override
	public String toString() {
		return "BulletDTO [grams=" + grams + ", mm=" + mm + ", component=" + component + "]";
	}
	
	
	

}
