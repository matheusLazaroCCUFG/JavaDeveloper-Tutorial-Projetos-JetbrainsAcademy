package sorting;

class ByCountOrderLong implements Comparable<ByCountOrderLong> {
    private long total;
    private long vezes;
    private long valor;

    public ByCountOrderLong(long vezes, long valor, long total) {
        this.vezes = vezes;
        this.valor = valor;
        this.total = total;
    }

    public long getVezes() {
        return vezes;
    }

    public long getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return getValor() + ": " + getVezes() + " time(s)¬ " + (int)Math.round(100 * (double)vezes /  total)+ "%\n";
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
