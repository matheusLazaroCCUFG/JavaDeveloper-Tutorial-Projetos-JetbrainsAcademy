package estagio4TudoConta;

import java.util.*;

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

                if (natural){
                    sortingLong(listLong, true);
                } else if (byCount) {
                    sortingLong(listLong, false);
                }
            } else if (dataType.equals("line")) {
                listString = (ArrayList<String>) scannerAddList(scanner, false, false);

                if (natural){
                    sortingString(listString, true, false);
                } else if (byCount) {
                    sortingString(listString, false, false);
                }
            } else if (dataType.equals("word")) {
                listString = (ArrayList<String>) scannerAddList(scanner, false, true);

                if (natural){
                    sortingString(listString, true, true);
                } else if (byCount) {
                    sortingString(listString, false, true);
                }
            }

        } else { // natural
            if (dataType.equals("long")) {
                listLong = (ArrayList<Long>) scannerAddList(scanner, true, false);
                    sortingLong(listLong, true);
            } else if (dataType.equals("line")) {
                listString = (ArrayList<String>) scannerAddList(scanner, false, false);

                    sortingString(listString, true, false);
            } else if (dataType.equals("word")) {
                listString = (ArrayList<String>) scannerAddList(scanner, false, true);

                sortingString(listString, true, true);
            }

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


    public static void sortingLong(ArrayList<Long> listLong, boolean natural) {
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
                Set<ByCountOrderLong> byCountOrderLongs = new TreeSet<>();
                ByCountOrderLong[] byCount = new ByCountOrderLong[listLong.size()];

                for (int i = 0; i < listLong.size(); i++) {
                    byCount[i] = new ByCountOrderLong(
                            Collections.frequency(listLong, listLong.get(i)),
                            listLong.get(i),
                            listLong.size()
                    );
                    byCountOrderLongs.add(byCount[i]);
                }

                System.out.println(
                        "Total numbers: " + listLong.size() + ".\n" +
                                byCountOrderLongs.toString().replace("[", "")
                                        .replace(", ", "")
                                        .replace("¬ ", ", ")
                                        .replace("]", "")
                );
            }
        }


    public static void sortingString(ArrayList<String> listString, boolean natural, boolean isWord) {
        if (!isWord){
            if (natural) { //ordenação lexicográfica
                //SortedSet<String> sortedSet = new TreeSet<>();
                Collections.sort(listString);



                System.out.println(
                        "Total lines: " + listString.size() + "\n" +
                                "Sorted data:\n" +
                                listString.toString()
                                        .replace("[", "")
                                        .replace(", ", "\n")
                                        .replace("]", "")
                );
            } else { // byCount
                ByCountOrderString[] byCountOrderStrings = new ByCountOrderString[listString.size()];
                Set<ByCountOrderString> set = new TreeSet<>();

                for (int i = 0; i < listString.size(); i++) {
                    byCountOrderStrings[i] = new ByCountOrderString(
                            Collections.frequency(listString, listString.get(i)),
                            listString.get(i),
                            listString.size()
                    );

                    set.add(byCountOrderStrings[i]);
                }

                System.out.println(
                        "Total lines: " + listString.size() + ".\n" +
                        set.toString()
                                .replace("[", "")
                                .replace(", ", "")
                                .replace("¬ ", ", ")
                                .replace("]", "")
                );
            }
        } else { // word
            if (natural) { //ordenação lexicográfica
                //Set<String> sortedSet = new TreeSet<>();
                Collections.sort(listString);

                System.out.println(
                        "Total words: " + listString.size() + "\n" +
                                "Sorted data:\n" +
                                listString.toString()
                                        .replace("[", "")
                                        .replace(", ", " ")
                                        .replace("]", "")
                );
            } else { // byCount
                ByCountOrderString[] byCountOrderStrings = new ByCountOrderString[listString.size()];
                Set<ByCountOrderString> set = new TreeSet<>();

                for (int i = 0; i < listString.size(); i++) {
                    byCountOrderStrings[i] = new ByCountOrderString(
                            Collections.frequency(listString, listString.get(i)),
                            listString.get(i),
                            listString.size()
                    );

                    set.add(byCountOrderStrings[i]);
                }


                System.out.println(
                        "Total words: " + listString.size() + ".\n" +
                                set.toString()
                                .replace("[", "")
                                .replace(", ", "")
                                .replace("¬ ", ", ")
                                .replace("]", "")
                );
            }
        }
    }
}
