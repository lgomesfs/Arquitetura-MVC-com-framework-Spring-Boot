package br.fatecrl.atividadees3.controller;

import br.fatecrl.atividadees3.models.Filme;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/filmes")
public class DadosController {
    private static final List<Filme> filmes = new ArrayList<Filme>();

    public DadosController(){
        filmes.add(new Filme("Mulholland Drive","David Lynch",147,2001));
        filmes.add(new Filme("Oppenheimer","Christopher Nolan",180,2023));
        filmes.add(new Filme("Sobre Meninos e Lobos","Clint Eastwood",137,2003));
    }

    @GetMapping
    public List<Filme> getFilmes(){
        return filmes;
    }
}
