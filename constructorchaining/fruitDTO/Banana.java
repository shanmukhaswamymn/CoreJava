package com.xworkz.flower.fruitDTO;

public class Banana extends Fruit{
	
	public String colour="yellow_red";
	public byte weight=15;
	public String protein="moreprotein";
	public String carbhohydrates=" morecarbhohydrates";
	public String type="red_banana,yellow_banana";
	
	public Banana() {
		super();
		System.out.println("banana is useful");
		}
	public Banana(byte cost) {
		this();
		System.out.println("cost of banana");
		
	}
	
	
	
	public String goodforhealth( String goodforheath) {
		return  goodforheath;
	}
	
	public String goodfordigestion( String goodfordigestion ) {
		return  goodfordigestion;
	}
	
	public String traditionalfruit( String traditionalfruit ) {
		return  traditionalfruit;
	}
	public String usedingodworshipping( String usedingodworshipping ) {
		return  usedingodworshipping;
	}
	
	public String hasseeds( String hasseeds ) {
		return  hasseeds;
	}
	
	
}

