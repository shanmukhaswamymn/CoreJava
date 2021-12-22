package com.xworkz.flower;

import com.xworkz.flower.fruitDTO.Banana;

public class Testbanana  {
	public static void main(String[] args) {
		
		Banana banana1=new Banana((byte)85);
		
		Banana banana=new Banana();
		System.out.println(banana.colour);
		System.out.println(banana.weight);
		System.out.println(banana.protein);
		System.out.println(banana.carbhohydrates);
		System.out.println(banana.type);
		
		
		
		String fru1=banana.goodforhealth("goodforhealth");
		System.out.println("banana can"+fru1);
		
		String fru2=banana.goodfordigestion("goodfordigestion");
		System.out.println("banana can"+fru2);
		
		
		String fru3=banana. traditionalfruit ("traditionalfruit");
		System.out.println("banana can"+fru3);
		
		
		String fru4=banana.usedingodworshipping("usedingodworshipping");
		System.out.println("banana can"+fru4);
		
		
		String fru5=banana.hasseeds("hasseeds");
		System.out.println("banana can"+fru5);
		
	}
		
	}


