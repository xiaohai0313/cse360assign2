package cse360assign2;

import java.util.*;
public class test {


	public static void main(String[] args) 
	{
	//	@SuppressWarnings("resource")
		Calculator myCalculator = new Calculator();
		myCalculator.add (4);
		myCalculator.subtract (2);
		myCalculator.multiply (2);
		myCalculator.add(5);
		System.out.print(myCalculator.getHistory());
		//test.print();			//print result
		
	}

}
