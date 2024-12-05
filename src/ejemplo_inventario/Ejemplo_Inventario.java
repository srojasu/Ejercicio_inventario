package ejemplo_inventario;
public class Ejemplo_Inventario {


    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        
        Producto cebolla = new Producto("Cebolla", 1092, 250.50, 20);
        Producto manzana = new Producto("Manzana", 1093, 230.0, 35);
        Producto cocacola = new Producto("Coca-Cola", 1094, 300.50, 40);
        Producto chocolate = new Producto("Chocolate", 1095, 150.20, 12);
        Producto tomate = new Producto("Tomate", 1096, 200.50, 24);
        
        inventario.agregarProducto(cebolla);
        inventario.agregarProducto(manzana);
        inventario.agregarProducto(cocacola);
        inventario.agregarProducto(chocolate);
        inventario.agregarProducto(tomate);
        
        cebolla.vender(10);
        cebolla.agregarStock(3);
        cebolla.consultarInfo();
        
        inventario.buscarProducto(1024);
        cocacola.agregarStock(7);
        cocacola.vender(4);
        
        inventario.mostrarInventario();
        
        
    }
    
}
