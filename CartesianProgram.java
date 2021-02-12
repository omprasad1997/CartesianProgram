package com.blbz;
import java.util.*;
public class CartesianProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int x1,y1,x2,y2;
	        Scanner sc = new Scanner(System.in);
	        x1 = sc.nextInt();
	        y1 = sc.nextInt();
	        x2 = sc.nextInt();
	        y2 = sc.nextInt();

	        int length_of_line_1 = (int)Math.sqrt((x1-x2)^2 -(y1-y2)^2);
	        System.out.println("Length Of line 1 :"+length_of_line_1);


	        int x3,y3,x4,y4;
	        Scanner sc1 = new Scanner(System.in);
	        x3 = sc1.nextInt();
	        y3 = sc1.nextInt();
	        x4 = sc1.nextInt();
	        y4 = sc1.nextInt();

	        int length_of_line_2 = (int)Math.sqrt((x3-x4)^2 -(y3-y4)^2);

	        System.out.println("Length Of line 2 :"+length_of_line_2);

	        
	        Integer len_of_line1 = length_of_line_1;
	        Integer len_of_line2 = length_of_line_2;
	        
	       int value =  len_of_line1.compareTo(len_of_line2);
	       System.out.println(value);

	        if(value==0)
	            System.out.println("Two lines are equal");
	        else if(value > 0)
	            System.out.println("Line 1 is greater than Line 2");
	        else
	            System.out.println("Line 1 is less than Line 2");
	}

}
