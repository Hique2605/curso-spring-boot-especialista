package com.github.hique2605.produtosapi.controller;

import com.github.hique2605.produtosapi.model.Produto;
import com.github.hique2605.produtosapi.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
