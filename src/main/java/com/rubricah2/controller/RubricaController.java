package com.rubricah2.controller;

import com.rubricah2.domain.contatto.ContattoDTO;
import com.rubricah2.service.RubricaService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class RubricaController {
    private final RubricaService rubricaService;

    public RubricaController(RubricaService rubricaService){
        this.rubricaService = rubricaService;
    }


    @GetMapping("/contatti")
    public ArrayList<ContattoDTO> getContatti(){
        ArrayList<ContattoDTO> contatti = rubricaService.getContatti();
        return contatti;
    }
    @GetMapping("/contatto/{id}")
    public ContattoDTO getContatto(@PathVariable("id") Long id){
        return rubricaService.getContatto(id);
    }

    @DeleteMapping("/contatto/{id}")
    public void deleteContatto(@PathVariable("id") Long id){
        rubricaService.deleteContatto(id);
    }

    @PutMapping("/contatto/{id}")
    public void updateContatto(@PathVariable("id") Long id,@RequestBody ContattoDTO contatto){
        rubricaService.updateContatto(id,contatto);
        System.out.println(contatto);
    }

    @PostMapping("/contatto")
    public void createContatto(@RequestBody ContattoDTO contatto){
        rubricaService.createContatto(contatto);
    }

    @GetMapping("/prova/{nome}")
    public ArrayList<ContattoDTO> custQuery(@PathVariable("nome") String nome){
        return rubricaService.provaCustomQuery(nome);
    }
}
