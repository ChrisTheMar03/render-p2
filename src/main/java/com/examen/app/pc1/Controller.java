package com.examen.app.pc1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/idat")
public class Controller {

    Alumno alu = new Alumno("ln76043563", "Rocky Daniel Gonzalez Leon");

    @GetMapping("/")
    public String obtener() {
        return alu.getCodigo() + " - " + alu.getNombre();
    }

    @GetMapping("/codigo")
    public String codigo() {
        return alu.getCodigo();
    }

    @GetMapping("/nombre-completo")
    public String nombreCompleto() {
        return alu.getNombre();
    }

}
