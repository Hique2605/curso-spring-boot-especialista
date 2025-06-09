package com.github.hique2605.arquiteturaspring.montadora.api;

import com.github.hique2605.arquiteturaspring.montadora.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carros")
public class TesteFabricaController {

    @Autowired // Injeta o bean Motor que foi definido na classe MontadoraConfiguration
    // O Spring procura o bean Motor no contexto da aplicação e injeta aqui
    private Motor motor;




    @PostMapping
    public CarroStatus ligarCarro(@RequestBody Chave chave){
        var carro = new HondaHRV(motor);
        return carro.darIgnicao(chave);
    }





}
