package week6;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        int data;
        int sum = 0;

        Scanner sc = new Scanner(System.in);

        do{
            System.out.print("Enter an integer(the input ends if it is 0): ");
            data = sc.nextInt();
            sum += data;
        }while(data != 0);
        System.out.println("The sum is: " + sum);
    }
}
