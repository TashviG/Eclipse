//QUESTION 2
//You are given two sorted arrays A and B of lengths n and m, respectively.
//Write a Java method that returns an array C containing elements common to A and B. 
//The array C should be free of duplicates. 

package u3165466A1;
import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Question2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a = new int [] {1,2,3,3,5,5,5,7,8,9}; //DECLARE ARRAY A
		int [] b = new int [] {5,6,7,8,8,9,9}; //DECLARE ARRAY B
        int [] c =findCommonElements(a, b); //DECLARE ARRAY C WHICH FINDS COMMON ELEMENTS IN A AND B
        
        System.out.print("Output A: " + Arrays.toString(a) + "\n");
		System.out.print("Output B: " + Arrays.toString(b) + "\n");
		// System.out.print("Length of C: " + Arrays.toString(d) + "\n");
		System.out.print("Output C: " + Arrays.toString(c)+ "\n");
        
       
       //System.out.println(" cebcc" + Arrays.toString(c));
	}
	
	public static int[] findCommonElements(int[] A, int[] B) {
		 int aIndex=0;
		 int bIndex =0;
		 int cIndex=0;
		 
		 int checkDuplicate =0;
		 
		 int length =(A.length- B.length) > 0? A.length : B.length;
		 int[] temp= new int[length];
		 
		 while(aIndex < A.length && bIndex < B.length) {
		 if (A[aIndex] > B[bIndex])
		 {
			 bIndex++;
		 }
		 else if (A[aIndex] > B[bIndex]) {
			 aIndex++;
		 }
		 else if (A[aIndex] < B[bIndex]) {
			 aIndex++;
		 }
		 else {
			 checkDuplicate = A[aIndex];
			 temp[cIndex]= A[aIndex];
			 aIndex++;
			 bIndex++;
			 cIndex++;
		 }
		 }
		 
		 while (aIndex<A.length && A[aIndex]== checkDuplicate) {
			 aIndex++;
		 }
		 
		 while(bIndex<B.length && B[bIndex]==checkDuplicate) {
			 bIndex++;
		 }
		
		 int[]d= Arrays.copyOf(temp,cIndex);
		 System.out.println();
		return d;
}
		
}
         
        