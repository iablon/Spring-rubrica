package com.rubricah2.service;

import com.rubricah2.domain.utente.UtenteDTO;

import java.util.List;

public interface UtenteService {
    List<UtenteDTO> getUtenti();
    UtenteDTO getUtente(long id);
    void deleteUtente(long id);
    void createUtente(UtenteDTO utente);
    void updateUtente(long id,UtenteDTO utente);
}
