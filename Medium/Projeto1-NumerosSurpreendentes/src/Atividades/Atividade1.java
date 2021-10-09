package Atividades;

import java.util.Scanner;

public class Atividade1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long m = scan.nextLong();
        System.out.println(verifica(m));
    }

    /**
     * Um usuário insere um long número positivo m.
     * Você precisa descobrir qual é o menor número int n tal que n! > m .
     * @param m
     * inteiro longo positivo
     */
    public static int verifica(long m) {
        int n = 0;
        while (true) {
            if (fatorial(n) > m ) {
                break;
            }
            n++;
        }
        return n;
    }

    public static long fatorial(long num) {
        if (num == 0) {
            return 1;
        } else {
            return num * fatorial(num - 1);
        }
    }
}
