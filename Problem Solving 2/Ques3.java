//Author: Tashvi Gooroochurn
//Date:19/11/16
//Ques3
//Create a program that prompts users to enter a String and check if it is a palindrome. 
import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {
    	 {
    	      String actual, flip = "";
    	      Scanner in = new Scanner(System.in);
    	 
    	      System.out.println("Enter a word to check if it is palindromic");
    	      actual = in.nextLine();
    	 
    	      int length = actual.length();
    	 
    	      for ( int i = length - 1; i >= 0; i-- )
    	         flip = flip + actual.charAt(i);
    	 
    	      if (actual.equals(flip))
    	         System.out.println("The word entered is a palindrome.");
    	      else
    	         System.out.println("The word entered is not a palindrome.");
    	 
    	   }
    	}
}
