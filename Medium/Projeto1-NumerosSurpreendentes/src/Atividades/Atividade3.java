package Atividades;

import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        int sum = 0;

        while (true) {
            num = scan.nextInt();
            if (num == 0) {
                break;
            }
            sum += num;
        }

        System.out.println(sum);
    }
}
