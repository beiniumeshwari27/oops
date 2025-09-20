package com.codegnan.oopexamples;

public class GeometryDemo {
public static void main(String[]args) {
	Geometry shape=new Geometry();
	shape.base=10;
	shape.height=6;
	shape.sideA=5;
	shape.sideB=6;
	shape.sideC=7;
	shape.radius=7;
	System.out.println("Instance Methods");
	//with return with parameter
	double rectArea=shape.calculateRectangleArea(12,5);
	System.out.println("Rectangle Area:"+rectArea);
	//without return with parameter
	shape.printTrianglePerimeter(5,6,7);
	//without return without parameter
	shape.displayData();
	//with return without parameter
	double triangleArea=shape.storedTriangleArea();
	System.out.println("Stored Triangle area:"+triangleArea);
	//static methods
	System.out.println("Statice methods");
	//1. with return with parameter
	double circleArea=Geometry.calculateCircleArea(7);
	System.out.println("Circle Area:"+circleArea);
	//2. without return with parameter
	Geometry.printCircleCircumference(7);
	//3.without return without parameter
	Geometry.printFixedTrapeziumArea();
	//4. With return without parameter
	double fixedTriangleArea=Geometry.getFixedTriangleArea();
	System.out.println("Fixed Triangle Area:"+fixedTriangleArea);
}
}