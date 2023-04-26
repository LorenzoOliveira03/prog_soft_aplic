package com.example.springboot.Entity;

import io.micrometer.common.lang.Nullable;
import jakarta.persistence.*;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long matricula;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "doc", nullable = false)
    private String doc;
    @Column(name = "address", nullable = false)
    private String address;

    @Nullable
    @ManyToMany
    @JoinTable(name = "student_turma",
            joinColumns = @JoinColumn(name = "student_matricula"),
            inverseJoinColumns = @JoinColumn(name = "turma_id"))
    private Turma[] turmas;

    protected Student() {}

    public Student(String name, String doc, String address) {
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
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
