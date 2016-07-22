package com.week1.day5.assignment1;

public class TestMethodsAndFlow
{

	public static void main(String[] args)
	{
		MethodsAndFlow myMethodsAndFlow = new MethodsAndFlow(args);
					
		myMethodsAndFlow.outputAll();
		
		myMethodsAndFlow.outputSubset(1, 5);
		myMethodsAndFlow.outputSubset(2, 3);
		myMethodsAndFlow.outputSubset(5, 5);
		myMethodsAndFlow.outputSubset(3, 20);
		
		myMethodsAndFlow.outputSubset(1, -15);
		myMethodsAndFlow.outputSubset(-10, 5);
		myMethodsAndFlow.outputSubset(100000, 2);

	}

}
