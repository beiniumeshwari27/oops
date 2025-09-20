package com.codegnan.oopexamples;

public class Trignometry {
	double length;
	double width;
	double radius;
	double side;
	double base;
	double height;
	double base1;
	double base2;
	static final double PI=3.14159;
	public static double rectangleArea(double length,double width) {
		return length*width;
	}
	public static double circleArea(double radius) {
		return PI*radius*radius;
	}
	public static double squareArea(double side) {
		return side*side;
	}
	public static double triagleArea(double base,double height) {
		return 0.5*base*height;
		}
	public static void main(String[] args) {
		System.out.println("Rectangle area: "+Trignometry.rectangleArea(6, 4));
		System.out.println("circle area: "+Trignometry.circleArea(7));
		System.out.println("square area: "+Trignometry.squareArea(5));
		System.out.println("Triangle area: "+Trignometry.triagleArea(3, 4));
	}

	}

	