package Etapa3NumerosPalindromos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long num;

        System.out.println("Welcome to Amazing Numbers!");
        System.out.println(
            "\nSupported requests:\n" +
            "- enter a natural number to know its properties;\n" +
            "- enter 0 to exit."
        );

        while (true) {
            System.out.print("\nEnter a request: ");

            num = scan.nextLong();

            if (num == 0) {
                break;
            }

            if (num > 0) { // Natural number (número natural)
                System.out.println("\nProperties of " + num);

                // Odd or Even (ímpar ou par)
                if (num % 2 != 0) {
                    System.out.println("        even: false");
                    System.out.println("         odd: true");
                } else {
                    System.out.println("        even: true");
                    System.out.println("         odd: false");
                }

                if (buzz(num)) {
                    System.out.println("        buzz: true");
                } else {
                    System.out.println("        buzz: false");
                }

                if (duck(num)) {
                    System.out.println("        duck: true");
                } else {
                    System.out.println("        duck: false");
                }

                if (palindromic(num)) {
                    System.out.println(" palindromic: true");
                } else {
                    System.out.println(" palindromic: false");
                }
            } else {
                System.out.println(
                    "\nThe first parameter should be a natural number or zero."
                );
            }
        }

        System.out.println("Goodbye!");
    }

    /**
     * Um número é Buzz se é divisível por 7 ou termina com 7.
     * @param num
     */
    public static boolean buzz(long num){
        //Buzz
        if (num % 7 == 0 || num % 10 == 7) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Um número é Duck se é positivo e contém zeros, exceto o primeiro
     * número.
     * @param num
     */
    public static boolean duck(long num) {
        String aux;
        if (num > 0) {
            aux = String.valueOf(num);
            for (int i = 1; i < aux.length(); i++) {
                if (aux.charAt(i) == '0') {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Palíndromo: número que é o mesmo se lido da esquerda ou da direita.
     * @param num
     * @return
     */
    public static boolean palindromic(long num) {
        String strNum;
        String strInverseNum = "";

        strNum = String.valueOf(num);
        for (int i = strNum.length() - 1; i >= 0; i--) {
            strInverseNum += strNum.charAt(i);
        }

        if (strNum.equals(strInverseNum)) {
            return true;
        } else {
            return false;
        }
    }
}