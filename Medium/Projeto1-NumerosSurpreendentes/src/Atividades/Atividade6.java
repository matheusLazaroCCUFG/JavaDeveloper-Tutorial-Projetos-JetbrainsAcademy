package Atividades;

import java.util.Scanner;

public class Atividade6 {
 /*   public static void main(String[] args) {
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
*/
    public static void main(String[] args) {
        int counter = 0;
        for (Secret secret: Secret.values()) {
            if(secret.name().startsWith("STAR")) {
                counter++;
            }
        }

        System.out.println(counter);

    }


    enum Secret {
        STAR, CRASH, START // ...
    }


}
