package com.softtek.abril16.Ejercicio2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Conductor {
    @Autowired
    private ICoche vehiculo;

    public String conducir() {
        return vehiculo.moverse();
    }
}

