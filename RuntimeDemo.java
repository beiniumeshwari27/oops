package com.codegnan.oopexamples;
import java.util.Date;
public class RuntimeDemo {

	public static void main(String[] args) {
		Runtime runtime=Runtime.getRuntime();
		System.out.println("total Memory of the heap:"+runtime.totalMemory());
		System.out.println("free Memory of the heap:"+runtime.freeMemory());
		long occupiedMemory=runtime.totalMemory()-runtime.freeMemory();
		System.out.println("occupied memeory:"+occupiedMemory);
		for(int i=0;i<100000;i++) {
			Date d=new Date();
		}
		System.out.println("Total Memory of the heap:"+runtime.totalMemory());
		System.out.println("free Memory of the heap:"+runtime.freeMemory());
		long occupiedMemory1=runtime.totalMemory()-runtime.freeMemory();
		System.out.println("occupied memory:"+occupiedMemory1);
		

	}

}
