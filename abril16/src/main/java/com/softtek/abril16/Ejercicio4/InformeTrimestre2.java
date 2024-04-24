package com.softtek.abril16.Ejercicio4;

import lombok.Data;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Data
@Primary
public class InformeTrimestre2 implements IInforme{
    public String getInforme(){
        return "informeTrimestre2";
    }
}
