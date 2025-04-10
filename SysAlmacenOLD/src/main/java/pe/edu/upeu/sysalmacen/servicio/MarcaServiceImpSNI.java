package pe.edu.upeu.sysalmacen.servicio;

import pe.edu.upeu.sysalmacen.modelo.Marca;
import pe.edu.upeu.sysalmacen.repositorio.MarcaRepositorySNI;

public class MarcaServiceImpSNI implements MarcaServiceISNI{

    MarcaRepositorySNI repository=new MarcaRepositorySNI();

    @Override
    public Marca guardarMarca(Marca marca) {
        return repository.guardarMarca(marca);
    }


}
