package com.example.springboot.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.springboot.Entity.Discipline;

public interface DisciplinesRepository extends CrudRepository<Discipline, Long>{
}