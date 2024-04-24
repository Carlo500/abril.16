package com.softtek.abril16.Ejercicio3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SeguroCoche {
    @Autowired
    private ITaller taller;
    private String aseguradora;

    public String repararCoche(Coche1 c){
        return taller.repararCoche(c);
    }
}
