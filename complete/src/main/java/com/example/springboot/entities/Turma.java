package com.example.springboot.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "turmas")
public class Turma {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(name = "code", nullable = true)
    private String code;
    @Column(name = "horario", nullable = true)
    private String horario;

    @ManyToOne
    @JoinColumn(name = "discipline_id")
    private Discipline discipline;

    @ManyToMany(mappedBy = "turmas")
    private Student[] students;

    protected Turma() {}

    public Turma(String code, String horario, Discipline discipline){
        this.code = code;
        this.horario = horario;
        this.discipline = discipline;
    }
}
