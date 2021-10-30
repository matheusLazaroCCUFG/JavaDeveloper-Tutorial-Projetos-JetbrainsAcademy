package sorting;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Long> listLong;
        ArrayList<String> listString;
        boolean sortingType = false;
        boolean natural = true;
        boolean byCount = false;
        boolean inputFile = false;
        String nameInputFile = "";
        boolean outputFile = false;
        String nameOutputFile = "";
        String dataType = "";

        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("-sortingType")) {
                sortingType = true;
            } else if (args[i].equals("byCount")) {
                natural = false;
                byCount = true;
            } else if (args[i].equals("long")) {
                dataType = args[i];
            } else if (args[i].equals("line")) {
                dataType = args[i];
            } else if (args[i].equals("word")) {
                dataType = args[i];
            } else if (args[i].equals("-inputFile") && args.length >= i+1) {
                inputFile = true;
                nameInputFile = args[i+1];
            } else if (args[i].equals("-outputFile") && args.length >= i+1) {
                outputFile = true;
                nameOutputFile = args[i+1];
            }
        }

        exceptionHandling(args);

        if (sortingType) { // args[1].equals("-sortingType")
            //listLong = (ArrayList<Long>) scannerFileAddList(scanner, true, false);
            if (dataType.equals("long")) {
                listLong = (ArrayList<Long>) scannerFileAddList(scanner, true, false, inputFile, nameInputFile);

                if (natural){
                    sortingLong(listLong, true, outputFile, nameOutputFile);
                } else if (byCount) {
                    sortingLong(listLong, false, outputFile, nameOutputFile);
                }
            } else if (dataType.equals("line")) {
                listString = (ArrayList<String>) scannerFileAddList(scanner, false, false, inputFile, nameInputFile);

                if (natural){
                    sortingString(listString, true, false, outputFile, nameOutputFile);
                } else if (byCount) {
                    sortingString(listString, false, false, outputFile, nameOutputFile);
                }
            } else if (dataType.equals("word")) {
                listString = (ArrayList<String>) scannerFileAddList(scanner, false, true, inputFile, nameInputFile);

                if (natural){
                    sortingString(listString, true, true, outputFile, nameOutputFile);
                } else if (byCount) {
                    sortingString(listString, false, true, outputFile, nameOutputFile);
                }
            } else { // line naturalmente
                listString = (ArrayList<String>) scannerFileAddList(scanner, false, false, inputFile, nameInputFile);

                if (natural){
                    sortingString(listString, true, false, outputFile, nameOutputFile);
                } else if (byCount) {
                    sortingString(listString, false, false, outputFile, nameOutputFile);
                }
            }

        } else { // natural
            if (dataType.equals("long")) {
                listLong = (ArrayList<Long>) scannerFileAddList(scanner, true, false, inputFile, nameInputFile);
                    sortingLong(listLong, true, outputFile, nameOutputFile);
            } else if (dataType.equals("line")) {
                listString = (ArrayList<String>) scannerFileAddList(scanner, false, false, inputFile, nameInputFile);

                    sortingString(listString, true, false, outputFile, nameOutputFile);
            } else if (dataType.equals("word")) {
                listString = (ArrayList<String>) scannerFileAddList(scanner, false, true, inputFile, nameInputFile);

                sortingString(listString, true, true, outputFile, nameOutputFile);
            } else {
                listString = (ArrayList<String>) scannerFileAddList(scanner, false, false, inputFile, nameInputFile);

                sortingString(listString, true, false, outputFile, nameOutputFile);
            }
        }
    }

    public static void exceptionHandling(String[] args) {
        boolean sortingType = false;
        boolean natural = false;
        boolean byCount = false;
        boolean dataType = false;
        boolean typeLong = false;
        boolean typeline = false;
        boolean typeWord = false;

        for (String arg : args) {
            if (arg.equals("-sortingType")) {
                sortingType = true;
            } else if (arg.equals("natural")) {
                natural = true;
            } else if (arg.equals("byCount")) {
                byCount = true;
            } else if (arg.equals("-dataType")) {
                dataType = true;
            } else if (arg.equals("long")) {
                typeLong = true;
            } else if (arg.equals("line")) {
                typeline = true;
            } else if (arg.equals("word")) {
                typeWord = true;
            } else if (arg.equals("-inputFile")) {

            } else if (arg.equals("-outputFile")) {

            } else {
                //System.out.println("\"" + arg + "\" is not a valid parameter. It will be skipped");
            }
        }

        /** se o -sortingType argumento for fornecido, mas o tipo não,
        * imprime uma mensagem No sorting type defined!
        */
        if (sortingType && !natural && !byCount) {
            System.out.println("No sorting type defined!");
        }

        // se o -dataType argumento for fornecido, mas o tipo não,
        // imprimir No data type defined!
        if (dataType && !typeLong && !typeline && !typeWord) {
            System.out.println("No data type defined!");
        }
    }

    public static ArrayList<?> scannerFileAddList(
            Scanner scanner, boolean isLong, boolean isWord, boolean inputFile, String nameInputFile
    ) {
        if (isLong) {
            ArrayList<Long> listLong = new ArrayList<>();
            long number;
            String aux = "";

            if (inputFile) {
                File file = new File(nameInputFile);

                try (Scanner scanner2 = new Scanner(file)) {
                    while (scanner2.hasNext()) {
                        try {
                            aux = scanner2.next();
                            number = Long.parseLong(aux);
                            listLong.add(number);
                        } catch(NumberFormatException numberFormatException){
                            System.out.println("\"" + aux + "\" is not a long. It will be skipped");
                        }
                    }
                } catch (FileNotFoundException e) {
                    System.out.println("No file found: " + nameInputFile);
                }
            } else {
                while (scanner.hasNext()) {
                    try {
                        aux = scanner.next();
                        number = Long.parseLong(aux);
                        listLong.add(number);
                    } catch(NumberFormatException numberFormatException){
                        System.out.println("\"" + aux + "\" is not a long. It will be skipped");
                    }
                }
            }

            return listLong;
        } else {
            ArrayList<String> listString = new ArrayList<>();

            if (isWord) {
                if (inputFile) {
                    File file = new File(nameInputFile);

                    try (Scanner scanner2 = new Scanner(file)) {
                        while (scanner2.hasNext()) {
                            String str = scanner2.next();
                            listString.add(str);
                        }
                    } catch (FileNotFoundException e) {
                        System.out.println("No file found: " + nameInputFile);
                    }
                } else {
                    while (scanner.hasNext()) {
                        String str = scanner.next();
                        listString.add(str);
                    }
                }


            } else {
                if (inputFile) {
                    File file = new File(nameInputFile);

                    try (Scanner scanner2 = new Scanner(file)) {
                        while (scanner2.hasNextLine()) {
                            String str = scanner2.nextLine();
                            listString.add(str);
                        }
                    } catch (FileNotFoundException e) {
                        System.out.println("No file found: " + nameInputFile);
                    }
                } else {
                    while (scanner.hasNextLine()) {
                        String str = scanner.nextLine();
                        listString.add(str);
                    }
                }


            }
            return listString;
        }
    }


    public static void sortingLong(ArrayList<Long> listLong, boolean natural, boolean outputFile, String nameOutputFile) {
            if (natural) {
                Collections.sort(listLong);

                if (outputFile) {
                    String pathName = "";
                    File file = new File(pathName + nameOutputFile);

                    try (PrintWriter printWriter = new PrintWriter(file)) {
                        printWriter.println("Total number = " + listLong.size() + ".");
                        printWriter.println(
                            "Sorted data: " +
                            listLong.toString().
                                replace("[", "").
                                replace(",", "").
                                replace("]", "")
                        );
                    } catch (IOException e) {
                        System.out.printf("An exception occurred %s", e.getMessage());
                    }
                } else {
                    System.out.println("Total number = " + listLong.size() + ".");
                    System.out.println(
                        "Sorted data: " +
                        listLong.toString().
                            replace("[", "").
                            replace(",", "").
                            replace("]", "")
                    );
                }

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



                if (outputFile) {
                    String pathName = "";
                    File file = new File(pathName + nameOutputFile);

                    try (PrintWriter printWriter = new PrintWriter(file)) {
                        printWriter.println(
                                "Total numbers: " + listLong.size() + ".\n" +
                                        byCountOrderLongs.toString().replace("[", "")
                                                .replace(", ", "")
                                                .replace("¬ ", ", ")
                                                .replace("]", "")
                        );
                    } catch (IOException e) {
                        System.out.printf("An exception occurred %s", e.getMessage());
                    }
                } else {
                    System.out.println(
                            "Total numbers: " + listLong.size() + ".\n" +
                                    byCountOrderLongs.toString().replace("[", "")
                                            .replace(", ", "")
                                            .replace("¬ ", ", ")
                                            .replace("]", "")
                    );
                }
            }
        }


    public static void sortingString(ArrayList<String> listString, boolean natural, boolean isWord, boolean outputFile, String nameOutputFile) {
        if (!isWord){
            if (natural) { //ordenação lexicográfica
                //SortedSet<String> sortedSet = new TreeSet<>();
                Collections.sort(listString);


                if (outputFile) {
                    String pathName = "";
                    File file = new File(pathName + nameOutputFile);

                    try (PrintWriter printWriter = new PrintWriter(file)) {
                        printWriter.println(
                                "Total lines: " + listString.size() + "\n" +
                                        "Sorted data:\n" +
                                        listString.toString()
                                                .replace("[", "")
                                                .replace(", ", "\n")
                                                .replace("]", "")
                        );
                    } catch (IOException e) {
                        System.out.printf("An exception occurred %s", e.getMessage());
                    }
                } else {
                    System.out.println(
                            "Total lines: " + listString.size() + "\n" +
                                    "Sorted data:\n" +
                                    listString.toString()
                                            .replace("[", "")
                                            .replace(", ", "\n")
                                            .replace("]", "")
                    );
                }

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

                if (outputFile) {
                    String pathName = "";
                    File file = new File(pathName + nameOutputFile);

                    try (PrintWriter printWriter = new PrintWriter(file)) {
                        printWriter.println(
                                "Total lines: " + listString.size() + ".\n" +
                                        set.toString()
                                                .replace("[", "")
                                                .replace(", ", "")
                                                .replace("¬ ", ", ")
                                                .replace("]", "")
                        );
                    } catch (IOException e) {
                        System.out.printf("An exception occurred %s", e.getMessage());
                    }
                } else {
                    System.out.println(
                            "Total lines: " + listString.size() + ".\n" +
                                    set.toString()
                                            .replace("[", "")
                                            .replace(", ", "")
                                            .replace("¬ ", ", ")
                                            .replace("]", "")
                    );
                }

            }
        } else { // word
            if (natural) { //ordenação lexicográfica
                //Set<String> sortedSet = new TreeSet<>();
                Collections.sort(listString);

                if (outputFile) {
                    String pathName = "";
                    File file = new File(pathName + nameOutputFile);

                    try (PrintWriter printWriter = new PrintWriter(file)) {
                        printWriter.println(
                                "Total words: " + listString.size() + "\n" +
                                        "Sorted data:\n" +
                                        listString.toString()
                                                .replace("[", "")
                                                .replace(", ", " ")
                                                .replace("]", "")
                        );
                    } catch (IOException e) {
                        System.out.printf("An exception occurred %s", e.getMessage());
                    }
                } else {
                    System.out.println(
                            "Total words: " + listString.size() + "\n" +
                                    "Sorted data:\n" +
                                    listString.toString()
                                            .replace("[", "")
                                            .replace(", ", " ")
                                            .replace("]", "")
                    );
                }

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

                if (outputFile) {
                    String pathName = "";
                    File file = new File(pathName + nameOutputFile);

                    try (PrintWriter printWriter = new PrintWriter(file)) {
                        printWriter.println(
                                "Total words: " + listString.size() + ".\n" +
                                        set.toString()
                                                .replace("[", "")
                                                .replace(", ", "")
                                                .replace("¬ ", ", ")
                                                .replace("]", "")
                        );
                    } catch (IOException e) {
                        System.out.printf("An exception occurred %s", e.getMessage());
                    }
                } else {
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
}