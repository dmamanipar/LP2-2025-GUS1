package pe.edu.upeu.sysalmacen.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upeu.sysalmacen.servicio.InyValuService;

@RestController
@RequestMapping("/marcasv")
public class InyValuController {
    @Autowired
    private InyValuService service;

    @GetMapping
    public String guardar(){
        return service.guardarEntidad();
    }
}

