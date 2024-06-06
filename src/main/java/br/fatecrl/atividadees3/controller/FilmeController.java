package br.fatecrl.atividadees3.controller;

import br.fatecrl.atividadees3.models.Filme;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/filmes")
public class FilmeController {
    private static final List<Filme> filmes = new ArrayList<Filme>();

    public FilmeController(){
        filmes.add(new Filme("Mulholland Drive","David Lynch",147,2001));
        filmes.add(new Filme("Oppenheimer","Christopher Nolan",180,2023));
        filmes.add(new Filme("Sobre Meninos e Lobos","Clint Eastwood",137,2003));
    }

    @GetMapping
    public String getFilmes(Model model){
        model.addAttribute("filmes",filmes);
        return "filmes";
    }
}
