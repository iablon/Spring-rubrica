package com.rubricah2.domain.contatto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ContattoDTO {
    private String nome;
    private String cognome;
    private String prefisso;
    private String numero;
}
