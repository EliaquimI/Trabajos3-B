import java.util.Scanner;

public class UsuarioSeguro {
    private String nombreUsuario, password;


    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;

    }
    public void setPassword(String password) {
        this.password = password;

    }
    public boolean validarContraseña (String password) {
        int contador = 0;

            while (true) {
                password.charAt(contador);
                contador++;

                return  contador > 8;
            }
    }
    
    public void pedirPassword () {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su contraseña: ");
        setPassword(scanner.nextLine());
    }
}





