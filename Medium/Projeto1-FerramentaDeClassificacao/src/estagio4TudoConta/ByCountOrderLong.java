package estagio4TudoConta;

import java.util.Collection;
import java.util.Iterator;
import java.util.SortedSet;

public class ByCountOrderLong implements Comparable<ByCountOrderLong> {
    private static long total = 0;
    private long qtdVezes;
    private long vezes;
    private long valor;

    public ByCountOrderLong(long vezes, long valor) {
        this.vezes = vezes;
        this.valor = valor;
        qtdVezes++;
    }

    public void setQtdVezes(long qtdVezes) {
        this.qtdVezes = qtdVezes;
    }

    public long getVezes() {
        return vezes;
    }

    public long getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return getValor() + ": " + getVezes() + " time(s)\n";
    }


    /**
     * Ordena por quantidade de vezes
     * Se a quantidade de vezes for igual, ordena por valor
     * @param other
     * @return
     */
    @Override
    public int compareTo(ByCountOrderLong other) {
        int ret = Long.valueOf(getVezes()).compareTo(other.getVezes());
        return ret == 0
                ? Long.valueOf(getValor()).compareTo(other.getValor())
                : ret;
    }
}
