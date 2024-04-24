package com.softtek.abril16.Ejercicio3;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class TallerMecanica implements ITaller {
    @Override
    public String repararCoche(Coche1 c){
        return "Coche reparado";
    }
}
