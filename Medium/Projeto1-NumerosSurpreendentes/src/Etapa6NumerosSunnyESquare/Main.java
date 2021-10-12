package Etapa6NumerosSunnyESquare;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String scanLine;
        String[] strAux;
        long par1Value;
        long par2Increment;
        String par3Property;

        System.out.println("Welcome to Amazing Numbers!");

        printSupportedRequests();

        while (true) {
            par3Property = "";

            System.out.print("\nEnter a request: ");

            scanLine = scan.nextLine();
            strAux = scanLine.split(" ");

            if (scanLine.length() == 0) {
                printSupportedRequests();
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
            par3Property += strAux.length <= 2 ? "" : strAux[2].toLowerCase();

            if (par1Value <= 0) {
                break;
            }

            if(par2Increment <= 0){
                System.out.println("The second parameter should be a natural number.");
            }

            if (!par3Property.equals("even") && !par3Property.equals("odd") &&
                    !par3Property.equals("buzz") && !par3Property.equals("duck") &&
                    !par3Property.equals("palindromic") && !par3Property.equals("gapful") &&
                    !par3Property.equals("spy") && !par3Property.equals("")
            ) {
                System.out.println(
                        "The property [" + par3Property.toUpperCase() + "] is wrong.\n" +
                                "Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY]");
                continue;
            }

            printProperties(par1Value, par2Increment, par3Property);
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

    /**
     * Número spy: a soma de todos os dígitos é igual ao produto de todos os
     * dígitos
     * @param num
     * @return
     */
    public static boolean spy(long num){
        long sum = 0;
        long prod = 1;
        String strB;

        strB = Long.toString(num);

        for (int i = 0; i < strB.length(); i++) {
            sum += Long.parseLong(String.valueOf(strB.charAt(i)));
            prod *= Long.parseLong(String.valueOf(strB.charAt(i)));
        }

        if (sum == prod) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * @param num
     * Número sunny: se num + 1 é um número quadrado perfeito.
     * quadrado perfeito: número inteiro que é quadrado de um inteiro, ou seja
     * é o produto de um inteiro consigo mesmo.
     * @return
     * boolean (true se é sunny, false caso contrário)
     */
    public static boolean sunny(long num) {
        return square(num + 1);
    }

    public static boolean square(long num) {
        for (long i = 0; i <= num; i++) {
            if (Math.sqrt(num) == (double)i) {
                return true;
            }
        }

        return false;
    }

    public static void printProperties(long par1Value, long par2Increment, String par3Property){
        long qtdProperty = 0;

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

            if (spy(par1Value)) {
                System.out.println("         spy: true");
            } else {
                System.out.println("         spy: false");
            }

            if (square(par1Value)) {
                System.out.println("      square: true");
            } else {
                System.out.println("      square: false");
            }

            if (sunny(par1Value)) {
                System.out.println("       sunny: true");
            } else {
                System.out.println("       sunny: false");
            }

            // Odd or Even (ímpar ou par)
            if (par1Value % 2 != 0) {
                System.out.println("        even: false");
                System.out.println("         odd: true");
            } else {
                System.out.println("        even: true");
                System.out.println("         odd: false");
            }
        } else
        if (par3Property.equals("")) {
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

                if (spy(i)) {
                    System.out.print("spy, ");
                }

                if (square(i)) {
                    System.out.print("square, ");
                }

                if (sunny(i)) {
                    System.out.print("sunny, ");
                }

                if (i % 2 == 0) {
                    System.out.print("even\n");
                } else {
                    System.out.print("odd\n");
                }
            }
        } else { // pesquisar todos os próximos par2 do tipo "par3", começando por par1
            System.out.println();
            for (long i = par1Value; ; i++) {
                if (    (par3Property.equals("buzz") && buzz(i)) ||
                        (par3Property.equals("duck") && duck(i)) ||
                        (par3Property.equals("palindromic") && palindromic(i)) ||
                        (par3Property.equals("gapful") && gapful(i)) ||
                        (par3Property.equals("spy") && spy(i)) ||
                        (par3Property.equals("sunny") && spy(i)) ||
                        (par3Property.equals("square") && spy(i)) ||
                        (par3Property.equals("even") && i % 2 == 0) ||
                        (par3Property.equals("odd") && i % 2 != 0)
                ) {
                    qtdProperty++;
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

                    if (spy(i)) {
                        System.out.print("spy, ");
                    }

                    if (square(i)) {
                        System.out.print("square, ");
                    }

                    if (sunny(i)) {
                        System.out.print("sunny, ");
                    }

                    if (i % 2 == 0) {
                        System.out.print("even\n");
                    } else {
                        System.out.print("odd\n");
                    }
                }

                if(qtdProperty == par2Increment) {
                    break;
                }
            }
        }
    }

    public static void printSupportedRequests(){
        System.out.println(
            "\nSupported requests:\n" +
            "- enter a natural number to know its properties;\n" +
            "- enter two natural numbers to obtain the properties of the list:\n" +
            "  * the first parameter represents a starting number;\n" +
            "  * the second parameters show how many consecutive numbers are to be processed;\n" +
            "- two natural numbers and a property to search for;\n" +
            "- separate the parameters with one space;\n" +
            "- enter 0 to exit."
        );
    }
}