package com.rubricah2.service;

import com.rubricah2.domain.contatto.ContattoDTO;

import java.util.ArrayList;

public interface RubricaService {
    ArrayList<ContattoDTO> getContatti();
    ContattoDTO getContatto(Long id);
    void deleteContatto(Long id);
    void createContatto(ContattoDTO contatto);
    void updateContatto(Long id, ContattoDTO contatto);
    ArrayList<ContattoDTO> provaCustomQuery(String nome);
}
