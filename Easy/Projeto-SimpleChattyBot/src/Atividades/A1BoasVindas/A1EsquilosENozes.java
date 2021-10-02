package Atividades.A1BoasVindas;

import java.util.Scanner;

/**
 * N esquilos encontraram nozes K e decidiram dividi-las igualmente.
 * Determine quantas nozes cada esquilo receberá.
 *
 * Formato de dados de entrada
 * Existem dois números positivos N e K, cada um deles não é maior que
 10000.

 */
public class A1EsquilosENozes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int N;//qtd esquilos
        int K;//qtd nozes

        N = scanner.nextInt();
        K = scanner.nextInt();

        System.out.println(K/N);
    }
}