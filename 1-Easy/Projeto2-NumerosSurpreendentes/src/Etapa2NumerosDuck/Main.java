package Etapa2NumerosDuck;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;

        System.out.println("Enter a natural number:");
        num = scan.nextInt();

        if(num > 0){ // Natural number (número natural)
            System.out.println("Properties of " + num);

            // Odd or Even (ímpar ou par)
            if(num % 2 != 0){
                System.out.println("        even: false");
                System.out.println("         odd: true");
            }else{
                System.out.println("        even: true");
                System.out.println("         odd: false");
            }

            if(buzz(num)){
                System.out.println("        buzz: true");
            }else{
                System.out.println("        buzz: false");
            }

            if(duck(num)){
                System.out.println("        duck: true");
            }else{
                System.out.println("        duck: false");
            }


        }else{
            System.out.println("This number is not natural!");
        }
    }

    /**
     * Um número é Buzz se é divisível por 7 ou termina com 7.
     * @param num
     * Número inteiro
     */
    public static boolean buzz(int num){
        //Buzz
        if(num % 7 == 0 || num % 10 == 7) {
            return true;
        }else{
            return false;
        }
    }

    /**
     * Um número é Duck se é positivo e contém zeros, exceto o primeiro
     * número.
     * @param num
     * Número inteiro
     */
    public static boolean duck(int num){
        String aux;
        if(num > 0){
            aux = String.valueOf(num);
            for(int i = 1; i < aux.length(); i++){
                if(aux.charAt(i) == '0'){
                    return true;
                }
            }
        }
        return false;
    }
}
