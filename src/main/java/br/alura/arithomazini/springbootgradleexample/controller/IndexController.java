package br.alura.arithomazini.springbootgradleexample.controller;

import br.alura.arithomazini.springbootgradleexample.entities.Usuario;
import br.alura.arithomazini.springbootgradleexample.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @RequestMapping("/")
    public String teste(){

        usuarioRepository.save(new Usuario("Ari", "Teste"));
        var teste = usuarioRepository.findAll();

        return "index";
    }

}
