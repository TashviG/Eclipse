//Question 5: A robot is sitting on the upper let hand corner of an NxN grid. 
//The robot can only move in two directions: right and down to the lower right hand corner. 
//There are certain squares which are “of limits” such that the robot cannot step on them. 
//The grid size N = 2, 3, and 4. Let M be number of “of limits”, M = 0, 1, 2, and 3, and the location of these “of limits” are random. 
//Implement a Java recursive method that outputs all possible paths for the robot for each value of M and N 
//(for a fixed value of M, present the outputs for at least 2 different locations of the M “of limits”).
//The output for a path is in this format (x,y) -> (x2,y2) -> ... -> (xt,yt).

package u3165466A1;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Question5 {

	public static void main(String[] args) {
      int N=4;  //GRID SIZE
      int olx =0; int oly =3;       //OFF LIMITS
      int olx2=1; int oly2=3;       //OFF LIMITS
      int olx3=2; int oly3=3;       //OFF LIMITS
      
      ArrayList<String>allPaths = new ArrayList<String>();
      String currPath = "";
      //buildPath2(0,0,currPath,allPaths,N, olx, oly,olx2,oly2,olx3,oly3);
      //buildPath(0,0,currPath,allPaths,N);
      
      if((olx == 0 && oly ==0) && (olx2 ==0 && oly2 ==0) && (olx3 ==0 && oly3 ==0)) {
        buildPath(0,0,currPath,allPaths,N); //NO OFF LIMITS
      }
      else{
        buildPath2(0,0,currPath,allPaths,N, olx, oly,olx2,oly2,olx3,oly3); //WITH OFF -LIMITS
      }
      
      
      System.out.println("All possible paths: " + allPaths.size());
      
      for(int i=0;i<allPaths.size(); i++) {
        System.out.print("Path" +(i +1)+": ");
        System.out.println(allPaths.get(i));
        
      } 
    }
	
	private static void buildPath(int right, int down, String path, ArrayList<String> paths, int N) { //WITHOUT OFF LIMITS
    // TODO Auto-generated method stub
    
	  if(right == N -1 && down == N-1) {
	      path+= "(" + right + "," + down + ")";
	      paths.add(path);
	      return;
	    }
	    path += "(" + right + "," + down + ")->";
	    
	    if(right == N-1) { //robot cannot go right but can go down
	      buildPath(right, down +1, path, paths,N);
	    }
	    else if(down == N-1) { //robot can go right but cannot go down
	      buildPath(right +1, down, path, paths,N);
	    }
	    else { //robot can go right and go down
	      buildPath(right +1, down, path, paths, N);
	      buildPath(right,down+1,path,paths,N);
	      
	    }
	  
  }

  //public static void buildPath

  private static void buildPath2(int right, int down, String path, ArrayList<String> paths, int N,int x, int y,int x2,int y2,int x3, int y3) { //WITH OFF-LIMITS
    // TODO Auto-generated method stub
    
    
    
    //if((right ==x && down ==y) || (right == x2 && down ==y2) || (right ==x3 && down==y3))
      //return;
    if((x !=0 || y !=0) && (right ==x && down==y))
      return;
      if((x2 !=0 || y2 !=0) && (right ==x2 && down==y2))
        return;
      if((x3 !=0 || y3 !=0) && (right ==x3 && down==y3))
        return;
      
    if(right == N -1 && down == N-1) {
      path+= "(" + right + "," + down + ")";
      paths.add(path);
      return;
    }
    path += "(" + right + "," + down + ")->";
    
    if(right == N-1) { //robot cannot go right but can go down
      buildPath2(right, down +1, path, paths,N,x,y,x2,y2,x3,y3);
    }
    else if(down == N-1) { //robot can go right but cannot go down
      buildPath2(right +1, down, path, paths,N,x,y,x2,y2,x3,y3);
    }
    else { //robot can go right and go down
      buildPath2(right +1, down, path, paths, N,x,y,x2,y2,x3,y3);
      buildPath2(right,down+1,path,paths,N,x,y,x2,y2,x3,y3);
      
    }
    }
  

}
