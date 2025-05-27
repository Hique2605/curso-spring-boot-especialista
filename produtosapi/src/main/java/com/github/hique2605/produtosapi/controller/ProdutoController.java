package com.github.hique2605.produtosapi.controller;

import com.github.hique2605.produtosapi.model.Produto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController     //anotacao diz que essa classe vai receber requisicoes rest.
@RequestMapping("produtos")  //qual é a url base
public class ProdutoController {

    @PostMapping
    public Produto salvar(@RequestBody Produto produto){
        System.out.println("Produto recebido: " + produto);
        return produto;
    }

}
