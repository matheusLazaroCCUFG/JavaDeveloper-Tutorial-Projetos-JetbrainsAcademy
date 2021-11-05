package Atividades;

public class Atividade10StringBuilder {
    public static void main(String[] args){
        System.out.println(createEnglishAlphabet());
    }

    /**
     * prática usando StringBuilder para concatenar letras
     *
     */
    public static StringBuilder createEnglishAlphabet() {
        StringBuilder strB = new StringBuilder();
        char letter = 'A';

        while (letter <= 'Y') {
            strB.append(letter).append(" ");
            letter++;
        }
        strB.append("Z");
        return strB;
    }
}
