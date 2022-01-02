package Assignment;

import java.util.Scanner;

public class J022_Neon {

    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);

        int x= sc.nextInt();
        int sum = 0;
        int s = x*x;
        while (s>0){
            sum += s%10;
            s = s/10;
        }
        if (x== sum){
            System.out.println(x+" is a Neon number");
        }
        else{
            System.out.println(x+" is NOT a Neon number");
        }
    }
}
