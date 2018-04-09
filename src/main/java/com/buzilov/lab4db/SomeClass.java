package com.buzilov.lab4db;

public class SomeClass {
    private int someNumber;
    private String someName;

    public SomeClass(int someNumber, String someName) {
        this.someNumber = someNumber;
        this.someName = someName;
    }

    public int getSomeNumber() {
        return someNumber;
    }

    public void setSomeNumber(int someNumber) {
        this.someNumber = someNumber;
    }

    public String getSomeName() {
        return someName;
    }

    public void setSomeName(String someName) {
        this.someName = someName;
    }

    @Override
    public String toString() {
        return "SomeClass{" +
                "someNumber=" + someNumber +
                ", someName='" + someName + '\'' +
                '}';
    }
}
