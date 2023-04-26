package com.example.springboot.Entity;

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
        this.students = new Student[0];
    }

    public Long getId(){
        return this.id;
    }

    public String getCode(){
        return this.code;
    }

    public void setCode(String code){
        this.code = code;
    }

    public String getHorario(){
        return this.horario;
    }

    public void setHorario(String horario){
        this.horario = horario;
    }

    public Discipline getDiscipline(){
        return this.discipline;
    }

    public void setDiscipline(Discipline discipline){
        this.discipline = discipline;
    }

    public Student[] getStudents(){
        return this.students;
    }

    public void setStudents(Student[] students){
        this.students = students;
    }

    public boolean addStudent(Student stu){
        if(stu == null){
            return false;
        }

        for(Student s : this.students){
            if(s.getMatricula() == stu.getMatricula()){
                return false;
            }
        }

        Student[] newStudents = new Student[this.students.length + 1];
        for(int i = 0; i < this.students.length; i++){
            newStudents[i] = this.students[i];
        }
        newStudents[this.students.length] = stu;
        this.students = newStudents;
        return true;
    }

    @Override
    public String toString(){
        return "Turma{" +
                "code='" + code + '\'' +
                ", horario='" + horario + '\'' +
                ", discipline='" + discipline + '\'' +
                '}';
    }


}
