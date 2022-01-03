
package com.xorkz.abstraction;

public  abstract class MetroDTO {
	
	int noofTrains=20;
	byte noofroutes=3;
	String   city_banglore;
	
	public void greenline(){
    System.out.println("green line starts from majestic to nagasandra");
	
	}
	
	public void purple() {
	System.out.println("purple line starts from majestic to kuvempunagar");
	}
	public abstract void yellowline();
	public abstract void redline();
	}


