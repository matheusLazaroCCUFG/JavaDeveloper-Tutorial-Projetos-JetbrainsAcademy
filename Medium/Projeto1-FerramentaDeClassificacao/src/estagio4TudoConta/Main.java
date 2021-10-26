package estagio4TudoConta;

import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Long> listLong;
        ArrayList<String> listString;
        boolean sortingType = false;
        boolean natural = true;
        boolean byCount = false;
        String dataType = "";


        for (String str : args) {
            if (str.equals("-sortingType")) {
                sortingType = true;
            } else if (str.equals("byCount")) {
                natural = false;
                byCount = true;
            } else if (str.equals("long")) {
                dataType = str;
            }else if (str.equals("line")) {
                dataType = str;
            }else if (str.equals("word")) {
                dataType = str;
            }
        }

        if (sortingType) { // args[1].equals("-sortingType")
            //listLong = (ArrayList<Long>) scannerAddList(scanner, true, false);
            if (dataType.equals("long")) {
                listLong = (ArrayList<Long>) scannerAddList(scanner, true, false);

                if (natural || (!natural && !byCount)){
                    sortingType(listLong, true);
                } else if (byCount) {
                    sortingType(listLong, false);
                }
            } else if ( dataType.equals("line")) {
                listString = (ArrayList<String>) scannerAddList(scanner, false, false);
            } else if (dataType.equals("word")) {
                listString = (ArrayList<String>) scannerAddList(scanner, false, true);
            }

            //sortingType(listLong);
            return;
        }/*else if (args[1].equals("long")) {
            listLong = (ArrayList<Long>) scannerAddList(scanner, true, false);

            if (args.length == 3) { // args[1].equals("-sortingType")
                sortingType(listLong);
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

                sortingType(listLong);

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
    */
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

    public static void sortingType(ArrayList<Long> listLong, boolean natural) {
        if (natural) {
             Collections.sort(listLong);

             System.out.println("Total number = " + listLong.size() + ".");
             System.out.println(
                     "Sorted data: " +
                             listLong.toString().
                                     replace("[", "").
                                     replace(",", "").
                                     replace("]", "")
             );
        } else {
            // byCount (por quantidade de vezes, da maior qtd para a menor qtd
            // ou por ordem natural)

            // Ordena e remove os repetidos
            SortedSet<ByCountOrderLong> byCountOrderLongs = new TreeSet<>();
            Map<Long, Integer> map = new HashMap<>();

            for (int i = 0; i < listLong.size(); i++) {
                map.put(
                        listLong.get(i), // valor
                        Collections.frequency(listLong, listLong.get(i)) // frequência
                );
            }
            Stream<Map.Entry<Long, Integer>> sorted =
                    map.entrySet().stream()
                            .sorted(Map.Entry.comparingByValue());

            System.out.println(sorted);

            for (int i = 0; i < sorted.count(); i++) {
                System.out.printf(
                        "%d: %d time(s), %d%%",
                        sorted.toString(), 1, 1
                );
            }


        }

    }


}
