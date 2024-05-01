package br.com.alura.crudspring.controller;

import br.com.alura.crudspring.controller.domain.filme.DadosCadastroFilme;
import jakarta.websocket.server.PathParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/filmes")
public class FilmeController {

    @GetMapping
    public String carregaPaginaFormulario(){
        return "filmes/formulario";
    }

    @PostMapping
    public String cadastraFilme(DadosCadastroFilme dados){
        return "filmes/formulario";
    }
}
