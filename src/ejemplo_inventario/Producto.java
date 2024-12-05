
package ejemplo_inventario;

public class Producto {
    String nombre;
    int codigo;
    double precio;
    int cantidad;
    
    public Producto(String nombre, int codigo, double precio, int cantidad){
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    
    boolean vender(int x){
        if(x <= cantidad){
            cantidad = cantidad - x;
            return true;
        }else{
            if(x <= 0){
                System.out.println("Se debe vender una cantidad mayor a 0");
            }else{
                System.out.println("No hay stock suficiente");
            }
            return false;
        }
    }
    
    void agregarStock(int x){
        if(x > 0){
        cantidad = cantidad + x;
        }else{
            System.out.println("Agrega una cantidad mayor a 0");
        }
    }
    String consultarInfo() {
    return "Nombre del producto: " + nombre +
           "\nCódigo del producto: " + codigo +
           "\nPrecio del producto: " + precio +
           "\nCantidad del producto: " + cantidad;
    }
    
}
