import java.util.Scanner;

//Author: Tashvi Gooroochurn
//Date:19/11/16
//Ques2
//Write a program to take a number as input and determine if it is 
//a multiple of 7 (It may be wise to
//limit the size of the input number).
public class Ques2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner console= new Scanner(System.in);
	
		//variable declaration
		int num;
		int remainder;
		
		
		//Prompt line
		System.out.println("Enter a number between 1 and 50");
		
		//reading the value of num from console
		num= console.nextInt();
		remainder=num%7;
		if (num%7==0)
		{
			
			System.out.println(num + " is a multiple of 7" + " Remainder= "+ remainder);
		}
		else
		{
			System.out.println(num + " is not a multiple of 7" + " Remainder= "+ remainder);
		}
			
	}
}


