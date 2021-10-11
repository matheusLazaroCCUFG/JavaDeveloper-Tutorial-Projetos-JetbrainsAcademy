package Atividades.Atividade8InterfaceComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Article implements Comparable<Article>{
    private String title;
    private int size;

    public Article(String title, int size) {
        this.title = title;
        this.size = size;
    }

    public String getTitle() {
        return this.title;
    }

    public int getSize() {
        return this.size;
    }

    /**
     * Comparar por size. Se forem iguais, comparar por title.
     * @param otherArticle
     * @return
     */
    @Override
    public int compareTo(Article otherArticle) {
        int ret = Integer.valueOf(getSize()).compareTo(otherArticle.getSize());
        return ret == 0
            ? String.valueOf(getTitle()).compareTo(otherArticle.getTitle())
            : ret;
    }

    @Override
    public String toString() {
        return "Article{" +
                "title='" + title + '\'' +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        List<Article> articles = new ArrayList<>();

        Article article1 = new Article("How to bake an awesome cake?", -300);
        Article article2 = new Article("Alice likes pancakes...But who doesn't?", -800);
        Article article3 = new Article("Germany wants to win EURO 2020!", -500);
        articles.add(article1);
        articles.add(article2);
        articles.add(article3);

        Collections.sort(articles);
        System.out.println(articles);


    }
}
