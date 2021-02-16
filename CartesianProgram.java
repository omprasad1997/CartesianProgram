package com.blbz;
import java.util.*;
public class CartesianProgram {

	public static void main (String[] args) {
		
		LineComparison line1 = new LineComparison();
        line1.lengthCalculate(6,1,6,2);
        System.out.println("Length Of Line 1 : " + line1.lengthOfLine);

        LineComparison line2 = new LineComparison();
        line2.lengthCalculate(7,4,3,3);
        System.out.println("Length Of Line 2 : " + line2.lengthOfLine);

        Integer len1 = line1.lengthOfLine;
        Integer len2 = line2.lengthOfLine;

        LineComparison equal = new LineComparison();
        System.out.println("Check whether two lines are equal : " + equal.checkEquality(len1,len2));
        
        LineComparison compare = new LineComparison();
        System.out.println("Result of compare : " + compare.checkComapre(len1,len2));

        if(compare.checkComapre(len1,len2)==0)
            System.out.println("Two lines are equal");
        else if(compare.checkComapre(len1,len2) > 0)
            System.out.println("Line 1 is greater than Line 2");
        else
            System.out.println("Line 1 is less than Line 2");
    }
}

class LineComparison{
    int x1,y1,x2,y2;
    Integer lengthOfLine;

    void lengthCalculate(int a1,int b1,int a2,int b2){
        lengthOfLine = (int)Math.sqrt((a1-a2)^2 -(b1-b2)^2);
    }

    boolean checkEquality(Integer len1,Integer len2)
    {
        if(len1.equals(len2))
            return true;
        else    
           return  false;
    }
    public int checkComapre(Integer first , Integer second)
    {
        int value = first.compareTo(second);
        return value;
    }
}