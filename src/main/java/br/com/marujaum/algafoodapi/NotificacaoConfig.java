package br.com.marujaum.algafoodapi;

import br.com.marujaum.algafoodapi.di.notificacao.NotificadorEmail;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class NotificacaoConfig {
    @Bean
    public NotificadorEmail notificadorEmail() {
        NotificadorEmail notificadorEmail = new NotificadorEmail("smtp.algafood.com.br");
        notificadorEmail.setCaixaAlta(true);
        return notificadorEmail;
    }
}
