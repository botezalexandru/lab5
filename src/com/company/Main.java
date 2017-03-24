package com.company;

public class Main {

    public static void main(String[] args) {

        Person p = Person.getInstance();
        p.setAccount("name");
        Person p1 = Person.getInstance();
        System.out.println(p1.getAccount());
    }
}
