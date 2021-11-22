package com.fatecrl.mvcex.controllers;

import com.fatecrl.mvcex.models.Oficina;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OficinaController {

    private List<Oficina> oficina = List.of(
            new Oficina("Volkswagen", "Fusca", "Azul", "Gasolina", 1980, "Lanternas frontais quebradas"),
            new Oficina("Ford", "Ka", "Prata", "Flex", 2013, "Suspensão fazendo barulho")
    );

    @GetMapping("/oficina")
    public List<Oficina> getOficina() {
        return oficina;
    }
}
