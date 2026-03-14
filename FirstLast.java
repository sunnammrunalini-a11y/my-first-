package com.basicprograms;

public class FirstLast {

	public static void main(String[] args) 
	{
		int x=879564982;
		int first=0;
		int last=0;
		last=x%10;//9897%10=7(takes last value,where it leaves 7 as remainder)
		System.out.println(last);//prints 7 as last as it is the last digit
		while(x!=0)//9897!=0 true
		{
			first=x%10;//9897%10=7 //989%10=9 //98%10=9 //9%10 false loop terminates
			x/=10;//9897/=10 =>989 //989/=10 =>98 //98/=10 =>9 takes 9 as the output
		}
		System.out.println(first);// prints 9 as the first 
		System.out.println("Sum of first and last digit is"+" "+(first+last));
	}

}
