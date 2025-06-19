public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage(4);
        
        Vehiculo v1 = new Coche("qwe", "google", 4);
        Vehiculo v2 = new Coche("asd", "Aple", 4);
        Vehiculo v3 = new Motocicleta("zxc", "Honda", true);
        
        System.out.println("Estacionando vehículos:");
        System.out.println("V1 estacionado: " + garage.estacionar(v1));
        System.out.println("V2 estacionado: " + garage.estacionar(v2));
        System.out.println("V3 estacionado: " + garage.estacionar(v3));
        
        System.out.println("\nVehiculos en garage: " + garage.contarVehiculos());
        
        System.out.println("\nRetirar vehiculo asd:");
        boolean retirado = garage.retirar("asd");
        System.out.println("Vehiculo retirado: " + retirado);
        
        System.out.println("\nVehiculos en garage despus de retirar: " + garage.contarVehiculos());
        
        System.out.println("\nIntentando retirar vehiculo con placa 'qwe':");
        retirado = garage.retirar("qwe");
        System.out.println("Vehiculo retirado: " + retirado);
        
        System.out.println("\nVeiculos en garagi: " + garage.contarVehiculos());
    }
}