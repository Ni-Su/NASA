package org.example;

public class Main {
    public static void main(String[] args) {
        Cat barsik = new Cat("Барсик", 5, 4);
        String barsikName = barsik.getName();
        int barsikAge = barsik.getAge();
        int barsikWeight = barsik.getWeight();

        System.out.println("Зовут кота: " + barsikName);
        System.out.println("Возраст кота: " + barsikAge);
        System.out.println("Вес кота: " + barsikWeight);


       barsik.setName("Василий");
       System.out.println("Новое имя кота — " + barsik.getName());
       barsik.setAge(-1000);
       System.out.println("Возраст Барсика — " + barsik.getAge() + " лет");

       Cat tom = new Cat();
       System.out.println(tom.getName());
    }
}



