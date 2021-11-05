package estagio5Erro;

/**
 * Ordenação por quantidade de vezes de uma string ou lexicograficamente
 */
public class ByCountOrderString implements Comparable<ByCountOrderString> {
    private int qtdStr;
    private int total;
    private String str;

    public ByCountOrderString(int qtdStr, String str, int total) {
        this.qtdStr = qtdStr;
        this.str = str;
        this.total = total;
    }

    public int getQtdStr() {
        return qtdStr;
    }

    public String getStr() {
        return str;
    }

    @Override
    public String toString() {
        return getStr() + ": " + getQtdStr() + " time(s)¬ " + (int)Math.round(100 * (double)qtdStr /  total)+ "%\n";

    }

    @Override
    public int compareTo(ByCountOrderString other) {
        int ret = Integer.valueOf(getQtdStr()).compareTo(other.getQtdStr());
        return ret == 0 ? String.valueOf(getStr()).compareTo(other.getStr()) :
            ret;
    }
}
