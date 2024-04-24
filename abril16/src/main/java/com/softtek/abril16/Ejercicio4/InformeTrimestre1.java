package com.softtek.abril16.Ejercicio4;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class InformeTrimestre1 implements IInforme {
    public String getInforme(){
        return "informeTrimestre1";
    }
}
