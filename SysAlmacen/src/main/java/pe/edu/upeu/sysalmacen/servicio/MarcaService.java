package pe.edu.upeu.sysalmacen.servicio;

import pe.edu.upeu.sysalmacen.modelo.Marca;

import java.util.List;

public interface MarcaService {
    public List<Marca> findAll();
    public Marca findById(long id);
    public Marca save(Marca marca);
    public void delete(Marca marca);


}
