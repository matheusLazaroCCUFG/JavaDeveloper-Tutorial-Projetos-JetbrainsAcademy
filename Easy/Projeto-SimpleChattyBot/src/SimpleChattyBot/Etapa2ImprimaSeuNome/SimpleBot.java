package SimpleChattyBot.Etapa2ImprimaSeuNome;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SimpleBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        DateFormat df = new SimpleDateFormat("yyyy");
        Date date = new Date();

        System.out.println("Hello! My name is Aid.");
        System.out.println("I was created in " + df.format(date) + ".");
        System.out.println("Please, remind me your name.");

        name = scanner.nextLine();

        System.out.println("What a great name you have, " + name + "!");
    }
}