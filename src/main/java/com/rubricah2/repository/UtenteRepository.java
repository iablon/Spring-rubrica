package com.rubricah2.repository;

import com.rubricah2.domain.utente.UtenteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UtenteRepository extends JpaRepository<UtenteEntity,Number> {

    List<UtenteEntity> findAllByNome(String nome);
}
