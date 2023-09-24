package org.example;

public class Cat {
    private String name;
    private int age;
    private int weight;

    public Cat(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Ошибка! Возраст не может быть отрицатальным!");
        }
    }

    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }
    //конструктор 2 - если создаём
    public Cat() {
        name = "Tom";
        age = 1;
        weight = 2;
    }
}