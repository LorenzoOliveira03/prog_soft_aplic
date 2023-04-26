package com.example.springboot.Controllers.Turma;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.Entity.Turma;
import com.example.springboot.Repository.TurmasRepository;

@RestController
public class GetAllTurmasController {
    private final TurmasRepository turmasRepository;

    @Autowired
    public GetAllTurmasController(TurmasRepository turmasRepository) {
        this.turmasRepository = turmasRepository;
    }

	@GetMapping("/turmas/all")
	public List<Turma> getAll() {
        List<Turma> turmas = (List<Turma>) turmasRepository.findAll();
        
        return turmas;
	}
}
