package pe.edu.upeu.sysalmacen.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upeu.sysalmacen.modelo.Marca;
import pe.edu.upeu.sysalmacen.servicio.InyQuaService;

@RestController
@RequestMapping("/marcasq")
public class InyQuaController {
    @Autowired
    private InyQuaService service;
    @GetMapping
    public Marca guardar(){
        Marca marca = new Marca();
        marca.setNombre("Primero Qualifie");
        marca.setIdMarca(1);
        return service.guardarEntidad(marca);
    }
}
