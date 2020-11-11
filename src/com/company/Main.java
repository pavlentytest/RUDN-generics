package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        int[] a = new int[10];

        for(int i: a) {
            System.out.println(i);
        }

        ArrayList arrayList = new ArrayList();
        arrayList.add(100);
        arrayList.add("Test");
        arrayList.add(new Object());


        int b = (int) arrayList.get(1);

        System.out.println("-----");
        for(Object obj: arrayList) {
            System.out.println(obj);
        }
        System.out.println("-----");

        System.out.println(arrayList.get(0));

        for(int i=0;i<arrayList.size();i++) {
          //  System.out.println(arrayList.get(i));
        }

        ArrayList<String> names = new ArrayList<>();
        names.add("Ivan");
        names.add("Petr");
        names.add("Maria");
      //  names.add(0);

        for(String obj: names) {

        }

        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW",1990));
        cars.add(new Car("OPEL",1992));
        cars.add(new Car("TESLA",2019));

        Car<Integer> toyota = new Car<>("Toyota",1990);
        Integer[] ints = new Integer[2];
        toyota.printArray(ints);

        toyota.doSmth("adfgasdfg","adfgadfg","asdfgasdfg");
        toyota.doSmth("123123");


        ArrayList<Animal<String>> animals = new ArrayList<>();
        animals.add(new Animal<>("Cat"));
        animals.add(new Animal<>("Dog"));

        ArrayList<School<String,Integer>> schools = new ArrayList<>(5);
        schools.add(new School<>("Moscow",1900));

        int year = schools.get(0).getV();

    }
}
