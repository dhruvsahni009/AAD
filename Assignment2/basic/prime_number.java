package com.myenterprise;

import java.util.Scanner; 

public class Prime_Number {
    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        int flag=0; 
        System.out.println("Enter a number:");
        int n = inp.nextInt(); 
        if (n==0|n==1|n==2) 
        {
            System.out.println("Not a prime number.");
        }
        else 
        {
            for(int i=2;i<n;i++) 
            {
                if (n%i==0) { 
                    System.out.println("It is not a prime number");
                    break; 
                }
                else
                    flag = 1;
            }
        }
        if (flag == 1) 
            System.out.println("It is a prime number.");

    }
}
