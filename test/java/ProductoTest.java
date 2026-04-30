
import org.junit.jupiter.api.Test;
import tallerJunit5.Producto;

import static org.junit.jupiter.api.Assertions.*;

public class ProductoTest {

    @Test
    void precioEsIgualAlIngresado(){
        Producto producto = new Producto("Pan de queso",1500, 3);
        assertEquals(1500, producto.getPrecio(), "El precio debería ser 1500");
    }
    @Test
    void stockProductoEstaDisponible(){
        Producto producto = new Producto("Pan de queso",1500, 3);
        assertTrue(producto.estaDisponible(), "El producto está disponible");
    }
    @Test
    void stockProductoNoEstaDisponible(){
        Producto productoSinStock = new Producto("Pan", 1500, 0);
        assertFalse(productoSinStock.estaDisponible(), "El producto no deberia estar disponible");
    }
    @Test
    void reducirStockDisminuyeCorrectamente(){
        Producto producto = new Producto("Pan de queso",1500, 3);
        producto.reducirStock(1);
        assertEquals(2, producto.getStock(), "El stock de producto deberia haber disminuido a 2 ");
    }
    @Test
    void reducirStockMasDelDisponible(){
        Producto producto = new Producto("Pan de queso", 1500, 3);
        // Verifico que el codigo lanza una excepcion
        assertThrows(IllegalArgumentException.class, () -> {
            producto.reducirStock(4);
        });
    }
    @Test
    void ingresarPrecioNegativo(){
        // Verifico que el codigo lanza una excepcion
        assertThrows(IllegalArgumentException.class, () -> {
            Producto producto = new Producto("Pan de queso", -1500, 3);
        });
    }

}
