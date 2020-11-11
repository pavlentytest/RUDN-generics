package com.company;

public class Car<T> {
    private String name;
    private int year;

    public Car(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public <T> void printArray(T[] arr) {
        System.out.println("Test!");
    }

    public void doSmth(String... str) {
        String s = str[0];
        // str.legth
    }

}
