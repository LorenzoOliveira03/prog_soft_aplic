package com.example.springboot.entities;

import jakarta.persistence.*;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long matricula;
    private String name;
    private String doc;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;

    protected Student() {}

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

    public Long getMatricula() {
        return matricula;
    }

    public void setMatricula(Long matricula) {
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