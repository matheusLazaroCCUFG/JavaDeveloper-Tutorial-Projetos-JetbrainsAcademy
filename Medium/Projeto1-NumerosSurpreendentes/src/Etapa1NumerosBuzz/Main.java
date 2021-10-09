package Etapa1NumerosBuzz;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;

        System.out.println("Enter a natural number:");
        num = scan.nextInt();

        if(num > 0){ // Natural number (número natural)
            // Odd or Even (ímpar ou par)
            if(num % 2 != 0){
                System.out.println("This number is Odd.");
            }else{
                System.out.println("This number is Even.");
            }

            //Buzz
            if(num % 7 == 0 || num % 10 == 7) {
                System.out.println("It is a Buzz number.");

                System.out.println("Explanation:");

                if(num % 7 == 0 && num % 10 == 7){
                    System.out.println(
                        num +
                        " is divisible by 7 and ends with 7."
                    );
                }else
                if (num % 7 == 0) {
                    System.out.println(num + " is divisible by 7.");
                }else
                if (num % 10 == 7) {
                    System.out.println(num + " ends with 7.");
                }

            }else{
                System.out.println("It is not a Buzz number.\nExplanation:");
                if (num % 7 != 0 && num % 10 != 7) {
                    System.out.println(
                        num +
                        " is neither divisible by 7 nor does it end with 7."
                    );
                }
            }
        }else{
            System.out.println("This number is not natural!");
        }
    }
}