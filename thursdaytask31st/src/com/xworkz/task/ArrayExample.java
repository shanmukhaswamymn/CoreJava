package com.xworkz.task;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
	
	public static void main(String[] args) {
		
		int num[] = {5,15,48,89,63,3,22,1};
		 
		 for (int i : num) {
			 System.out.print(i +"\t");
			
		}
		 System.out.println();
		 System.out.println("sort method");
		 Arrays.sort(num);
		 for (int i : num) {
			 System.out.print(i +"\t");
			
		}
		 System.out.println();
		 System.out.println("filling the array");
		 Arrays.fill(num, 56);
		 for (int i : num) {
			 System.out.print(i +"\t");
			
		}
		System.out.println();
		 System.out.println("using math operator");
		 double[] doub =new double[5];
//		 for (int i = 0; i < doub.length; i++) {
//			 doub[i]=Math.random()*50;
//			 System.out.print(Math.round(doub[i]) +"\t");
//			 
			 Scanner scanner= new Scanner(System.in);
			 for (int j = 0; j < doub.length; j++) {
				 doub[j]=scanner.nextDouble();
                System.out.println(doub[j]);
				
			}
			
		}
	}


