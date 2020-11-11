package com.company;

// T - тип данных
// V - значение
// N - число
//....

public class Animal<T> {
    private T t;

    public Animal(T t) {
        this.t = t;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
