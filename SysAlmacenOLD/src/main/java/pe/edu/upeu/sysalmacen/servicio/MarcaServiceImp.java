package pe.edu.upeu.sysalmacen.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upeu.sysalmacen.modelo.Marca;
import pe.edu.upeu.sysalmacen.repositorio.MarcaRepository;

import java.util.List;

@Service
public class MarcaServiceImp implements MarcaService{

    @Autowired
    private MarcaRepository marcaRepository;

    @Override
    public List<Marca> findAll() {
        return marcaRepository.findAll();
    }

    @Override
    public Marca findById(Integer id) {
        return marcaRepository.findById(id).get();
    }

    @Override
    public Marca save(Marca marca) {
        return marcaRepository.save(marca);
    }

    @Override
    public void delete(Marca marca) {
        marcaRepository.delete(marca);
    }

    @Override
    public Marca update(Marca marca, Integer id) {
        marca.setIdMarca(id);
        return marcaRepository.save(marca);
    }

    @Override
    public void delete(Integer id) {
        marcaRepository.deleteById(id);
    }
}
