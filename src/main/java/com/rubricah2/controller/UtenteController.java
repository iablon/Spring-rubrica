package com.rubricah2.controller;

import com.rubricah2.domain.utente.UtenteDTO;
import com.rubricah2.service.UtenteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UtenteController {
    UtenteService utenteService;

    public UtenteController(UtenteService utenteService){
        this.utenteService = utenteService;
    }

    @GetMapping("/utenti")
    public List<UtenteDTO> getUtenti(){
        return utenteService.getUtenti();
    }

    @GetMapping("/utente/{id}")
    public UtenteDTO getUtente(@PathVariable("id") long id){
        return utenteService.getUtente(id);
    }

    @PostMapping("/utente")
    public void createUtente(@RequestBody UtenteDTO utente){
        utenteService.createUtente(utente);
    }

    @DeleteMapping("/utente/{id}")
    public void deleteUtente(@PathVariable("id") long id){
        utenteService.deleteUtente(id);
    }

    @PutMapping("/utente/{id}")
    public void updateUtente(@PathVariable("id") long id,@RequestBody UtenteDTO utente){
        utenteService.updateUtente(id,utente);
    }
}
