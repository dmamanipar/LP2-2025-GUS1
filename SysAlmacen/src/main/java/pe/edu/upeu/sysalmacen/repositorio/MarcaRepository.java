package pe.edu.upeu.sysalmacen.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upeu.sysalmacen.modelo.Marca;
@Repository
public interface MarcaRepository extends JpaRepository<Marca, Integer> {
}
