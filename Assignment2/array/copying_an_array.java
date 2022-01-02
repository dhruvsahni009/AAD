// to copy all elements of one array to another array 

package com.myenterprise;

import java.util.Scanner;
public class Copying_Array {
    public static void main(String[] args)
    {
        //Declaring two arrays of size 6.
        int x[] = new int[6];
        int y[] = new int[6];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 6 numbers for array: ");
        for(int i=0;i<6;i++)
        {
            x[i]=sc.nextInt(); //Taking input for array
        }
        System.out.println("Entered numbers are: ");
        for(int i=0;i<6;i++) {
            System.out.println(x[i]);
            y[i] = x[i]; 
            //Copying contents
        }
        System.out.println("Copied Array:");
        for(int i=0; i<6; i++)
        {
            System.out.println(n[i]);
        }
    }
}
