package br.com.marujaum.algafoodapi.di.notificacao;

import br.com.marujaum.algafoodapi.di.modelo.Cliente;

public interface Notificador {
    void notificar(Cliente cliente, String mensagem);
}
