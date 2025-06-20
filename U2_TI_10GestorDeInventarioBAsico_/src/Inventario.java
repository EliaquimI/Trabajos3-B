

public class Inventario {
    Producto[] stock;

    public Inventario(int tamaño) {
        stock = new Producto[tamaño];
    }

    public boolean agregarProducto(Producto p) {
        for (int i = 0; i < stock.length; i++) {
            if (stock[i] == null) {
                stock[i] = p;
                System.out.println("Agregado correctamente");
                return true;
            }
        }
        System.out.println("Está lleno");
        return false;
    }

    public boolean eliminarProducto(String codigo) {
        for (int i = 0; i < stock.length; i++) {
            if (stock[i] != null && stock[i].getCode().equals(codigo)) {
                stock[i] = null;
                System.out.println("Producto eliminado");
                return true;
            }
        }
        System.out.println("Producto no encontrado");
        return false;
    }

    public Producto buscar(String codigo) {
        for (int i = 0; i < stock.length; i++) {
            if (stock[i] != null && stock[i].getCode().equals(codigo)) {
                return stock[i];
            }
        }
        return null;
    }

    public int totalItems() {
        int total = 0;
        for (int i = 0; i < stock.length; i++) {
            if (stock[i] != null) {
                total += stock[i].getAmount();  
            }
        }
        return total;
    }
}
