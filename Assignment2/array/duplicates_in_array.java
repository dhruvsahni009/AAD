//to print only duplicated elements of array
package com.myenterprise;

public class Duplicates_in_Array {
    public static void main(String args[])
    {
        int m[] = new int[] {1,2,2,3,4,5,6,6,7,19,19,20,21};
        for(int i = 0; i<m.length; i++) 
        {
            for(int j = i+1; j<m.length; j++) 
            {
                if(m[i]==m[j])
                    System.out.println(m[i]);
            }
        }
    }
}
