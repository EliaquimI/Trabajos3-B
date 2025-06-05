
public class Main {
public static void main(String[] args) {
    Persona persona1 = new Persona("", 0, 0);
    persona1.calcularMC();
    
    System.out.println("--------------TUS DATOS SON-----------------");
    persona1.clasificarIMC();
    persona1.mostrarDatos();
}
}
