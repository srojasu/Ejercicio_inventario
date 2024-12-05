package ejemplo_inventario;
import java.util.ArrayList;

public class Inventario {
    
    private ArrayList<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }
    
    public void agregarProducto(Producto producto) {
        productos.add(producto);
        System.out.println("Producto agregado: " + producto.nombre);
    }

    public Producto buscarProducto(int codigo) {
        for (Producto producto : productos) {
            if (producto.codigo == codigo) {
                return producto;
            }
        }
        System.out.println("Producto con código " + codigo + " no encontrado.");
        return null;
    }

    public void mostrarInventario() {
        if (productos.isEmpty()) {
            System.out.println("El inventario está vacío.");
        } else {
            System.out.println("Inventario:");
            for (Producto producto : productos) {
                System.out.println(producto.consultarInfo());
            }
        }
    }

}
