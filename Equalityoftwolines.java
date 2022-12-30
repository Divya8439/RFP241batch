package com.bridzlabz.linecomparision;

public class Equalityoftwolines {
static Math math;
	public static void main(String[] args) {
	double x1 = 2;
	double y1 = 2;
	double x2 = 5;
	double y2 = 5;
	var z1 = Math.pow((x2 - x1),2);
	var z2 = Math.pow((y2 - y1),2);
	double a = 5;
	double b = 4;
	double c = 9;
	double d = 3;
	var a1 = Math.pow((a - b),2);
	var a2 = Math.pow((c - d),2);
	//calcute the length between the two points
	double length = Math.sqrt(z1+z2);
	double length1 = Math.sqrt(a1+a2);
	System.out.println("length between two points :" +length);	
	System.out.println("length between two points : "+length1);
	if(length == length1)
	{
		System.out.println("Both lines are equal");
	}
	else
	{
		System.out.println("Both lines are not equal");	
	}

	}

}
