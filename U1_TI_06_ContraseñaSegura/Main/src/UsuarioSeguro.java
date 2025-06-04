import java.util.Scanner;

public class UsuarioSeguro {
    private String nombreUsuario, password;


    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;

    }
    public void setPassword(String password) {
        this.password = password;
        if (password.matches(".*[a-z].*")) {
            System.out.println("Debe ingresar al menos 1 mayuscula");
        }

        if (password.length() < 8) {
            System.out.println("Su contraseña debe ser mayor que 8 caracteres");
        }

        if (password.matches(".*[0-9].*")) {
            System.out.println("Debe ingresar al menos 1 numero");
        }
    }
    public void pedirPassword() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su contraseña: ");
        setPassword(scanner.nextLine());
    }

}



