package pe.edu.upeu.sysalmacen.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upeu.sysalmacen.model.Marca;

@RestController
@RequestMapping("/marcas")
public class MarcaController {
    @GetMapping
    public Marca mostrarMarca() {
        return Marca.builder()
                .idMarca(0L)
                .nombre("Adidas")
                .build();
    }
}
