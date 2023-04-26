package com.example.springboot.Controllers.Discipline;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.Entity.Discipline;
import com.example.springboot.Repository.DisciplinesRepository;

@RestController
public class GetDisciplineByIDController {
    private final DisciplinesRepository disciplinesRepository;

    @Autowired
    public GetDisciplineByIDController(DisciplinesRepository disciplinesRepository) {
        this.disciplinesRepository = disciplinesRepository;
    }

	@GetMapping("/discipline/{id}")
	public Discipline get(@PathVariable("id") Long id) {
        Discipline disc = disciplinesRepository.findById(id).get();
        
        return disc;
	}
}
