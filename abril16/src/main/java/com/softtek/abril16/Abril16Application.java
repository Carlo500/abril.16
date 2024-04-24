package com.softtek.abril16;

import com.softtek.abril16.Ejercicio3.Coche1;
import com.softtek.abril16.Ejercicio3.SeguroCoche;
import com.softtek.abril16.Ejercicio4.IEmpleado;
import com.softtek.abril16.Ejercicio5.Persistencia.ClienteDAO;
import com.softtek.abril16.Ejercicio5.modelo.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Abril16Application implements CommandLineRunner {
	@Autowired
	private ClienteDAO s1;
	@Autowired
	private Cliente c1;
	public static void main(String[] args) {

		SpringApplication.run(com.softtek.abril16.Abril16Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(s1.insertar(c1));
	}
}