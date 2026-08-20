package com.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.Service.ProdutoService;
import com.api.entities.Produto;

@RestController
@RequestMapping("/produtos")
@CrossOrigin(origins = "*")
public class ProdutoController {

    @Autowired
    private ProdutoService service;

    @GetMapping
    public ResponseEntity<List<Produto>> getProdutos() {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(service.consultar());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getUmProduto(@PathVariable Long id) {

        try {
            Produto produto = service.getUm(id);

            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(produto);

        } catch (Exception e) {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body(e.getMessage());
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletar(@PathVariable Long id) {

        service.excluir(id);

        return ResponseEntity
                .status(HttpStatus.NO_CONTENT)
                .build();
    }

    @PostMapping
    public ResponseEntity<?> salvar(@RequestBody Produto produto) {

        try {
            produto = service.salvar(produto);

            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(produto);

        } catch (Exception e) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(e.getMessage());
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> alterar(
            @PathVariable Long id,
            @RequestBody Produto produto) {

        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(service.alterar(id, produto));

        } catch (Exception e) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(e.getMessage());
        }
    }
}