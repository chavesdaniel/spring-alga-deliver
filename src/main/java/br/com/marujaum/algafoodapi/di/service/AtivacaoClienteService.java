package br.com.marujaum.algafoodapi.di.service;

import br.com.marujaum.algafoodapi.di.modelo.Cliente;
import br.com.marujaum.algafoodapi.di.notificacao.Notificador;

public class AtivacaoClienteService {

    private Notificador notificador;

    public AtivacaoClienteService(Notificador notificador) {
        this.notificador = notificador;
        System.out.println("AtivacaoClienteService " + notificador);
    }

    public void ativar(Cliente cliente) {
        cliente.isAtivo();

        notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
    }
}
