package Atividades;

import jdk.jfr.Percentage;

import java.util.Scanner;

public class Atividade2 {
    public static final int PERCENT = 100;

    public static void main(String[] args) {
        int  m;
        int  p;
        int  k;
        Scanner scan = new Scanner(System.in);

        m = scan.nextInt();
        p = scan.nextInt();
        k = scan.nextInt();

        System.out.println(investimento(m, p, k));
    }

    /**
     *
     * @param m dinheiro no banco
     * @param p Porcentagem para aumento do depósito a cada ano
     * @param k valor esperado
     * valores inteiros positivos
     * k >= m
     * @return quantos anos devem se passar até o depósito do banco chegue a k dinheiro
     */
    public static int investimento(int m, int p, int k) {
        int anos = 0;
        double m2 = m;

        while (m2 < (double) k) {
            m2 += m2 * (double) p / PERCENT;
            anos++;
        }
        return anos;
    }
}
