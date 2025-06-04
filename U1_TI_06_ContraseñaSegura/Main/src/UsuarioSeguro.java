import java.util.Scanner;

public class UsuarioSeguro {
    private String nombreUsuario, password;


    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;

    }
    public void setPassword(String password) {
        this.password = password;
        if (password.length() < 8) {
            System.out.println("Su contraseña debe ser mayor que 8 caracteres");
        }if (password.matches(".*[a-zA-Z].*")) {
            System.out.println("Debe tener una mayuscula de caracteres");
        }
    }
    public void pedirPassword() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su contraseña: ");
        setPassword(scanner.nextLine());
    }

}



