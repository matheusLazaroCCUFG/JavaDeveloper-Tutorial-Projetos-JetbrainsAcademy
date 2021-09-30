package easy.SimpleChattyBot.Atividades.A1BoasVindas;

import java.util.Scanner;

public class A4OExercitoDeUnidades {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int categoria;

        categoria = scan.nextInt();

        if(categoria < 1){
            System.out.println("no army");
        }else
        if(categoria <= 19){
            System.out.println("pack");
        }else
        if(categoria <= 249){
            System.out.println("throng");
        }else
        if(categoria <= 999){
            System.out.println("zounds");
        }else{
            System.out.println("legion");
        }
    }
}
