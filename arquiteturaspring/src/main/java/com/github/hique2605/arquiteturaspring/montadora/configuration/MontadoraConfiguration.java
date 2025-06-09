package com.github.hique2605.arquiteturaspring.montadora.configuration;

import com.github.hique2605.arquiteturaspring.montadora.Motor;
import com.github.hique2605.arquiteturaspring.montadora.TipoMotor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MontadoraConfiguration {



    @Bean(name = "motorAspirado") // Define a bean for Motor, Bean é um objeto gerenciado pelo Spring
    public Motor motorAspirado() {
       var motor = new Motor();
       motor.setCavalos(120);
         motor.setCilindros(4);
         motor.setLitragem(2.0);
         motor.setModelo("XPTO");
         motor.setTipoMotor(TipoMotor.ASPIRADO);
       return motor;
    }

    @Bean(name = "motorEletrico") // Define a bean for Motor, Bean é um objeto gerenciado pelo Spring
    public Motor motorEletrico() {
        var motor = new Motor();
        motor.setCavalos(200);
        motor.setCilindros(4);
        motor.setLitragem(1.4);
        motor.setModelo("thzhz");
        motor.setTipoMotor(TipoMotor.ELETRICO);
        return motor;
    }

    @Bean(name = "motorTurbo") // Define a bean for Motor, Bean é um objeto gerenciado pelo Spring
    public Motor motorTurbo() {
        var motor = new Motor();
        motor.setCavalos(150);
        motor.setCilindros(6);
        motor.setLitragem(3.4);
        motor.setModelo("GTi");
        motor.setTipoMotor(TipoMotor.TURBO);
        return motor;
    }


}
