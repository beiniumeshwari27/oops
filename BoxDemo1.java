package com.codegnan.oopexamples;

public class BoxDemo1 {
	double height;
	double width;
	double depth;
	//method without para without return type
	public void volume() {
		System.out.println("Volume is :");
		System.out.println(width*height*depth);
			}
	public double vol() {
		return height*width*depth;
	}
	public double setDim(double height,double width,double depth) {
		return height*width*depth;
	}
	public void setDimesion(double height,double width,double depth) {
		double volume=height*width*depth;
		System.out.println("Volume is:"+volume);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoxDemo1 b1=new BoxDemo1();
		b1.height=2.0;
		b1.width=3.0;
		b1.depth=5.0;
		System.out.println("b1 volume:"+b1.vol());
		System.out.println("box1 vlume:"+b1.setDim(4.0, 6.0,2.0));
		b1.setDim(-2.0,-3.0,4.0);
		BoxDemo1 b2=new BoxDemo1();
		b2.height=12.0;
		b2.width=3.0;
		b2.depth=2.0;
		b2.volume();
		System.out.println("b2 volume:"+b2.vol());
		System.out.println("box2 volume:"+b2.setDim(40.0,60.0,20.0));
		b2.setDimesion(-4.0,-3.0,6.0);
		}

}
