package com.example.springboot.Controllers.Turma;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.Dto.CreateTurmaDTO;
import com.example.springboot.Entity.Turma;
import com.example.springboot.Services.Turma.CreateTurmaService;

@RestController
public class PostTurmasController {
    private final CreateTurmaService createTurmaService;

    @Autowired
    public PostTurmasController(CreateTurmaService createTurmaService) {
        this.createTurmaService = createTurmaService;
    }

	@PostMapping("/turmas")
	public Turma insert(@RequestBody CreateTurmaDTO turma) {
        System.out.println(turma);
        Turma tr = createTurmaService.execute(turma);

        if(tr == null){
            throw new IllegalArgumentException("Turma inválida");
        }
        
        return tr;
	}
}
