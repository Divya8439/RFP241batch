package com.bridzlabz.linecomparision;

public class linebasedprograms {

	public static void main(String[] args) {
		double x1 = 3;
		double y1 = 3;
		double x2 = 2;
		double y2 = 2;
		
		var z1 = ((x2-x1)*(x2-x1));
		var z2 = ((y2-y1)*(y2-y1));
		
		
		//calculate the length between two points
		double length = Math.sqrt(z1+z2);
		System.out.println("Distance between two points :"+length);
				

	}

}
