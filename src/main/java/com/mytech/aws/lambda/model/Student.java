package com.appsdeveloperblog.aws.lambda.model;

public class Student {
    private int id;
    private String name;
    private double cgpa;
    private int age;
    public Student(int id, String name, double cgpa, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getCgpa() {
        return cgpa;
    }
    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}