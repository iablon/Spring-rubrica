package com.rubricah2.domain.utente;

import com.rubricah2.domain.contatto.ContattoEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "utenti")
public class UtenteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String nome;
    String cognome;
    int eta;
    @OneToOne
    @JoinColumn(name = "contatti")
    ContattoEntity contatto;
}
