package pe.edu.upeu.sysalmacen.repositorio;

import org.springframework.stereotype.Repository;
import pe.edu.upeu.sysalmacen.modelo.Marca;

@Repository("mySpecialRepository")
public class MySpecialRepository implements MyRepository{

    @Override
    public Marca guardar(Marca to) {
        System.out.println("Marca Guardado Especial");
        return to;
    }
}
