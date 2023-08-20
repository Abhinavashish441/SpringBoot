package com.abhinav.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abhinav.entity.Professor;
import com.abhinav.repository.ProfessorRepository;

import java.util.List;

@Service
public class ProfessorService {

    @Autowired
    private ProfessorRepository professorRepository;

    public List<Professor> getAllProfessors() {
        return professorRepository.findAll();
    }

    public Professor createProfessor(Professor professor) {
        return professorRepository.save(professor);
    }
}
