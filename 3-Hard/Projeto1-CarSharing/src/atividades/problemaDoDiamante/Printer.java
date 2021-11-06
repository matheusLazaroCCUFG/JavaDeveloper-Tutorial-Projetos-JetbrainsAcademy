package atividades.problemaDoDiamante;

interface Printer {
    default void greeting() {
        System.out.println("Printer is ready");
    }
}
