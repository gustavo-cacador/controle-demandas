package com.planilha.controledemandas.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.planilha.controledemandas.model.Demanda;
import com.planilha.controledemandas.repository.DemandaRepository;

@Service
public class DemandaService {

    @Autowired
    private DemandaRepository repository;

    public List<Demanda> listarDemandas() {
        return repository.findAll();
    }

    public Demanda buscarDemanda(Long id) {
        return repository.findById(id).orElseThrow(() -> new NoSuchElementException("Demanda não encontrada"));
    }

    public Demanda criarDemanda(Demanda demanda) {
        return repository.save(demanda);
    }

    public Demanda atualizarDemanda(Long id, Demanda demanda) {
        if (repository.existsById(id)) {
            demanda.setId(id);
            return repository.save(demanda);
        } else {
            throw new NoSuchElementException("Demanda não encontrada");
        }
    }

    public void deletarDemanda(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
        } else {
            throw new NoSuchElementException("Demanda não encontrada");
        }
    }
}