package pe.edu.upeu.sysalmacen.servicio;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class InyValuService {

    @Value("${mi.nombre}")
    private String nombrePy;

    public String guardarEntidad(){
        System.out.println("Mi nombre es:" +nombrePy);
        return nombrePy;
    }

}