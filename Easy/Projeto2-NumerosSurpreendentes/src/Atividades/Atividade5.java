package Atividades;

import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long num1;
        char operador;
        long num2;

        num1 = scan.nextLong();
        operador = scan.next().charAt(0);
        num2 = scan.nextLong();

        if (num2 == 0) {
            System.out.println("Division by 0!");
            return;
        }

        calculadoraSimples(num1, operador, num2);
    }

    public static void calculadoraSimples(long num1, char operador, long num2) {
        switch (operador) {
            case '+':
                System.out.println(num1 + num2);
                return;
            case '-':
                System.out.println(num1 - num2);
                return;
            case '*':
                System.out.println(num1 * num2);
                return;
            case '/':
                System.out.println(num1 / num2);
                return;
            default:
                System.out.println("Unknown operator");
        }
    }
}
