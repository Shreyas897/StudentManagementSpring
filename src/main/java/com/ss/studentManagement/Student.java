package com.ss.studentManagement;

public class Student {
    private String name;
    private int id;
    private int age;
    private String state;

    public Student(String name, int id, int age, String state) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
