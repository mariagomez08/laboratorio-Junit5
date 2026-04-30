import org.junit.jupiter.api.Test;
import tallerJunit5.Carrito;
import tallerJunit5.Producto;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CarritoTest {
    @Test
    void esCarritoVacio(){
        Carrito carrito = new Carrito();
        assertTrue(carrito.estaVacio(), "El carrito esta vacio");
    }

    @Test
    void agregarUnProductoAumenta(){
        Producto productoNuevo = new Producto("Leche", 1500, 3);

        Carrito carrito = new Carrito();
        carrito.agregar(productoNuevo);
        assertEquals("Leche" , productoNuevo.getNombre());
    }
    @Test
    void totalCarritoConDosProductos(){
        Producto producto1 = new Producto("Leche", 1500, 3);
        Producto producto2 = new Producto("Pan", 1500, 2);
        Carrito carrito = new Carrito();
        carrito.agregar(producto1);
        carrito.agregar(producto2);
        assertEquals(3000,carrito.calcularTotal() , "La total de un acrrito es igual a la suma de 2 productos");
    }
    @Test
    void carritoNoEstaVacio(){
        Producto producto1 = new Producto("Leche", 1500, 3);
        Carrito carrito = new Carrito();
        carrito.agregar(producto1);
        assertEquals(1, carrito.cantidadDeProductos(), "Carrito no está vacio ");
    }
    @Test
    void totalCarritoVacio(){
        Carrito carrito = new Carrito();
        assertTrue( carrito.estaVacio(), "Carrito está vacio ");
    }








}
