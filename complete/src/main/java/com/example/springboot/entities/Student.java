package com.example.springboot.entities;

public class Student {
    private String matricula;
    private String name;
    private String doc;
    private Address address;

    public Student(String name, String doc, Address address) {
        this.name = name;
        this.doc = doc;
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public String getDoc() {
        return doc;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", doc='" + doc + '\'' +
                ", address=" + address +
                '}';
    }
}