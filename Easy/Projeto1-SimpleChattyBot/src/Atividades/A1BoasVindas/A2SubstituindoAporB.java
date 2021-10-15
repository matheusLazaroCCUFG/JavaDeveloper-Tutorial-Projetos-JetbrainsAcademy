package Atividades.A1BoasVindas;

import java.util.Scanner;

public class A2SubstituindoAporB {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        str = str.replace('a', 'b');
        System.out.println(str);
    }
}
