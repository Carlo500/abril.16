package com.softtek.abril16.Ejercicio5.Persistencia;

import com.softtek.abril16.Ejercicio5.modelo.Cliente;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
@Primary
public class AccesoProduccion implements IDAO{
    public String insertarCliente(Cliente c){
        return "Cliente insertado";
    }
}
