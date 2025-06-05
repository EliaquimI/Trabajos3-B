import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UsuarioSeguro usuario = new UsuarioSeguro();

        System.out.print("Ingresa nombre de usuario: ");
        String nombre = sc.nextLine();
        usuario.setNombreUsuario(nombre);

        String pass;
        do {
            System.out.print("Ingresa contraseña: ");
            pass = sc.nextLine();
            usuario.setPassword(pass);
        } while (!usuario.estaInicializado());

        System.out.println("\nIntentando autenticar con contraseña incorrecta...");
        System.out.print("Introduce contraseña: ");
        String intento1 = sc.nextLine();
        if (usuario.autenticar(intento1)) {
            System.out.println("Acceso concedido");
        } else {
            System.out.println("Acceso denegado");
        }

    }
}
