package com.rubricah2.mapper;

import com.rubricah2.domain.contatto.ContattoDTO;
import com.rubricah2.domain.contatto.ContattoEntity;
import org.springframework.stereotype.Service;

@Service
public class RubricaMapper {

    public ContattoDTO toContattoDTO(ContattoEntity contattoEntity){
        return ContattoDTO.builder()
                .nome(contattoEntity.getNome())
                .cognome(contattoEntity.getCognome())
                .prefisso(contattoEntity.getPrefisso())
                .numero(contattoEntity.getNumero())
                .build();
    }

    public ContattoEntity toContattoEntity(ContattoDTO contattoDTO){
        return ContattoEntity.builder()
                .nome(contattoDTO.getNome())
                .cognome(contattoDTO.getCognome())
                .prefisso(contattoDTO.getPrefisso())
                .numero(contattoDTO.getNumero())
                .build();
    }
}
