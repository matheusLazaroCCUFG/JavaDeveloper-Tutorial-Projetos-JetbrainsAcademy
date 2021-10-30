package atividades.atividade7File;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        atividade3();
    }

    public static void atividade2() {
        String pathToFile = "/home/matheuslazaro/Desktop/JavaDeveloper-JetbrainsAcademy/JavaDeveloper-Tutorial-Projetos-JetbrainsAcademy/Medium/Projeto1-FerramentaDeClassificacao/src/atividades/atividade7File/files/dataset_91007.txt";
        //String pathToFile = "./files/dataset_91033.txt";
        File file = new File(pathToFile);
        long maior = 0;
        long tmp = 0;

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLong()) {
                tmp = scanner.nextLong();
                if (tmp > maior) {
                    maior = tmp;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("No file found: " + pathToFile);
        }
        System.out.println(maior);
    }

    public static void atividade3() {
        String pathToFile = "/home/matheuslazaro/Desktop/JavaDeveloper-JetbrainsAcademy/JavaDeveloper-Tutorial-Projetos-JetbrainsAcademy/Medium/Projeto1-FerramentaDeClassificacao/src/atividades/atividade7File/files/dataset_91022.txt";
        //String pathToFile = "./files/dataset_91033.txt";
        File file = new File(pathToFile);
        long counter = 0;
        long tmp = 0;

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLong()) {
                tmp = scanner.nextLong();
                if (tmp > 9999) {
                    counter++;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("No file found: " + pathToFile);
        }
        System.out.println(counter);
    }
}
