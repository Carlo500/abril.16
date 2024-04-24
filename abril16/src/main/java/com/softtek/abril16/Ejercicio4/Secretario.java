package com.softtek.abril16.Ejercicio4;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Data
@Primary
public class Secretario implements IEmpleado{
    @Autowired
    private IInforme informe;
    @Value("Empresa1")
    private String empresa;
    @Value("ejemplo@ejemplo.com")
    private String email;
    @Override
    public String getInforme(){
        return informe.getInforme();
    }
    @Override
    public String getTareas(){
        return "Secretario";
    }

}
