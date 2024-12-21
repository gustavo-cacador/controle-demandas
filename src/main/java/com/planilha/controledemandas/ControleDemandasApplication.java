package com.planilha.controledemandas;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ControleDemandasApplication {

	public static void main(String[] args) {
		SpringApplication.run(ControleDemandasApplication.class, args);

		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd 'de' MMMM 'às' HH:mm'hrs' ", new Locale("pt", "BR"));
		String nowFormatada = now.format(formatter);

		System.out.println("Sistema funcionando corretamente no dia: " + nowFormatada);
	}

}
