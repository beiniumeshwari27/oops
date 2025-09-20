package com.codegnan.oopexamples;

public class Geometry {
	//instance variables
		double base,height;
		double sideA,sideB,sideC;
		double radius;
		static final double PI=3.14159;//static variables
		//--instance methods in all 4 possible combinations---
		//1. With return With parameter calculate rectangle area
		public double calculateRectangleArea(double length,double breadth) {
			return length*breadth;
		}
		//without return with parameter>print triangle perimeter
		public void printTrianglePerimeter(double a,double b,double c) {
			double perimeter=a+b+c;
			System.out.println("Triangle perimeter:"+perimeter);
		}
		//without return without parameter
		public void displayData() {
			System.out.println("Stored Dimensions");
			System.out.println("Base:"+base+"Height:"+height);
			System.out.println("Sides"+sideA+","+sideB+","+sideC);
			System.out.println("Radius:"+radius);
		}
		//with return without parameter
		public double storedTriangleArea() {
			return 0.5*base*height;
		}
		//Static Methods
		//1. with return with parameters calculate circle area
		public static double calculateCircleArea(double radius) {
			return PI*radius*radius;
		}
		//2.without return with parameter
		public static void printCircleCircumference(double radius) {
			double circumference=2*PI*radius;
			System.out.println("Circle Circumference:"+circumference);
		}
		//3.Without return without parameters
		public static void printFixedTrapeziumArea() {
			double a=8,b=6,h=4;
			double area=((a+b)/2)*h;
			System.out.println("Area of Trapezium:"+area);
			
		}
		//4.with return without parameter
		public static double getFixedTriangleArea() {
			double base=5,height=3;
			return 0.5*base*height;
		}
}