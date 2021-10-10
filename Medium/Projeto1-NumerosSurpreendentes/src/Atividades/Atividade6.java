package Atividades;

import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        int opt;

        opt = scan.nextInt();

        switch (opt) {
            case 1:
                System.out.println("Yes!");
                break;
            case 2:
                System.out.println("No!");
                break;
            case 3:
                System.out.println("No!");
                break;
            case 4:
                System.out.println("No!");
                break;
            default:
                System.out.println("Unknown number");
        }
    }
}
