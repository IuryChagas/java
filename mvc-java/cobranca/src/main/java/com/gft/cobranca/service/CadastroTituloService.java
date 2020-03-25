package com.gft.cobranca.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.gft.cobranca.model.Titulo;
import com.gft.cobranca.repository.Titulos;

@Service
public class CadastroTituloService {
	@Autowired
	private Titulos titulos;
	
	public void salvar(Titulo  titulo) {
		try {
			titulos.save(titulo);
		} catch (DataIntegrityViolationException exception) {
			throw new IllegalArgumentException("Formato de data inválido!");
		}
	}

	public void excluir(Long codigo) {
		titulos.deleteById(codigo);
		
	}
	
}
