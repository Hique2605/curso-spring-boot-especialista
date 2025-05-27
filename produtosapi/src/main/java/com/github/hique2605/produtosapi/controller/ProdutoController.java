package com.github.hique2605.produtosapi.controller;

import com.github.hique2605.produtosapi.model.Produto;
import com.github.hique2605.produtosapi.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController     //anotacao diz que essa classe vai receber requisicoes rest.
@RequestMapping("produtos")  //qual é a url base
public class ProdutoController {

    private ProdutoRepository produtoRepository;
    //nao iria precisa do construtor se usa lombok ou usa @Autowired private ProdutoRepository produtoRepository;
    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @PostMapping
    public Produto salvar(@RequestBody Produto produto){
        System.out.println("Produto recebido: " + produto);

        var id = UUID.randomUUID().toString();
        produto.setId(id);

        produtoRepository.save(produto);
        return produto;
    }

    @GetMapping("/{id}") // outros paranmetros por exp ("/{id}/{nome}/{outrovalor}")
    public Produto BuscaId(@PathVariable("id") String id){
        //1 forma:
        //Optional<Produto> produto = produtoRepository.findById(id);
        //return produto.isPresent() ? produto.get() : null;
        return produtoRepository.findById(id).orElse(null); //mais simples
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable  String id){
        produtoRepository.deleteById(id);
    }

    @PutMapping("/{id}")
    public void atualizar(@PathVariable("id") String id, @RequestBody Produto produto){
        produto.setId(id);
        produtoRepository.save(produto);
    }



}
