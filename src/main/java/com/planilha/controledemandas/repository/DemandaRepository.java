package com.planilha.controledemandas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.planilha.controledemandas.model.Demanda;

public interface DemandaRepository extends JpaRepository<Demanda, Long>{

}
