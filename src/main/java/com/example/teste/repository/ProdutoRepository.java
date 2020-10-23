package com.example.teste.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.teste.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}
