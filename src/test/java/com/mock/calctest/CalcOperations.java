package com.mock.calctest;

public class CalcOperations {
	
	CalcInterface calcIObj;
	
	public CalcOperations(CalcInterface calcIObj)
	{
		this.calcIObj = calcIObj;
	}
	
	
	public Boolean checkSumIsPrime(int a, int b)
	{
		int numToCheck = calcIObj.add(a, b);
		Boolean flag = true;
		for(int i = 2; i <= numToCheck/2; ++i)
        {
			if(numToCheck % i == 0)
            {
			System.out.println("Not a Prime NUmber");
               flag = false;
               break;
            }
        }
		if(!flag)
		{
			 System.out.println("Prime Number");
			
		}
		return flag;
	}
	public Boolean checkMultiplyOutputIsEven(int a, int b)
	{
		int numToCheck = calcIObj.multiply(a, b);
		Boolean flag = true;
		if(numToCheck%2 != 0)
		{
			flag  = false;
		}
		return flag;
	}
	
	
	
	public static void main(String ...args)
	{
		CalcOperations op = new CalcOperations(new CalcImpl());
		System.out.println(op.checkSumIsPrime(2, 3));
	}

}
