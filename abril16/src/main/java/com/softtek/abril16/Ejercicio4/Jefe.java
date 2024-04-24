package com.softtek.abril16.Ejercicio4;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Data
public class Jefe implements IEmpleado{
    @Autowired
    private IInforme informe;
    @Override
    public String getInforme(){
        return informe.getInforme();
    }
    @Override
    public String getTareas(){
        return "Jefe";
    }
}
