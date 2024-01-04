package com.rubricah2.mapper;

import com.rubricah2.domain.contatto.ContattoEntity;
import com.rubricah2.domain.utente.UtenteDTO;
import com.rubricah2.domain.utente.UtenteEntity;
import org.springframework.stereotype.Service;

@Service
public class UtenteMapper {


    public UtenteDTO toUtenteDTO(UtenteEntity utenteEntity){
        return UtenteDTO.builder()
                .nome(utenteEntity.getNome())
                .cognome(utenteEntity.getCognome())
                .eta(utenteEntity.getEta())
                .contatto(new RubricaMapper().toContattoDTO(utenteEntity.getContatto()))
                .build();
    }
    public UtenteEntity toUtenteEntity(UtenteDTO utente){
        return UtenteEntity.builder()
                .nome(utente.getNome())
                .cognome(utente.getCognome())
                .eta(utente.getEta())
                .contatto(ContattoEntity.builder().build())
                .build();
    }
}
