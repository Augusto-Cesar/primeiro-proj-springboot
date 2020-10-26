package com.example.teste.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.example.teste.domain.Categoria;
import com.example.teste.exeption.RecursoNaoEncontradoExeption;
import com.example.teste.service.categoriaService;

@RestController
@RequestMapping("categorias")
public class CategoriaController {
	@Autowired
	private categoriaService categoriaService;
	
	@GetMapping
	public List<Categoria> listar() {
		return categoriaService.listar();
	}
	
	@GetMapping("/{codigo}")
	public Categoria buscarPorCodigo(@PathVariable Short codigo) {
		try {
			return categoriaService.buscarPorCodigo(codigo);
		} catch (RecursoNaoEncontradoExeption ex) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Categoria Não encontrada", ex);
		}
	}
	
	@PostMapping
	public Categoria inserir(@RequestBody Categoria categoria) {
		Categoria savedCategoria = categoriaService.salvar(categoria);
		return savedCategoria;
	}
	
	@DeleteMapping("/{codigo}")
	public Categoria excluir(@PathVariable Short codigo) {
		try {
		Categoria deletedCategoria =  categoriaService.excluir(codigo);
		return deletedCategoria;
		} catch (RecursoNaoEncontradoExeption ex) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Categoria Não encontrada", ex);
		}
	}
	
	@PutMapping()
	public Categoria editar(@RequestBody Categoria categoria) {
		Categoria editedCategoria = categoriaService.editar(categoria);
		return editedCategoria;
	}
}
