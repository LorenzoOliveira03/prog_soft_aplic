package com.example.springboot.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.springboot.Entity.Turma;


public interface TurmasRepository extends CrudRepository<Turma, Long> {
    
}
