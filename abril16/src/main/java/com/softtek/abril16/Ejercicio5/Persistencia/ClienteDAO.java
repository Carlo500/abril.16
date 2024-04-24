package com.softtek.abril16.Ejercicio5.Persistencia;

import com.softtek.abril16.Ejercicio5.modelo.Cliente;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class ClienteDAO {
    @Autowired
    private IDAO conexion;

    public String insertar(Cliente c){
        return conexion.insertarCliente(c);
    }
}
