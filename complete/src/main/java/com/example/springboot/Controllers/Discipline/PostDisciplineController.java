package com.example.springboot.Controllers.Discipline;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.data.DisciplinesRepository;
import com.example.springboot.entities.Discipline;

@RestController
public class PostDisciplineController {
    private final DisciplinesRepository disciplinesRepository;

    @Autowired
    public PostDisciplineController(DisciplinesRepository disciplinesRepository) {
        this.disciplinesRepository = disciplinesRepository;
    }

	@PostMapping("/discipline")
	public Discipline insert(@RequestBody Discipline discipline) {
        Discipline disc = disciplinesRepository.save(discipline);
        
        return disc;
	}
}
