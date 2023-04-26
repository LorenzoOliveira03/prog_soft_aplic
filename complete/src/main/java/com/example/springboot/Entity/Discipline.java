package com.example.springboot.Entity;

import java.util.Arrays;

import io.micrometer.common.lang.Nullable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "disciplines")
public class Discipline {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(name = "code", nullable = false)
    private String code;
    @Column(name = "name", nullable = false)
    private String name;
    
    @Nullable
    @OneToMany(mappedBy = "discipline")
    private Turma[] turmas;

    protected Discipline() {}

    public Discipline(String code, String name){
        this.code = code;
        this.name = name;
    }

    public String getCode(){
        return this.code;
    }

    public String getName(){
        return this.name;
    }

    public Long getId(){
        return this.id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public boolean AddTurma(Turma turma){
        if (turmas == null){
            turmas = new Turma[1];
            turmas[0] = turma;
            return true;
        }
        else{
            int length = turmas.length;
            turmas = Arrays.copyOf(turmas, length + 1);
            turmas[length] = turma;
            return true;
        }
    }


    @Override
    public String toString() {
        return "Discipline{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", turma=" + turmas +
                '}';
    }
}