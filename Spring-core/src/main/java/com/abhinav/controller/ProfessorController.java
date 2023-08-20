package com.abhinav.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.abhinav.entity.Professor;
import com.abhinav.service.ProfessorService;

import java.util.List;

@RestController
@RequestMapping("/professors")
public class ProfessorController {

    @Autowired
    private ProfessorService professorService;

    @GetMapping
    public List<Professor> getAllProfessors() {
        return professorService.getAllProfessors();
    }

    @PostMapping
    public Professor createProfessor(@RequestBody Professor professor) {
        return professorService.createProfessor(professor);
    }
}
