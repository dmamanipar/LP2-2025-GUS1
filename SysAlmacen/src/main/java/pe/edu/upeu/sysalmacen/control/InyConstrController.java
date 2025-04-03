package pe.edu.upeu.sysalmacen.control;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upeu.sysalmacen.modelo.Marca;
import pe.edu.upeu.sysalmacen.servicio.InyConstrService;

import java.util.List;

@RestController
@RequestMapping("/marcaics")
public class InyConstrController {
    private final InyConstrService ms;
    public InyConstrController(InyConstrService ms) {
        this.ms = ms;
    }
    @GetMapping("/g")
    public Marca guardar(){
        return null;
    }

    @GetMapping
    public List<Marca> listar(){
        return ms.listar();
    }
}

