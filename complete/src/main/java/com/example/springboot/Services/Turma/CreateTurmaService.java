package com.example.springboot.Services.Turma;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboot.Dto.CreateTurmaDTO;
import com.example.springboot.Entity.Discipline;
import com.example.springboot.Entity.Student;
import com.example.springboot.Entity.Turma;
import com.example.springboot.Repository.DisciplinesRepository;
import com.example.springboot.Repository.StudentsRepository;
import com.example.springboot.Repository.TurmasRepository;

@Service
public class CreateTurmaService {
    private TurmasRepository turmasRepository;
    private DisciplinesRepository disciplinesRepository;
    private StudentsRepository studentsRepository;

    @Autowired
    public CreateTurmaService(TurmasRepository turmasRepository, DisciplinesRepository disciplinesRepository, StudentsRepository studentsRepository) {
        this.turmasRepository = turmasRepository;
        this.disciplinesRepository = disciplinesRepository;
        this.studentsRepository = studentsRepository;
    }

    public Turma execute(CreateTurmaDTO createTurmaDTO) {
        try{
            Discipline discipline = disciplinesRepository.findById(createTurmaDTO.disciplineId).get();
            Turma turma = new Turma(createTurmaDTO.code, createTurmaDTO.horario, discipline);

            if(createTurmaDTO.studentsId != null){
                for(Long id : createTurmaDTO.studentsId){
                    System.out.println(id);

                    Student student = studentsRepository.findByMatricula(id);

                    if(student == null) {
                        System.out.println("Aluno não encontrado");
                        continue;
                    }

                    turma.addStudent(student);
                }
            }
    
            turmasRepository.save(turma);
            return turma;

        } catch (Exception e) {
            throw e;
        }

    }
}
