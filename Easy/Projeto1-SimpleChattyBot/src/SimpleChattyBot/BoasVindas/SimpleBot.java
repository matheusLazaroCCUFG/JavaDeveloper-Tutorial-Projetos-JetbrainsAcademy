package SimpleChattyBot.BoasVindas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleBot {
    public static void main(String[] args){
        DateFormat df = new SimpleDateFormat("yyyy");
        Date date = new Date();

        System.out.println(
            "Hello! My name is Matheus.\n" +
            "I was created in " + df.format(date) + "."
        );
    }
}
