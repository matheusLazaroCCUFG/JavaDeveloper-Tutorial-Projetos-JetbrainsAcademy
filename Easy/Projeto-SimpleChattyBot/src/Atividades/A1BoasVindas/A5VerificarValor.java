package Atividades.A1BoasVindas;

import java.util.Scanner;

public class A5VerificarValor {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int val = scan.nextInt();

        if(val < 10 && val > 0){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }//kk
}
