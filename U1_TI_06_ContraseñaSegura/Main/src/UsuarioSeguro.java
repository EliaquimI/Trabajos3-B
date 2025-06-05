public class UsuarioSeguro {
    private String nombreUsuario;
    private String password;

    public void setNombreUsuario(String nombreUsuario) {
        if (nombreUsuario != null && !nombreUsuario.trim().isEmpty()) {
            this.nombreUsuario = nombreUsuario;
        } else {
            System.out.println("Error: El nombre de usuario no puede ser nulo ni vacío.");
        }
    }

    public void setPassword(String password) {
        boolean obligarMayusculas = false;
        boolean obligarMinusculas = false;
        boolean obligarNumero = false;

        if (password == null || password.length() < 8) {
            System.out.println("Error: La contraseña debe tener al menos 8 caracteres.");
            return;
        }

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                obligarMayusculas = true;
            } else if (c >= 'a' && c <= 'z') {
                obligarMinusculas = true;
            } else if (c >= '0' && c <= '9') {
                obligarNumero = true;
            }
        }

        if (!obligarMayusculas) {
            System.out.println("Error: La contraseña debe contener al menos una letra mayúscula.");
        }
        if (!obligarMinusculas) {
            System.out.println("Error: La contraseña debe contener al menos una letra minúscula.");
        }
        if (!obligarNumero) {
            System.out.println("Error: La contraseña debe contener al menos un dígito.");
        }

        if (obligarMayusculas && obligarMinusculas && obligarNumero) {
            this.password = password;
        }
    }

    public boolean autenticar(String intentoPassword) {
        return this.password != null && this.password.equals(intentoPassword);
    }

    public boolean estaInicializado() {
        return this.nombreUsuario != null && this.password != null;
    }
}
