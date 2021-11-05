package Etapa4NumerosGapful;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String scanLine;
        String[] strAux;
        long par1Value;
        long par2Increment;

        System.out.println("Welcome to Amazing Numbers!");

        printsupportedRequests();

        while (true) {
            System.out.print("\nEnter a request: ");

            scanLine = scan.nextLine();
            strAux = scanLine.split(" ");

            if (scanLine.length() == 0) {
                printsupportedRequests();
                continue;
            }

            if (!Character.isDigit(strAux[0].charAt(0))) {
                System.out.println("\nThe first parameter should be a natural number or zero.");
                continue;
            }
            if (strAux[0].charAt(0) == '0') {
                break;
            }

            par1Value = Long.parseLong(strAux[0]);
            par2Increment = strAux.length == 1 ? -1 : Long.parseLong(strAux[1]);

            if (par1Value <= 0) {
                break;
            }

            if(par2Increment <= 0){
                System.out.println("The second parameter should be a natural number.");
            }

            printProperties(par1Value, par2Increment);
        }

        System.out.println("\nGoodbye!");
    }

    /**
     * Um número é Buzz se é divisível por 7 ou termina com 7.
     * @param num
     */
    public static boolean buzz(long num){
        //Buzz
        if (num % 7 == 0 || num % 10 == 7) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Um número é Duck se é positivo e contém zeros, exceto o primeiro
     * número.
     * @param num
     */
    public static boolean duck(long num) {
        String aux;
        if (num > 0) {
            aux = String.valueOf(num);
            for (int i = 1; i < aux.length(); i++) {
                if (aux.charAt(i) == '0') {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Palíndromo: número que é o mesmo se lido da esquerda ou da direita.
     * @param num
     * @return
     */
    public static boolean palindromic(long num) {
        String strNum;
        String strInverseNum = "";

        strNum = String.valueOf(num);
        for (int i = strNum.length() - 1; i >= 0; i--) {
            strInverseNum += strNum.charAt(i);
        }

        if (strNum.equals(strInverseNum)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Número Gapful: contém pelo menos 3 dígitos e é divisível pela
     * concatenação de seu primeiro e último dígito sem resto.
     * @param num
     * @return
     */
    public static boolean gapful(long num) {
        String aux = Long.toString(num);
        char firstDigit;
        char lastDigit;
        String concat;
        long longConcat;

        if (aux.length() >= 3) {
            firstDigit = aux.charAt(0);
            lastDigit = aux.charAt(aux.length() - 1);

            concat = Character.toString(firstDigit) + Character.toString(lastDigit);
            longConcat = Long.parseLong(concat);

            if (num % longConcat == 0) {
                return true;
            }
        }
        return false;
    }

    public static void printProperties(long par1Value, long par2Increment){
        if (par2Increment == -1) {
            System.out.println("\nProperties of " + par1Value);

            if (buzz(par1Value)) {
                System.out.println("        buzz: true");
            } else {
                System.out.println("        buzz: false");
            }

            if (duck(par1Value)) {
                System.out.println("        duck: true");
            } else {
                System.out.println("        duck: false");
            }

            if (palindromic(par1Value)) {
                System.out.println(" palindromic: true");
            } else {
                System.out.println(" palindromic: false");
            }

            if (gapful(par1Value)) {
                System.out.println("      gapful: true");
            } else {
                System.out.println("      gapful: false");
            }

            // Odd or Even (ímpar ou par)
            if (par1Value % 2 != 0) {
                System.out.println("        even: false");
                System.out.println("         odd: true");
            } else {
                System.out.println("        even: true");
                System.out.println("         odd: false");
            }
        } else {
            System.out.println();
            for (long i = par1Value; i < par1Value + par2Increment; i++) {
                System.out.print("             " + i + " is ");

                if (buzz(i)) {
                    System.out.print("buzz, ");
                }

                if (duck(i)) {
                    System.out.print("duck, ");
                }

                if (palindromic(i)) {
                    System.out.print("palindromic, ");
                }

                if (gapful(i)) {
                    System.out.print("gapful, ");
                }

                if (i % 2 == 0) {
                    System.out.print("even\n");
                } else {
                    System.out.print("odd\n");
                }


            }
        }
    }

    public static void printsupportedRequests(){
        System.out.println(
                "\nSupported requests:\n" +
                        "- enter a natural number to know its properties;\n" +
                        "- enter two natural numbers to obtain the properties of the list:\n" +
                        "  * the first parameter represents a starting number;\n" +
                        "  * the second parameters show how many consecutive numbers are to be processed;\n" +
                        "- separate the parameters with one space;\n" +
                        "- enter 0 to exit."
        );
    }
}
