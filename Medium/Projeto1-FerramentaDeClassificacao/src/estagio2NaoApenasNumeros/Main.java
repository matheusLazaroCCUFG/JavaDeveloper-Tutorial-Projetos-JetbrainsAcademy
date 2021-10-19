package estagio2NaoApenasNumeros;

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
        ArrayList<Long> listLong = null;
        ArrayList<String> listLines = null;
        ArrayList<String> listWords = null;

        if (args != null) {
            if (args[1].equals("long")) {
                listLong = new ArrayList<>();

                while (scanner.hasNextLong()) {
                    long number = scanner.nextLong();

                    listLong.add(number);
                }
            } else  if (args[1].equals("line")) {
                listLines = new ArrayList<>();

                while (scanner.hasNextLine()) {
                    String str = scanner.nextLine();

                    listLines.add(str);
                }
            } else  if (args[1].equals("word")) {
                listWords = new ArrayList<>();

                while (scanner.hasNext()) {
                    String word = scanner.next();

                    listWords.add(word);
                }
            }
        } else { // é word
            listWords = new ArrayList<>();

            while (scanner.hasNext()) {
                String word = scanner.next();

                listWords.add(word);
            }
        }
        
        if(listLong != null) {
            System.out.printf("Total numbers: %d.\n", listLong.size());
            System.out.printf(
                    "the greatest number: %d (%d time(s), %d%%).\n",
                    Collections.max(listLong),
                    Collections.frequency(listLong, Collections.max(listLong)),
                    100 * Collections.frequency(listLong, Collections.max(listLong)) / listLong.size()
            );
        } else if (listLines != null) {
            System.out.printf("Total lines: %d.\n", listLines.size());
            int maior = 0;
            int indiceMaior = 0;

            for (int i = 0; i < listLines.size(); i++) {
                if (listLines.get(i).length() > maior) {
                    maior = listLines.get(i).length();
                    indiceMaior = i;
                }
            }

            System.out.printf(
                    "The longest line:\n" +
                    "%s\n" +
                    "(%d time(s), %d%%).\n",
                    listLines.get(indiceMaior),
                    Collections.frequency(listLines, listLines.get(indiceMaior)),
                    100 * Collections.frequency(listLines, listLines.get(indiceMaior)) / listLines.size()
            );
        } else if (listWords != null) {
            System.out.printf("Total words: %d.\n", listWords.size());
            int maior = 0;
            int indiceMaior = 0;

            for (int i = 0; i < listWords.size(); i++) {
                if (listWords.get(i).length() > maior) {
                    maior = listWords.get(i).length();
                    indiceMaior = i;
                }
            }
            System.out.printf(
                    "The longest word: %s (%d time(s), %d%%).\n",
                    listWords.get(indiceMaior),
                    Collections.frequency(listWords, listWords.get(indiceMaior)),
                    100 * Collections.frequency(listWords, listWords.get(indiceMaior)) / listWords.size()
            );
        }
    }
}
