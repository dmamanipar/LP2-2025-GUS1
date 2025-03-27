package pe.edu.upeu.sysalmacen.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.upeu.sysalmacen.modelo.Marca;

public interface MarcaRepository extends JpaRepository<Marca, Long> {
}
