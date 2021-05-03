import java.util.Scanner;

//Author: Tashvi Gooroochurn
//Date:19/11/16
//Ques5
//Design and implement a JAVA code that displays a triangle shape 

public class Ques5 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    	Scanner console= new Scanner(System.in);
    	
    	int row;
    	
System.out.println("Enter the no. of rows for the triangle");
		
		//reading the value of the no. of rows from console
		row= console.nextInt();

    	
    	int i, j;
        for (i = row; i >= 1; i--) { 
            for (j = 0; j < row - i; j++)
                System.out.print(' ');
            for (j = (2 - i); j < (2 - i) + (2 * i - 1); j++)
                System.out.print('$');
            System.out.println();
    }

 
}
}