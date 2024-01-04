package com.rubricah2.service.impl;

import com.rubricah2.domain.contatto.ContattoDTO;
import com.rubricah2.domain.contatto.ContattoEntity;
import com.rubricah2.mapper.RubricaMapper;
import com.rubricah2.repository.RubricaRepository;
import com.rubricah2.service.RubricaService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class RubricaServiceImpl implements RubricaService {
    private RubricaRepository rubricaRepository;
    private RubricaMapper mapper;
    public RubricaServiceImpl(
            RubricaRepository rubricaRepository,
            RubricaMapper mapper){
        this.mapper = mapper;
        this.rubricaRepository = rubricaRepository;
    }
    @Override
    public ArrayList<ContattoDTO> getContatti() {
        ArrayList<ContattoDTO> contatti = new ArrayList<>();
        rubricaRepository.findAll().forEach(contattoEntity -> mapper.toContattoDTO(contattoEntity));
        return contatti;
    }

    public ContattoDTO getContatto(Long id){
        System.out.println(id);
        return mapper.toContattoDTO(rubricaRepository.findById(id).orElse(new ContattoEntity()));
    }

    public void deleteContatto(Long id){
        rubricaRepository.deleteById(id);
    }

    @Override
    public void createContatto(ContattoDTO contatto) {
        rubricaRepository.save(mapper.toContattoEntity(contatto));
    }

    @Override
    public void updateContatto(Long id, ContattoDTO contatto) {
        if (rubricaRepository.existsById(id)){
            ContattoEntity contattoEntity = mapper.toContattoEntity(contatto);
            contattoEntity.setId(id);
            rubricaRepository.save(contattoEntity);
        }
    }

    public ArrayList<ContattoDTO> provaCustomQuery(String nome){
        ArrayList<ContattoDTO> contatti = new ArrayList<>();
        for (ContattoEntity contattoEntity : rubricaRepository.findByNome(nome)){
            contatti.add(mapper.toContattoDTO(contattoEntity));
        }
        return contatti;
    }
}
