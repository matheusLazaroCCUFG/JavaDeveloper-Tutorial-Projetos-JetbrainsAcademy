package atividades.problemaDoDiamante;

class ConsoleWriter implements Printer, Notifier {
    @Override
    public void greeting() {
        Printer.super.greeting();
    }
    // override greeting method according to Printer default implementation
}
