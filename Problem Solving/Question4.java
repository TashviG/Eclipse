//QUESTION 4
//You are given a list of student information in a CSV file that contains the following information: 
//student ID, first name, last name, final mark, and final grade. Your task is to rearrange them according to their final mark in decreasing order. 
//If two students have the same final mark, then arrange them according to their first name in alphabetical order. 
//If those two students also have the same first name, then arrange them according to their last name in alphabetical order. 
//If those two students also have the same last name, then order them according to their student ID in ascending order. 
//No two students have the same student ID. The sorted list is output to another CSV file.

package u3165466A1;

import  java.io.*; 
import  java.util.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Question4 {

	public static final String csvpath = "unorderedList.csv"; //INPUT FILE
	public static final String outpath = "orderedlist.out"; //OUTPUT FILE
	public static boolean append_to_file =true;
	public static ArrayList<String> aList = new ArrayList<String>();
	
	public static void main(String[] args) throws IOException {
		
		
		
		//String path = ("C:/Users/Tashvi G/eclipse-workspace/u3165466A1/unorderedList.csv");
		
		// TODO Auto-generated method stub
		readAllLinesFromFile(csvpath);
		// System.out.println("Unsorted:\n");
		    //for(String aStudentString: aList){
		       // System.out.println(aStudentString +"\n");
		    //}

		    
		    //ArrayList<Student> students = convertToStudents(aList);
		    //System.out.println("SORTED:\n");
		    //for(Student student : students){
		        //System.out.println(student.toString());
		    	
		    	
		    
		    
		    writeAllLinesToFile(outpath, aList, append_to_file);
		    
		    
	}
		
		
		
		//writeAllLinesToFile("C:/Users/Tashvi G/eclipse-workspace/u3165466A1/orderedList.out",StudentList, true);
	//}

public static ArrayList<String> readAllLinesFromFile(String path) throws IOException{  
	//ArrayList<String> aList = new ArrayList<String>();  
	
	FileReader fileReader = new FileReader(path);         
	BufferedReader bufferedReader = new BufferedReader(fileReader);         
	String line = null;         
	while( (line = bufferedReader.readLine()) != null){          
		aList.add(line);
		//System.out.print(line + "\n");
		}         
	bufferedReader.close();        
	return aList;
	}
//}

public static ArrayList<Student> convertToStudents(ArrayList<String> studentsStrings) {
    ArrayList<Student> students = new ArrayList<>();
    studentsStrings.remove(0);
    for(String studentString : studentsStrings) {
        String[] parts = studentString.split(",");
        int StudentID = Integer.valueOf(parts[0]);
        String FirstName = parts[1];
        String LastName = parts[2];
        double Score = Double.valueOf(parts[3]);
        String Grade = parts[4];
        students.add(new Student(StudentID, FirstName, LastName, Score, Grade));
    }

    Collections.sort(students);
    
    //System.out.println("Sorted list:");
    //for(int i = 0; i < students.size(); i++){
        //System.out.printf("%s %s %s %s %s \n", 
//students.get(i).StudentID, students.get(i).FirstName,students.get(i).LastName,students.get(i).Score,students.get(i).Grade);
   // }
	return students;

    
    
   /* Collections.sort(students, new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.compareTo(o2);
        } 
    });
    return students;*/
	
}


public static void writeAllLinesToFile(String path, ArrayList<String> allLines, boolean append_to_file) throws IOException{ 
	//ArrayList<String> aList = new ArrayList<String>();       
	FileWriter fileWriter = new FileWriter(path, append_to_file);      
	PrintWriter printWriter = new PrintWriter(fileWriter); 
	
	ArrayList<Student> students = convertToStudents(aList);
	//for (String line : allLines){  
	for(int i = 0; i < students.size(); i++){
		//printWriter.printf("%s" + "%n", line);      
		printWriter.printf("%s %s %s %s %s \n", students.get(i).StudentID, students.get(i).FirstName,students.get(i).LastName,students.get(i).Score,students.get(i).Grade);
		}       
	printWriter.close();
	}
}
