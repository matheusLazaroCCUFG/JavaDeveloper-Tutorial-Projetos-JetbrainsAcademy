package atividades;

import java.util.Scanner;

public class Atividade1 {

    /**
     * @param val
     * Converter Long val para int
     * @return int
     */
    public static int convert(Long val) {

        if (val == null) {
            return 0;
        } else {
            if (val > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            } else if (val < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
        }
        return val.intValue();
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String val = scanner.nextLine();
        Long longVal = "null".equals(val) ? null : Long.parseLong(val);
        System.out.println(convert(longVal));

        Long val1 = 4321L;

        Long val2 = new Long("4321");

        Long val3 = Long.parseLong("4321");

        Long val4 = new Long(4321);
    }

    public static boolean toPrimitive(Boolean b) {
        if (b == null) {
            return false;
        } else {
            return b.booleanValue();
        }
    }
}