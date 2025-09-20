package com.codegnan.oopexamples;

public class NewMain {

	public static void main(String[] args) {
		NewBox mybox1=new NewBox(2.0,3.0,5.0);
		double vol;
		vol=mybox1.height*mybox1.width*mybox1.depth;
		System.out.println("Box 1 volume:"+vol);
		NewBox mybox2=new NewBox(3.0,5.0,6.0);
		vol=mybox2.height*mybox2.width*mybox2.depth;
		System.out.println("Box 2 volume:"+vol);

	}

}
