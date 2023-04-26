package com.example.springboot.Dto;


public class CreateTurmaDTO {
    public String code;
    public String horario;
    public Long disciplineId;
    public Long[] studentsId;

    public CreateTurmaDTO(String code, String horario, Long disciplineId, Long[] studentsId) {
        this.code = code;
        this.horario = horario;
        this.disciplineId = disciplineId;
        this.studentsId = studentsId;
    }
}
