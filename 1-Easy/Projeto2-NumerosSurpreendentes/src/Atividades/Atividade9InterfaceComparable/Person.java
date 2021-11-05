package Atividades.Atividade9InterfaceComparable;

public class Person implements Comparable<Person>{
    private String name;
    private int age;
    private int height;
    private int weight;

    public Person(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWeight() {
        return this.weight;
    }

    /**
     * Comparar por name. Se for igual, comparar pela age
     * @param person
     * @return
     */
    @Override
    public int compareTo(Person person) {
        return !person.name.equals(name)
            ? String.valueOf(getName()).compareTo(person.getName())
            : Integer.valueOf(getAge()).compareTo(person.getAge());
    }
}
