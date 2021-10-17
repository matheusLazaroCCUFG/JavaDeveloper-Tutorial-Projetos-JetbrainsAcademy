package estagio1ApenasNumeros;

import java.util.*;

public class Main {
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Long> list = new ArrayList<>();

        while (scanner.hasNextLong()) { // até o fim do arquivo (ou ctrl + d no Linux)
            long number = scanner.nextLong();

            list.add(number);
        }

        System.out.printf("Total numbers: %d.\n", list.size());

        System.out.printf(
            "the greatest number: %d (%d time(s))\n",
            Collections.max(list),
            Collections.frequency(list, Collections.max(list))
        );
    }
}
