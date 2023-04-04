package com.example.springboot.data;

import java.util.ArrayList;
import java.util.List;

import com.example.springboot.entities.Discipline;

public class DisciplinesRepository {
    private static List<Discipline> disciplines = new ArrayList<>();

    public static List<Discipline> getDisciplines(){
        return disciplines;
    }

    public static void addDiscipline(Discipline discipline){
        disciplines.add(discipline);
    }

    public static void removeDiscipline(Discipline discipline){
        disciplines.remove(discipline);
    }

    public static Discipline getDiscipline(String code){
        for(Discipline discipline : disciplines){
            if(discipline.getCode().equals(code)){
                return discipline;
            }
        }
        return null;
    }
}