package com.example.springboot.data;

import org.springframework.data.repository.CrudRepository;

import com.example.springboot.entities.Discipline;

public interface DisciplinesRepository extends CrudRepository<Discipline, Long>{
}