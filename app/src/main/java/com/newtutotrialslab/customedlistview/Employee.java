package com.newtutotrialslab.customedlistview;

/**
 * Created by Srijan on 03-Jul-15.
 */
public class Employee {

    private String name;
    private String address;
    private int age;

    public Employee(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }
}
