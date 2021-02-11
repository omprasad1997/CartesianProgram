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

		        double length_of_line = Math.sqrt((x1-x2)^2 -(x2-y2)^2);
		        System.out.println(length_of_line);
	}

}
