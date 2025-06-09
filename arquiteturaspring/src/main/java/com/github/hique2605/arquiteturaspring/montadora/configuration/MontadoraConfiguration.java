package com.github.hique2605.arquiteturaspring.montadora.configuration;

import com.github.hique2605.arquiteturaspring.montadora.Motor;
import com.github.hique2605.arquiteturaspring.montadora.TipoMotor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MontadoraConfiguration {

    @Bean // Define a bean for Motor, Bean é um objeto gerenciado pelo Spring
    public Motor motor() {
       var motor = new Motor();
       motor.setCavalos(120);
         motor.setCilindros(4);
         motor.setLitragem(2.0);
         motor.setModelo("XPTO");
         motor.setTipoMotor(TipoMotor.ASPIRADO);
       return motor;
    }


}
