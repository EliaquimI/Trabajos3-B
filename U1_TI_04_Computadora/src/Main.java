import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Computadora computadora = new Computadora("Lenovo");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Marca: "+computadora.getModelo());
        // System.out.println("Dime el modelo de tu computadora");

        // System.out.println("¿Tu computadora está prendida? (1 = Sí, 0 = No)");
        // int estado = scanner.nextInt();
        computadora.encender();
        computadora.encender();
        computadora.apagar();
        // if (estado == 1) {
        //     computadora.apagar();
        // } else {
        //     computadora.encender();
        // }

        scanner.close();
    }
}
