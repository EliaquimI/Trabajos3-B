import java.util.Scanner;

public class Persona {
    private String nombre,clasificacion;
    private double altura,peso,IMC;
    public Persona(String nombre, double altura, double peso) {
        this.nombre = nombre;
        this.altura = altura;
        this.peso = peso;
    }
    Scanner scanner = new Scanner(System.in);
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    double calcularMC(){
    System.out.println("Dame tu peso: ");
    setPeso(scanner.nextDouble());
    System.out.println("Dame tu altura: ");
    setAltura(scanner.nextDouble());
    scanner.nextLine();
    System.out.println("Dame tu nombre: ");
    setNombre(scanner.nextLine());
        IMC = peso / (altura*altura);
        return IMC;
    }
    String clasificarIMC(){
        if (IMC <= 18.5) {
            System.out.println("Peso bajo");   
        }
    if (IMC >= 18.5 || IMC <= 24.9) {
            clasificacion = "Tu peso es normal";
        }if (IMC >= 25.0 || IMC <= 29.9) {
            clasificacion = "Tienes sobrepeso";
        }
        if (IMC > 30) {
            clasificacion = "Tienes obesidad";
        }
    return clasificacion;
    }
    
void mostrarDatos(){
    System.out.println("Nombre: "+getNombre());
    System.out.println("Peso: "+getPeso());
    System.out.println("Altura: "+ getAltura());
    System.out.println("Tu clasificacion es: "+ clasificarIMC());
}
}
