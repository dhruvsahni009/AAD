package com.myenterprise;

import java.util.Scanner; 

public class Fibonacci_Series {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in); 
        int f1=0,f2=1,f3; 
        System.out.println("Enter the value of N");
        int n = sc.nextInt(); 
        if(n == 1) 
        {
            System.out.println(f1);
        }
        else if(n == 2) 
        {
            System.out.println(f1+"\n"+f2);
        }
        else
        {
            System.out.println(f1+"\n"+f2); 
            for(int i = 0; i<n-2; i++) /
            {
                f3=f1+f2; 
                System.out.println(f3); 
                f1=f2;
                f2=f3;
            }
        }
    }
}
