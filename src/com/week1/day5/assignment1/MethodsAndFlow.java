package com.week1.day5.assignment1;

public class MethodsAndFlow
{
	private String[] stringArray;
	
	public String[] getStringArray()
	{
		return stringArray;
	}

	public void setStringArray(String[] stringArray)
	{
		this.stringArray = stringArray;
	}

	public MethodsAndFlow(String[] stringArray)
	{
		this.stringArray = stringArray;
	}
	
	public void outputSubset(int startPosition, int numberOfValues)
	{	
		if(checkStartingPosition(startPosition))
		{
			if(checkNumberOfValues(startPosition, numberOfValues));
			{
				printSubset(startPosition, numberOfValues);
			}
		}
	}
	
	public void outputAll()
	{
		outputSubset(1, stringArray.length);
	}
	
	private Boolean checkStartingPosition(int startPosition)
	{
		if(startPosition >= 1 && startPosition <= stringArray.length)
		{
			return true;
		}
		else if(startPosition < 1)
		{
			System.out.println("Your start position value of " + startPosition + " is less than 1.");
			System.out.println("Your start position value must be between 1 and " + (stringArray.length) + ".\n");
			return false;
		}
		else if(startPosition > (stringArray.length))
		{
			System.out.print("Your start position value of " + startPosition + " is greater than the");
			System.out.println(" total number of elements in the array.");
			System.out.println("Your start position value must be between 1 and " + (stringArray.length) + ".\n");
			return false;
		}
		else
		{
			System.out.println("You have an unclassified problem with your start position value.");
			System.out.print("Please check that the value of your start position is between 1 and ");
			System.out.println(stringArray.length + ".\n");
			return false;
		}
	}
	
	private Boolean checkNumberOfValues(int startPosition, int numberOfValues)
	{
		if(numberOfValues >= 0 && (numberOfValues <= ((stringArray.length - 1) - (startPosition - 1))))
		{
			return true;
		}
		else if(numberOfValues >= 0 && (numberOfValues > ((stringArray.length - 1) - (startPosition - 1))))
		{
			return true;
		}
		else if(numberOfValues < 0) 
		{
			System.out.println("The number of values you selected to print, " + numberOfValues + ", is negative.");
			System.out.println("You must enter a value greater than or equal to zero for the number of values you want to print\n");
			return false;
		}
		else
		{
			System.out.println("You have an unclassified problem with the number of values you want to print.");
			System.out.println("Please check this value and ensure it is greater than or equal to zero for the number of values you want to print\n");
			return false;
		}
		
	}
	
	private void printSubset(int startPosition, int numberOfValues)
	{
		if(numberOfValues >= 0 && (numberOfValues <= ((stringArray.length - 1) - (startPosition - 1))))
		{
			for(int i = startPosition - 1; i < (startPosition + numberOfValues - 1); i++)
			{
				System.out.println(stringArray[i]);
			}
			System.out.println("");
		}
		else if(numberOfValues >= 0 && (numberOfValues > ((stringArray.length - 1) - (startPosition - 1))))
		{
			for(int i = startPosition - 1; i < stringArray.length; i++)
			{
				System.out.println(stringArray[i]);
			}
			System.out.println("");
		}
	}

}
