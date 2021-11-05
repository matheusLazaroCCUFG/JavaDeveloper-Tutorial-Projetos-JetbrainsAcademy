package atividades.atividade3Collections;

class Test {
    public static void main(String[] args) {
        Main main = new Main();
        main.init();

        for (String str : main.list) {
            System.out.println(str);
        }
    }
}
