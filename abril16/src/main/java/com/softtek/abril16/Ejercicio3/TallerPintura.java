package com.softtek.abril16.Ejercicio3;

import lombok.Data;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Data
@Primary
public class TallerPintura implements ITaller{
    @Override
    public String repararCoche(Coche1 c){
        return "Coche reparado";
    }
}
