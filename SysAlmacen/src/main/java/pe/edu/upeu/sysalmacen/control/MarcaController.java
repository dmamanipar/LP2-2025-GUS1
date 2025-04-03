package pe.edu.upeu.sysalmacen.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import pe.edu.upeu.sysalmacen.modelo.Marca;
import pe.edu.upeu.sysalmacen.servicio.MarcaService;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/marcas")
public class MarcaController {
    @Autowired
    private MarcaService marcaService;

    @GetMapping("/xsxs")
    public ResponseEntity<List<Marca>> findAll2() {
        List<Marca> list = marcaService.findAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping
    public ResponseEntity<List<Marca>> findAll() {
        List<Marca> list = marcaService.findAll();
        return ResponseEntity.ok(list);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Marca> findById(@PathVariable("id") Integer id) {
        Marca obj = marcaService.findById(id);
        return ResponseEntity.ok(obj);
    }
    @PostMapping
    public ResponseEntity<Void> save(@RequestBody Marca dto) {
        Marca obj = marcaService.save(dto);
        URI location =
                ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
                        .buildAndExpand(obj.getIdMarca()).toUri();
        return ResponseEntity.created(location).build();
    }
    @PutMapping("/{id}")
    public ResponseEntity<Marca> update( @PathVariable("id") Integer id,
                                         @RequestBody Marca dto) {
        dto.setIdMarca(id);
        Marca obj = marcaService.update(dto, id);
        return ResponseEntity.ok(obj);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") Integer id) {
        marcaService.delete(id);
        return ResponseEntity.noContent().build();
    }


}
