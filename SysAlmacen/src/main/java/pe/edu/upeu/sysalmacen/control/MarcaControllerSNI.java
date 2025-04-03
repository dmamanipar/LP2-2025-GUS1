package pe.edu.upeu.sysalmacen.control;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upeu.sysalmacen.modelo.Marca;
import pe.edu.upeu.sysalmacen.servicio.MarcaServiceISNI;
import pe.edu.upeu.sysalmacen.servicio.MarcaServiceImpSNI;

@RestController
@RequestMapping("/marcassid")
public class MarcaControllerSNI {

    MarcaServiceISNI repository=new MarcaServiceImpSNI();


    @GetMapping
    public Marca getMarcas() {
        //Marca dd= new Marca(1, "sdsd");
       // return repository.guardarMarca(dd);
        return null;
    }


}
