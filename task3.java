package week6;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        int number=(int)(Math.random()*100);
        Scanner sc=new Scanner(System.in);
        System.out.println("Guess the number");
        int guess=sc.nextInt();
        while(number!=guess){
            if(number>guess){
                System.out.println("Your number is greater than the number");
            }
            if(number<guess){
                System.out.println("Your number is less than the number");
            }
        }
        System.out.println("Get it");
    }
}
