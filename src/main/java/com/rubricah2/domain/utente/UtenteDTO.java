package com.rubricah2.domain.utente;

import com.rubricah2.domain.contatto.ContattoDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UtenteDTO {
    String nome;
    String cognome;
    int eta;
    ContattoDTO contatto;
}
