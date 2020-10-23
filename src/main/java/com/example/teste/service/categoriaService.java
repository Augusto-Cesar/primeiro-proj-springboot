package com.example.teste.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.teste.domain.Categoria;
import com.example.teste.exeption.RecursoNaoEncontradoExeption;
import com.example.teste.repository.CategoriaRepository;

@Service
public class categoriaService {
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public Categoria buscarPorCodigo(Short codigo) {
		Optional<Categoria> retcategoria = categoriaRepository.findById(codigo);
		if (retcategoria.isEmpty()) {
			throw new RecursoNaoEncontradoExeption();
		}
		Categoria categoria = retcategoria.get();
		return categoria;
	}
	
	public List<Categoria> listar() {
		return categoriaRepository.findAll();
	}
	
	public Categoria salvar(Categoria categoria) {
		return categoriaRepository.save(categoria);
	}
	
	public Categoria editar(Categoria categoria) {
		return categoriaRepository.save(categoria);
	}
	
	public Categoria excluir(Short codigo) {
		Categoria categoria = this.buscarPorCodigo(codigo);
		categoriaRepository.delete(categoria);
		return categoria;
	}
}
