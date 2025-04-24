package br.com.marujaum.algafoodapi.di.service;

import br.com.marujaum.algafoodapi.di.modelo.Cliente;
import br.com.marujaum.algafoodapi.di.notificacao.Notificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AtivacaoClienteService {

    @Autowired
    private Notificador notificador;

    public AtivacaoClienteService(Notificador notificador) {
        this.notificador = notificador;
    }

    public void ativar(Cliente cliente) {
        cliente.isAtivo();
        notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
    }

//    @Autowired
//    public void setNotificador(Notificador notificador) {
//        this.notificador = notificador;
//    }
}
