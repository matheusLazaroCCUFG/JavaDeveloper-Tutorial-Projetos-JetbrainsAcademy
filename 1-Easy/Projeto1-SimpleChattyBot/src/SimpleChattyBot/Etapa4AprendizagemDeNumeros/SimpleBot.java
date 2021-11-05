package SimpleChattyBot.Etapa4AprendizagemDeNumeros;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SimpleBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateFormat df = new SimpleDateFormat("yyyy");
        Date date = new Date();
        int rem3, rem5, rem7, age, numCount;

        System.out.println("Hello! My name is Aid.");
        System.out.println("I was created in " + df.format(date) + ".");
        System.out.println("Please, remind me your name.");

        String name = scanner.nextLine();

        System.out.println("What a great name you have, " + name + "!");
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");

        rem3 = scanner.nextInt();
        rem5 = scanner.nextInt();
        rem7 = scanner.nextInt();

        age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;

        System.out.println("Your age is " + age + "; that's a good time to start programming!");
        System.out.println("Now I will prove to you that I can count to any number you want.");

        // read a number and count to it here
        numCount = scanner.nextInt();
        for(int i = 0; i <= numCount; i++){
            System.out.println(i + "!");
        }

        System.out.println("Completed, have a nice day!");
    }
}