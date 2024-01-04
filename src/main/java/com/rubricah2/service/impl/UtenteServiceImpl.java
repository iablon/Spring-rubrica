package com.rubricah2.service.impl;

import com.rubricah2.domain.contatto.ContattoEntity;
import com.rubricah2.domain.utente.UtenteDTO;
import com.rubricah2.domain.utente.UtenteEntity;
import com.rubricah2.mapper.UtenteMapper;
import com.rubricah2.repository.UtenteRepository;
import com.rubricah2.service.UtenteService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UtenteServiceImpl implements UtenteService {

    private final UtenteRepository utenteRepository;
    private final UtenteMapper mapper;

    public UtenteServiceImpl(
            UtenteRepository utenteRepository,
            UtenteMapper mapper){
        this.mapper = mapper;
        this.utenteRepository = utenteRepository;
    }

    @Override
    public List<UtenteDTO> getUtenti() {
        List<UtenteDTO> utenti = utenteRepository.findAll().stream().map(mapper::toUtenteDTO).toList();
        return utenti;
    }

    @Override
    public UtenteDTO getUtente(long id) {
        return mapper.toUtenteDTO(utenteRepository.findById(id).orElse(UtenteEntity.builder().build()));
    }

    @Override
    public void deleteUtente(long id) {
        utenteRepository.deleteById(id);
    }

    @Override
    public void createUtente(UtenteDTO utente) {
        utenteRepository.save(
                UtenteEntity.builder()
                        .nome(utente.getNome())
                        .cognome(utente.getCognome())
                        .eta(utente.getEta())
                        .contatto(ContattoEntity.builder().build())
                        .build()
        );
    }

    @Override
    public void updateUtente(long id,UtenteDTO utente) {
        UtenteEntity utenteToSave = mapper.toUtenteEntity(utente);
        utenteRepository.save(utenteToSave);
    }
}
