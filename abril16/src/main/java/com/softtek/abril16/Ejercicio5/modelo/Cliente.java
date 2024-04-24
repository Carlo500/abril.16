package com.softtek.abril16.Ejercicio5.modelo;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class Cliente {
    private String nombre;
    private String NIF;

}
