package week6;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);

        Scanner input = new Scanner(System.in);

        System.out.println("What is " + number1 + " + " + number2 + " ? ");
        int answer = input.nextInt();

        while (answer != number1 + number2) {
            System.out.println("Wrong answer. Try again.");
            answer = input.nextInt();
        }

        System.out.println("You get it");
    }
}
