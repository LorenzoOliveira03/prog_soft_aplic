package com.example.springboot.Controllers.Discipline;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.Entity.Discipline;
import com.example.springboot.Repository.DisciplinesRepository;

@RestController
public class GetAllDisciplineController {
    private final DisciplinesRepository disciplinesRepository;

    @Autowired
    public GetAllDisciplineController(DisciplinesRepository disciplinesRepository) {
        this.disciplinesRepository = disciplinesRepository;
    }

	@GetMapping("/discipline/all")
	public List<Discipline> getAll() {
        List<Discipline> disc = (List<Discipline>) disciplinesRepository.findAll();
        
        return disc;
	}
}
