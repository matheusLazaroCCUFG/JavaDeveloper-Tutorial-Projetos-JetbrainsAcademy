package atividades.atividade6Files;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Esta é uma maneira de percorrer todos os subdiretórios e coletar todos os arquivos em uma lista.
 *
 * O método listFiles retorna os arquivos e diretórios aninhados de um diretório como uma matriz.
 */
public class Main {

    public List<File> getAllFiles(File rootDir) {
        File[] children = rootDir.listFiles();

        if (children == null || children.length == 0) {
            return Collections.emptyList();
        }

        List<File> files = new ArrayList<>();
        for (File child : children) {
            if (child.isDirectory()) {
                files.addAll(getAllFiles(child));
            } else {
                files.add(child);
            }
        }

        return files;
    }
}
