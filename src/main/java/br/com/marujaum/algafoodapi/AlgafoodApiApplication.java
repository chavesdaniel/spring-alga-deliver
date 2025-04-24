package br.com.marujaum.algafoodapi;

import br.com.marujaum.algafoodapi.di.modelo.Cliente;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AlgafoodApiApplication {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Marujo", "marujo@gmail.com", "99999999999" );

        SpringApplication.run(AlgafoodApiApplication.class, args);
    }

}
