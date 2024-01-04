package com.rubricah2.repository;

import com.rubricah2.domain.contatto.ContattoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface RubricaRepository extends JpaRepository<ContattoEntity,Number> {
    ArrayList<ContattoEntity> findByNome(String nome);
}
