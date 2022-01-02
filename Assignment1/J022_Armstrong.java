package Assignment;

import java.util.Scanner;

public class J022_Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: "); 

        int n = sc.nextInt();
        int temp = n;
        int numOfDig = 0, sum = 0;
        while(temp>0){ //find number of digits
            ++numOfDig;
            temp = temp/10;
        }
        temp = n;
        while(temp>0){
            sum += (Math.pow(temp%10,numOfDig));
            temp = temp/10;
        }
        if (n == sum){
            System.out.println(n+" is an Armstrong number");
        }
        else{
            System.out.println(n+" is NOT an Armstrong number");
        }
    }
}
