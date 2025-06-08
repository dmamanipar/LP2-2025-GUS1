package pe.edu.upeu.sysalmacen.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import pe.edu.upeu.sysalmacen.dtos.ProductoDTO;
import pe.edu.upeu.sysalmacen.model.Producto;


public interface IProductoService extends ICrudGenericoService<Producto,
        Long>{
    ProductoDTO saveD(ProductoDTO.ProductoCADto dto);
    ProductoDTO updateD(ProductoDTO.ProductoCADto dto, Long id);

   /* public List<ProdMasVendidosDTO> obtenerProductosMasVendidos();

    byte[] generateReport() throws JRException, SQLException, IOException;
    */
    Page<Producto> listaPage(Pageable pageable);
}