package com.planilha.controledemandas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

import com.planilha.controledemandas.model.Demanda;
import com.planilha.controledemandas.service.DemandaService;

@RestController
@RequestMapping("/api/demandas")
public class DemandaController {

    @Autowired
    private DemandaService service;

    @GetMapping
    public List<Demanda> listarDemandas() {
        return service.listarDemandas();
    }

    @GetMapping("/{id}")
    public Demanda buscarDemanda(@PathVariable Long id) {
        return service.buscarDemanda(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Demanda criarDemanda(@RequestBody Demanda demanda) {
        return service.criarDemanda(demanda);
    }

    @PutMapping("/{id}")
    public Demanda atualizarDemanda(@PathVariable Long id, @RequestBody Demanda demanda) {
        return service.atualizarDemanda(id, demanda);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletarDemanda(@PathVariable Long id) {
        service.deletarDemanda(id);
    }
}
