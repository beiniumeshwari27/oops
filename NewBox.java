package com.codegnan.oopexamples;


	public class NewBox {
		double width;
		double height;
		double depth;
	public NewBox(double width,double height,double depth) {
		this.width=width;
		this.height=height;
		this.depth=depth;
	}

	public NewBox(Box obj) {
		width= obj.width;
		height=obj.height;
	    depth=obj.depth;
	}


	}
