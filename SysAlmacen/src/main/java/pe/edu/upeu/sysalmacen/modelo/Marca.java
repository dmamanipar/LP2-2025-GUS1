package pe.edu.upeu.sysalmacen.modelo;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name = "upeu_marca")
public class Marca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer idMarca;

    @Column(nullable = false)
    public String nombre;



    public Marca(int idMarca, String nombre) {
        this.idMarca = idMarca;
        this.nombre = nombre;
    }

    public Marca() {
    }

    public int getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
