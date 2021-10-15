package Etapa7NumerosJumping;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String scanLine;
        String[] strAux;
        long par1Value;
        long par2Increment;
        String par3Property1;
        String par4Property2;
        String par5Property3;

        System.out.println("Welcome to Amazing Numbers!");

        printSupportedRequests();

        while (true) {
            par3Property1 = "";
            par4Property2 = "";
            par5Property3 = "";

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
            par3Property1 += strAux.length <= 2 ? "" : strAux[2].toLowerCase();
            par4Property2 += strAux.length <= 3 ? "" : strAux[3].toLowerCase();
            par5Property3 += strAux.length <= 4 ? "" : strAux[4].toLowerCase();

            if (par1Value <= 0) {
                break;
            }

            if(par2Increment <= 0){
                System.out.println("The second parameter should be a natural number.");
            }

            if ( par5Property3.equals("") && (par4Property2.equals("") || par4Property2.equals(par3Property1)) &&
                    !par3Property1.equals("even") && !par3Property1.equals("odd") &&
                    !par3Property1.equals("buzz") && !par3Property1.equals("duck") &&
                    !par3Property1.equals("palindromic") && !par3Property1.equals("gapful") &&
                    !par3Property1.equals("spy") && !par3Property1.equals("") &&
                    !par3Property1.equals("square") && !par3Property1.equals("sunny") &&
                    !par3Property1.equals("jumping")
            ) {
                System.out.println(
                        "\nThe property [" + par3Property1.toUpperCase() + "] is wrong.\n" +
                                "Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING]");
                continue;
            }else // há o 4º parâmetro e não há o 5º parâmetro
            if(!par4Property2.equals("") && par5Property3.equals("")) {
                if ( // par3 errado e par4 errado
                        !par3Property1.equals("even") && !par3Property1.equals("odd") &&
                        !par3Property1.equals("buzz") && !par3Property1.equals("duck") &&
                        !par3Property1.equals("palindromic") && !par3Property1.equals("gapful") &&
                        !par3Property1.equals("spy") && !par3Property1.equals("") &&
                        !par3Property1.equals("square") && !par3Property1.equals("sunny") &&
                        !par3Property1.equals("jumping") &&
                        !par4Property2.equals("even") && !par4Property2.equals("odd") &&
                        !par4Property2.equals("buzz") && !par4Property2.equals("duck") &&
                        !par4Property2.equals("palindromic") && !par4Property2.equals("gapful") &&
                        !par4Property2.equals("spy") && !par4Property2.equals("square") &&
                        !par4Property2.equals("sunny") && !par4Property2.equals("jumping")

                ) {
                    System.out.println(
                            "\nThe properties [" + par3Property1 + ", " + par4Property2 + "] are wrong.\n" +
                                    "Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING]");
                    continue;
                } else
                if( // par3 errado

                        (!par3Property1.equals("even") && !par3Property1.equals("odd") &&
                                !par3Property1.equals("buzz") && !par3Property1.equals("duck") &&
                                !par3Property1.equals("palindromic") && !par3Property1.equals("gapful") &&
                                !par3Property1.equals("spy") && !par3Property1.equals("") &&
                                !par3Property1.equals("square") && !par3Property1.equals("sunny")) &&
                                !par3Property1.equals("jumping")
                ) {
                    System.out.println(
                            "\nThe property [" + par3Property1.toUpperCase() + "] is wrong.\n" +
                                    "Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING]"
                    );
                    continue;
                } else
                if(// par4 errado
                        (!par4Property2.equals("even") && !par4Property2.equals("odd") &&
                                !par4Property2.equals("buzz") && !par4Property2.equals("duck") &&
                                !par4Property2.equals("palindromic") && !par4Property2.equals("gapful") &&
                                !par4Property2.equals("spy") && !par4Property2.equals("") &&
                                !par4Property2.equals("square") && !par4Property2.equals("sunny")) &&
                                !par4Property2.equals("jumping")
                ) {
                    System.out.println(
                            "\nThe property [" + par4Property2.toUpperCase() + "] is wrong.\n" +
                                    "Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING]"
                    );
                    continue;
                } else
                if(
                        (par3Property1.equals("odd") && par4Property2.equals("even")) ||
                                (par3Property1.equals("even") && par4Property2.equals("odd")) ||
                                (par3Property1.equals("duck") && par4Property2.equals("spy")) ||
                                (par3Property1.equals("spy") && par4Property2.equals("duck")) ||
                                (par3Property1.equals("sunny") && par4Property2.equals("square")) ||
                                (par3Property1.equals("square") && par4Property2.equals("sunny"))
                ) {
                    System.out.println(
                            "\nThe request contains mutually exclusive properties: [" + par4Property2 + ", " + par3Property1 + "]\n" +
                                    "There are no numbers with these properties."
                    );
                    continue;
                }
            } else { // há o 5º parâmetro
                if( // par3 errado, par4 errado e par5 errado
                        !par3Property1.equals("even") && !par3Property1.equals("odd") &&
                        !par3Property1.equals("buzz") && !par3Property1.equals("duck") &&
                        !par3Property1.equals("palindromic") && !par3Property1.equals("gapful") &&
                        !par3Property1.equals("spy") && !par3Property1.equals("") &&
                        !par3Property1.equals("square") && !par3Property1.equals("sunny") &&
                        !par3Property1.equals("jumping") &&

                        !par4Property2.equals("even") && !par4Property2.equals("odd") &&
                        !par4Property2.equals("buzz") && !par4Property2.equals("duck") &&
                        !par4Property2.equals("palindromic") && !par4Property2.equals("gapful") &&
                        !par4Property2.equals("spy") && !par4Property2.equals("square") &&
                        !par4Property2.equals("sunny") && !par4Property2.equals("jumping") &&

                        !par5Property3.equals("even") && !par5Property3.equals("odd") &&
                        !par5Property3.equals("buzz") && !par5Property3.equals("duck") &&
                        !par5Property3.equals("palindromic") && !par5Property3.equals("gapful") &&
                        !par5Property3.equals("spy") && !par5Property3.equals("square") &&
                        !par5Property3.equals("sunny") && !par5Property3.equals("jumping")

                ) {
                    System.out.println(
                            "\nThe properties [" + par3Property1 + ", " + par4Property2 + ", " + par5Property3 + "] are wrong.\n" +
                                    "Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING]");
                    continue;
                } else
                if ( // par3 errado e par4 errado
                        !par3Property1.equals("even") && !par3Property1.equals("odd") &&
                                !par3Property1.equals("buzz") && !par3Property1.equals("duck") &&
                                !par3Property1.equals("palindromic") && !par3Property1.equals("gapful") &&
                                !par3Property1.equals("spy") && !par3Property1.equals("") &&
                                !par3Property1.equals("square") && !par3Property1.equals("sunny") &&
                                !par3Property1.equals("jumping") &&
                                !par4Property2.equals("even") && !par4Property2.equals("odd") &&
                                !par4Property2.equals("buzz") && !par4Property2.equals("duck") &&
                                !par4Property2.equals("palindromic") && !par4Property2.equals("gapful") &&
                                !par4Property2.equals("spy") && !par4Property2.equals("square") &&
                                !par4Property2.equals("sunny") && !par4Property2.equals("jumping")

                ) {
                    System.out.println(
                            "\nThe properties [" + par3Property1 + ", " + par4Property2 + "] are wrong.\n" +
                                    "Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING]");
                    continue;
                } else
                if( // par3 errado

                        (!par3Property1.equals("even") && !par3Property1.equals("odd") &&
                                !par3Property1.equals("buzz") && !par3Property1.equals("duck") &&
                                !par3Property1.equals("palindromic") && !par3Property1.equals("gapful") &&
                                !par3Property1.equals("spy") && !par3Property1.equals("") &&
                                !par3Property1.equals("square") && !par3Property1.equals("sunny")) &&
                                !par3Property1.equals("jumping")
                ) {
                    System.out.println(
                            "\nThe property [" + par3Property1.toUpperCase() + "] is wrong.\n" +
                                    "Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING]"
                    );
                    continue;
                } else
                if(// par4 errado
                        (!par4Property2.equals("even") && !par4Property2.equals("odd") &&
                        !par4Property2.equals("buzz") && !par4Property2.equals("duck") &&
                        !par4Property2.equals("palindromic") && !par4Property2.equals("gapful") &&
                        !par4Property2.equals("spy") && !par4Property2.equals("") &&
                        !par4Property2.equals("square") && !par4Property2.equals("sunny")) &&
                        !par4Property2.equals("jumping")
                ) {
                    System.out.println(
                            "\nThe property [" + par4Property2.toUpperCase() + "] is wrong.\n" +
                                    "Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING]"
                    );
                    continue;
                } else
                if(// par5 errado
                        (!par5Property3.equals("even") && !par5Property3.equals("odd") &&
                        !par5Property3.equals("buzz") && !par5Property3.equals("duck") &&
                        !par5Property3.equals("palindromic") && !par5Property3.equals("gapful") &&
                        !par5Property3.equals("spy") && !par5Property3.equals("") &&
                        !par5Property3.equals("square") && !par5Property3.equals("sunny")) &&
                        !par5Property3.equals("jumping")
                ) {
                    System.out.println(
                            "\nThe property [" + par5Property3.toUpperCase() + "] is wrong.\n" +
                                    "Available properties: [EVEN, ODD, BUZZ, DUCK, PALINDROMIC, GAPFUL, SPY, SQUARE, SUNNY, JUMPING]"
                    );
                    continue;
                } else
                if((par3Property1.equals("odd") && par4Property2.equals("even")) ||
                    (par3Property1.equals("even") && par4Property2.equals("odd")) ||
                    (par3Property1.equals("duck") && par4Property2.equals("spy")) ||
                    (par3Property1.equals("spy") && par4Property2.equals("duck")) ||
                    (par3Property1.equals("sunny") && par4Property2.equals("square")) ||
                    (par3Property1.equals("square") && par4Property2.equals("sunny"))
                ) {
                    System.out.println(
                            "\nThe request contains mutually exclusive properties: [" + par4Property2 + ", " + par3Property1 + "]\n" +
                                    "There are no numbers with these properties."
                    );
                    continue;
                } else
                if((par3Property1.equals("odd") && par5Property3.equals("even")) ||
                        (par3Property1.equals("even") && par5Property3.equals("odd")) ||
                        (par3Property1.equals("duck") && par5Property3.equals("spy")) ||
                        (par3Property1.equals("spy") && par5Property3.equals("duck")) ||
                        (par3Property1.equals("sunny") && par5Property3.equals("square")) ||
                        (par3Property1.equals("square") && par5Property3.equals("sunny"))
                ) {
                    System.out.println(
                            "\nThe request contains mutually exclusive properties: [" + par5Property3 + ", " + par3Property1 + "]\n" +
                                    "There are no numbers with these properties."
                    );
                    continue;
                } else
                if((par4Property2.equals("odd") && par5Property3.equals("even")) ||
                        (par4Property2.equals("even") && par5Property3.equals("odd")) ||
                        (par4Property2.equals("duck") && par5Property3.equals("spy")) ||
                        (par4Property2.equals("spy") && par5Property3.equals("duck")) ||
                        (par4Property2.equals("sunny") && par5Property3.equals("square")) ||
                        (par4Property2.equals("square") && par5Property3.equals("sunny"))
                ) {
                    System.out.println(
                            "\nThe request contains mutually exclusive properties: [" + par5Property3 + ", " + par4Property2 + "]\n" +
                                    "There are no numbers with these properties."
                    );
                    continue;
                }
            }

            printProperties(par1Value, par2Increment, par3Property1, par4Property2, par5Property3);

        }

        System.out.println("\nGoodbye!");
    }

    /**
     * Um número é Buzz se é divisível por 7 ou termina com 7.
     * @param num
     */
    public static boolean buzz(long num){
        //Buzz
        return num % 7 == 0 || num % 10 == 7;
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
        StringBuilder strInverseNum = new StringBuilder();

        strNum = String.valueOf(num);
        for (int i = strNum.length() - 1; i >= 0; i--) {
            strInverseNum.append(strNum.charAt(i));
        }

        return strNum.equals(strInverseNum.toString());
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

            return num % longConcat == 0;
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

        return sum == prod;
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
        long tmp;

        tmp = (int)Math.sqrt(num);

        return tmp * tmp == num;
    }

    /**
     * @param num
     * @return
     * Número jumping: os dígitos adjacentes dentro do número diferem por 1.
     * A diferença entre 9 e 0 não é considerada como 1.
     * Números de um dígito são considerados números jumping.
     * Por exemplo, 78987 e 4343456 são números de salto, mas 796 e 89098 não são.
     */
    public static boolean jumping(long num) {
        boolean flag = true;

        while(num != 0)
        {
            int digit1 = (int) (num % 10);
            num = num/10;
            if(num != 0)
            {
                int digit2 = (int) (num % 10);
                if(Math.abs(digit1 - digit2) != 1)
                {
                    flag = false;
                    break;
                }
            }
        }

        if(flag)
            return true;
        else
            return false;

    }


    public static void printProperties(
            long par1Value,
            long par2Increment,
            String par3Property1,
            String part4Property2,
            String par5Property3
    ){
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

            if (jumping(par1Value)) {
                System.out.println("     jumping: true");
            } else {
                System.out.println("     jumping: false");
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
        if (par3Property1.equals("")) {
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

                if (jumping(i)) {
                    System.out.print("jumping, ");
                }

                if (i % 2 == 0) {
                    System.out.print("even\n");
                } else {
                    System.out.print("odd\n");
                }
            }
        } else
        if (part4Property2.equals("")) { // pesquisar todos os próximos par2 do tipo "par3", começando por par1
            System.out.println();
            for (long i = par1Value; ; i++) {
                if (    (par3Property1.equals("buzz") && buzz(i)) ||
                        (par3Property1.equals("duck") && duck(i)) ||
                        (par3Property1.equals("palindromic") && palindromic(i)) ||
                        (par3Property1.equals("gapful") && gapful(i)) ||
                        (par3Property1.equals("spy") && spy(i)) ||
                        (par3Property1.equals("sunny") && sunny(i)) ||
                        (par3Property1.equals("square") && square(i)) ||
                        (par3Property1.equals("jumping") && jumping(i)) ||
                        (par3Property1.equals("even") && i % 2 == 0) ||
                        (par3Property1.equals("odd") && i % 2 != 0)
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

                    if (jumping(i)) {
                        System.out.print("jumping, ");
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
        } else
        if(par5Property3.equals("")){ // par3 e par4
            System.out.println();
            for (long i = par1Value; ; i++) {
                if (    ((par3Property1.equals("buzz") && buzz(i)) ||
                        (par3Property1.equals("duck") && duck(i)) ||
                        (par3Property1.equals("palindromic") && palindromic(i)) ||
                        (par3Property1.equals("gapful") && gapful(i)) ||
                        (par3Property1.equals("spy") && spy(i)) ||
                        (par3Property1.equals("sunny") && sunny(i)) ||
                        (par3Property1.equals("square") && square(i)) ||
                        (par3Property1.equals("jumping") && jumping(i)) ||
                        (par3Property1.equals("even") && i % 2 == 0) ||
                        (par3Property1.equals("odd") && i % 2 != 0)) &&

                        ((part4Property2.equals("buzz") && buzz(i)) ||
                        (part4Property2.equals("duck") && duck(i)) ||
                        (part4Property2.equals("palindromic") && palindromic(i)) ||
                        (part4Property2.equals("gapful") && gapful(i)) ||
                        (part4Property2.equals("spy") && spy(i)) ||
                        (part4Property2.equals("sunny") && sunny(i)) ||
                        (part4Property2.equals("square") && square(i)) ||
                        (part4Property2.equals("jumping") && jumping(i)) ||
                        (part4Property2.equals("even") && i % 2 == 0) ||
                        (part4Property2.equals("odd") && i % 2 != 0))
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

                    if (jumping(i)) {
                        System.out.print("jumping, ");
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
        } else { // tem o par5
            System.out.println();
            for (long i = par1Value; ; i++) {
                if (    ((par3Property1.equals("buzz") && buzz(i)) ||
                        (par3Property1.equals("duck") && duck(i)) ||
                        (par3Property1.equals("palindromic") && palindromic(i)) ||
                        (par3Property1.equals("gapful") && gapful(i)) ||
                        (par3Property1.equals("spy") && spy(i)) ||
                        (par3Property1.equals("sunny") && sunny(i)) ||
                        (par3Property1.equals("square") && square(i)) ||
                        (par3Property1.equals("jumping") && jumping(i)) ||
                        (par3Property1.equals("even") && i % 2 == 0) ||
                        (par3Property1.equals("odd") && i % 2 != 0)) &&

                        ((part4Property2.equals("buzz") && buzz(i)) ||
                        (part4Property2.equals("duck") && duck(i)) ||
                        (part4Property2.equals("palindromic") && palindromic(i)) ||
                        (part4Property2.equals("gapful") && gapful(i)) ||
                        (part4Property2.equals("spy") && spy(i)) ||
                        (part4Property2.equals("sunny") && sunny(i)) ||
                        (part4Property2.equals("square") && square(i)) ||
                        (part4Property2.equals("jumping") && jumping(i)) ||
                        (part4Property2.equals("even") && i % 2 == 0) ||
                        (part4Property2.equals("odd") && i % 2 != 0)) &&

                        ((par5Property3.equals("buzz") && buzz(i)) ||
                        (par5Property3.equals("duck") && duck(i)) ||
                        (par5Property3.equals("palindromic") && palindromic(i)) ||
                        (par5Property3.equals("gapful") && gapful(i)) ||
                        (par5Property3.equals("spy") && spy(i)) ||
                        (par5Property3.equals("sunny") && sunny(i)) ||
                        (par5Property3.equals("square") && square(i)) ||
                        (par5Property3.equals("jumping") && jumping(i)) ||
                        (par5Property3.equals("even") && i % 2 == 0) ||
                        (par5Property3.equals("odd") && i % 2 != 0))
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

                    if (jumping(i)) {
                        System.out.print("jumping, ");
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
            "  * the second parameter shows how many consecutive numbers are to be printed;\n" +
            "- two natural numbers and two properties to search for;\n" +
            "- separate the parameters with one space;\n" +
            "- enter 0 to exit."
        );
    }
}
