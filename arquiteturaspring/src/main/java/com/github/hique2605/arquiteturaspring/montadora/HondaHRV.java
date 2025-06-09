package com.github.hique2605.arquiteturaspring.montadora;

import java.awt.*;

public class HondaHRV extends Carro{

    public HondaHRV(Motor motor) {
        super(motor);
        setModelo("HR-V");
        setCor(Color.RED);
        setMontadora(Montadora.HONDA);
    }

}
