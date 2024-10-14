package week6;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer(the input ends if it is 0): ");
        int n = sc.nextInt();
        int sum = 0;
        while (n != 0) {
            sum = sum + n;
            System.out.println("Enter an integer(the input ends if it is 0): ");
            n = sc.nextInt();
        }
        System.out.println("the sum is: " + sum);
    }
}
