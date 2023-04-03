package com.babel.SpringSecurityHolaMundo.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HolaMundoController {
    @GetMapping("/hola")
    public String hola() {
        return "Hola, mundo!";
    }

    @GetMapping("/usuarios")
    public List<String> usuarios() {
        List<String> usuarios = new ArrayList<>();
        usuarios.add("usuario");
        usuarios.add("otro-usuario");
        return usuarios;
    }
}
