package Atividades.A1BoasVindas;
import java.util.Scanner;

public class A3ProdutoNumerosDeAaB {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        long a;//início do intervalo
        long b;//fim do intervalo
        long result = 1;

        a = scan.nextInt();
        b = scan.nextInt();

        for(long i = a; i < b; i++){
            result *= i;
        }

        System.out.println(result);
    }
}

