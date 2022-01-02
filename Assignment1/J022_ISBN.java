package Assignment;

import java.util.Scanner;

public class J022_ISBN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 digit number: ");
        long n = sc.nextLong();
        
        long temp = n;
        int i = 1;
        long lastDig, sum = 0;
        while (temp>0){
            lastDig = temp % 10;
            sum += lastDig*i;
            temp = temp/10;
            i++;
        }
        if(sum%11 == 0) {
            System.out.println(n+" is an ISBN number");
        }
        else{
            System.out.println(n+" is NOT an ISBN number");
        }
        }
    }
