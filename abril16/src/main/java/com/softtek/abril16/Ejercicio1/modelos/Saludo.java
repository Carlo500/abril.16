package com.softtek.abril16.Ejercicio1.modelos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Saludo implements ISaludo{
    @Value("Buenos dias")
    private String saludo;

    public String saludar(){
        return saludo;
    }
}
