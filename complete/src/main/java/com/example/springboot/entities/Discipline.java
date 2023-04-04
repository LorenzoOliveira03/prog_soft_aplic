package com.example.springboot.entities;

import java.util.Arrays;

public class Discipline {
    private String code;
    private String name;
    private String[] horarios;
    private int[] turmas;

    public Discipline(String code, String name, String[] horarios, int[] turmas){
        this.code = code;
        this.name = name;
        this.horarios = horarios;
        this.turmas = turmas;
    }

    public String getCode(){
        return this.code;
    }

    public String getName(){
        return this.name;
    }

    public String[] getHorarios(){
        return this.horarios;
    }

    public void setHorarios(String[] horarios) {
        this.horarios = horarios;
    }

    public int[] getTurmas(){
        return this.turmas;
    }

    public void setTurmas(int[] turmas) {
        this.turmas = turmas;
    }

    @Override
    public String toString() {
        return "Discipline{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", horarios=" + Arrays.toString(horarios) +
                ", turmas=" + Arrays.toString(turmas) +
                '}';
    }
}