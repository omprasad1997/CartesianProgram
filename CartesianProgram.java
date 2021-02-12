package com.blbz;
import java.util.*;
public class CartesianProgram {

	public static int lengthOfLine()
    {
        int x1,y1,x2,y2;
        Scanner sc = new Scanner(System.in);
        x1 = sc.nextInt();
        y1 = sc.nextInt();
        x2 = sc.nextInt();
        y2 = sc.nextInt();
    
        int lengthOfLine = (int)Math.sqrt((x1-x2)^2 -(y1-y2)^2);
        
        return lengthOfLine;
    }
	public static void main (String[] args) {
		
		int lengthOfLine1 = lengthOfLine();
        
		System.out.println("Length of Line 1 :" + lengthOfLine1);

        int lengthOfLine2 = lengthOfLine();
		System.out.println("Length of Line 2 :" + lengthOfLine2);

        Integer lenOfLine1 = lengthOfLine1;
        Integer lenOfLine2 = lengthOfLine2;

        int value =  lenOfLine1.compareTo(lenOfLine2);
        System.out.println("Value :"+ value);

        if(value==0)
            System.out.println("Two lines are equal");
        else if(value > 0)
            System.out.println("Line 1 is greater than Line 2");
        else
            System.out.println("Line 1 is less than Line 2");
    }

}
