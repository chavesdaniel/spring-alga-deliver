package br.com.marujaum.algafoodapi;

import br.com.marujaum.algafoodapi.di.modelo.Cliente;
import br.com.marujaum.algafoodapi.di.service.AtivacaoClienteService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MeuPrimeiroController {

    private AtivacaoClienteService ativacaoClienteService;

    public MeuPrimeiroController(AtivacaoClienteService ativacaoClienteService) {
        this.ativacaoClienteService = ativacaoClienteService;
        System.out.println("MeuPrimeiroController " + ativacaoClienteService);
    }

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        Cliente joao = new Cliente("Joao", "joao@gmail.com", "88888888" );
        ativacaoClienteService.ativar(joao);
        return "Hello Maruj!!";
    }
}
