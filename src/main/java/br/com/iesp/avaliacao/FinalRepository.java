package br.com.iesp.avaliacao;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/final")
@RestController
public class FinalRepository {

    private FinalResource service;

    @GetMapping("/gravarUSuario")
    public void gravarFinal(AvaliacaoFinal avaliacao){
        service.salvar(avaliacao);
    }

    @GetMapping("/atualizar")
    public void atualizar(AvaliacaoFinal avaliacao){
        service.salvar(avaliacao);
    }


    @GetMapping("/gravarUSuario")
    public void remover(AvaliacaoFinal avaliacao){
        service.atualizar(avaliacao);
    }

    @GetMapping("/gravarUSuario")
    public void listar(AvaliacaoFinal avaliacao){
        service.listar(avaliacao);
    }

}
