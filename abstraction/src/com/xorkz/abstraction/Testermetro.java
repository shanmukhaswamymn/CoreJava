package com.xorkz.abstraction;

public class Testermetro {
	public static void main (String[] args) {
		 
		MetroDTO metro=new RED();
		
		System.out.println(metro.noofTrains);
		System.out.println(metro.noofroutes);
		System.out.println(metro.city_banglore);
			
		metro.purple();
		metro.greenline();
		metro.redline();
		metro.yellowline();
	}

}
