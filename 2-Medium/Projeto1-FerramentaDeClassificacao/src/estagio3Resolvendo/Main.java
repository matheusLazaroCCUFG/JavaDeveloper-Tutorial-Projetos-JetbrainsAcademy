package estagio3Resolvendo;

import java.util.*;

/**
 * Adicionar comportamento para tipos de dados de texto.
 * Implementar análise de argumentos de linha de comando.
 * para o usuário definir o tipo de dados de entrada.
 * Depois de analisar os argumentos e ler a entrada, tratar a entrada de acordo
 * com o tipo de dados e enviar uma mensagem de informação.
 */
public class Main {
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Long> listLong;
        ArrayList<String> listString;

        if (args != null) {
            if (args[0].equals("-sortIntegers")) { // args[1].equals("-sortIntegers")
                listLong = (ArrayList<Long>) scannerAddList(scanner, true, false);
                sortIntegers(listLong);
                return;
            }else if (args[1].equals("long")) {
                listLong = (ArrayList<Long>) scannerAddList(scanner, true, false);

                if (args.length == 3) { // args[1].equals("-sortIntegers")
                    sortIntegers(listLong);
                    return;
                }

                System.out.printf("Total numbers: %d.\n", listLong.size());
                System.out.printf(
                        "the greatest number: %d (%d time(s), %d%%).\n",
                        Collections.max(listLong),
                        Collections.frequency(listLong, Collections.max(listLong)),
                        100 * Collections.frequency(
                                listLong,
                                Collections.max(listLong)
                        ) / listLong.size()
                );
            } else  if (args[1].equals("line")) {
                listString = (ArrayList<String>) scannerAddList(scanner, false, false);

                System.out.printf("Total lines: %d.\n", listString.size());

                int indiceMaior = checkMax(listString);

                System.out.printf(
                        "The longest line:\n" +
                                "%s\n" +
                                "(%d time(s), %d%%).\n",
                        listString.get(indiceMaior),
                        Collections.frequency(listString, listString.get(indiceMaior)),
                        100 * Collections.frequency(
                                listString,
                                listString.get(indiceMaior)
                        ) / listString.size()
                );
            } else  if (args[1].equals("word")) {
                listString = (ArrayList<String>) scannerAddList(scanner, false, true);

                if (args.length == 3) {
                    listLong = new ArrayList<>();

                    for (int i = 0; i < listString.size(); i++){
                        listLong.add(Long.parseLong(listString.get(i)));
                    }

                    sortIntegers(listLong);

                    return;
                }

                System.out.printf("Total words: %d.\n", listString.size());

                int indiceMaior = checkMax(listString);

                System.out.printf(
                        "The longest word: %s (%d time(s), %d%%).\n",
                        listString.get(indiceMaior),
                        Collections.frequency(listString, listString.get(indiceMaior)),
                        100 * Collections.frequency(
                                listString,
                                listString.get(indiceMaior)
                        ) / listString.size()
                );
            }
        } else { // é word
            listString = (ArrayList<String>) scannerAddList(scanner, false, true);

            System.out.printf("Total words: %d.\n", listString.size());

            int indiceMaior = checkMax(listString);

            System.out.printf(
                    "The longest word: %s (%d time(s), %d%%).\n",
                    listString.get(indiceMaior),
                    Collections.frequency(listString, listString.get(indiceMaior)),
                    100 * Collections.frequency(
                            listString,
                            listString.get(indiceMaior)
                    ) / listString.size()
            );
        }
    }
    
    public static ArrayList<?> scannerAddList(
            Scanner scanner, boolean isLong, boolean isWord
    ) {
        if (isLong) {
            ArrayList<Long> listLong = new ArrayList<>();

            while (scanner.hasNextLong()) {
                long number = scanner.nextLong();

                listLong.add(number);
            }

            return listLong;
        } else {
            ArrayList<String> listString = new ArrayList<>();
            
            if (isWord) {
                while (scanner.hasNext()) {
                    String str = scanner.next();
                    listString.add(str);
                }
            } else {
                while (scanner.hasNextLine()) {
                    String str = scanner.nextLine();
                    listString.add(str);
                }
            }
            return listString;
        }
    }

    public static int checkMax(ArrayList<String> listString) {
        int maior = 0;
        int indiceMaior = 0;

        for (int i = 0; i < listString.size(); i++) {
            if (listString.get(i).length() > maior) {
                maior = listString.get(i).length();
                indiceMaior = i;
            }
        }

        return indiceMaior;
    }

    public static void sortIntegers(ArrayList<Long> listLong) {
        Collections.sort(listLong);

        System.out.println("Total number = " + listLong.size() + ".");
        System.out.println(
                "Sorted data: " +
                        listLong.toString().
                                replace("[", "").
                                replace(",", "").
                                replace("]", "")
        );
    }
}