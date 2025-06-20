
public class Main {
    public static void main(String[] args) {
        Inventario inventario = new Inventario(3);

        Producto p1 = new Producto("1", "Limones", 23);
        Producto p2 = new Producto("2", "Uvas", 45);
        Producto p3 = new Producto("3", "Plátanos", 37);
        Producto p4 = new Producto("4", "Pereji", 1);

        inventario.agregarProducto(p1);
        System.out.println("Total de items en el inventario: " + inventario.totalItems());

        inventario.agregarProducto(p2);
        System.out.println("Total de items en el inventario: " + inventario.totalItems());

        inventario.agregarProducto(p3);
        System.out.println("Total de items en el inventario: " + inventario.totalItems());

        inventario.agregarProducto(p4);
        System.out.println("Total de items ennel inventaroi: " + inventario.totalItems());

        inventario.buscar("2");
        inventario.buscar("5");

        inventario.eliminarProducto("2");
        System.out.println("Total de items en el inventario: " + inventario.totalItems());

        inventario.agregarProducto(p4);
        System.out.println("Total de items en el inventario: " + inventario.totalItems());
    }
}
