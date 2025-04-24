package br.com.marujaum.algafoodapi;

import br.com.marujaum.algafoodapi.di.notificacao.Notificador;
import br.com.marujaum.algafoodapi.di.service.AtivacaoClienteService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {

    @Bean
    public AtivacaoClienteService ativacaoClienteService(Notificador notificador) {
        AtivacaoClienteService ativacaoClienteService = new AtivacaoClienteService(notificador);
        return ativacaoClienteService;
    }
}
