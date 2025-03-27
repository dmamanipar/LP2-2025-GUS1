package pe.edu.upeu.sysalmacen.modelo;

import jakarta.persistence.*;



@Entity
@Table(name = "upeu_marca")
public class Marca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int idMarca;

    @Column(nullable = false)
    public String nombre;



    public Marca(int idMarca, String nombre) {
        this.idMarca = idMarca;
        this.nombre = nombre;
    }

    public Marca() {
    }


}
