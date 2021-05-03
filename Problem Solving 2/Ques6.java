//Author: Tashvi Gooroochurn
//Date:19/11/16
//Ques6
//Write a program that takes as input a text file and computes the distribution of last letters of each
//word in the file
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ques6 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        try{
            readFile("names.txt");
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }

    }
    
    public static void readFile(String filename) throws IOException 
    {
        //BufferedReader inFile = new BufferedReader(new FileReader(filename));
        Scanner sc = new Scanner(new File(filename));

        String line =  sc.next();
        String Str1=line.toLowerCase() ;
        int size=Str1.length();
        System.out.println(Str1.charAt(size-1));
        
        while(sc.hasNext()) 	
        {
        	  line =  sc.next();
        	   Str1=line.toLowerCase() ;
              size=Str1.length();
             System.out.println(Str1.charAt(size-1));
           
         
        }
        
        sc.close();
        
    }

}

		



