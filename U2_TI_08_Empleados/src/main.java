public class main {

        public static void main(String[] args) throws Exception {
        
        EmpleadoTiempoCompleto empleadoTiempoCompleto = new EmpleadoTiempoCompleto("1", "JUAN", 1020, "Seguro popular");
        EmpleadoPorHoras empleadoPorHoras = new EmpleadoPorHoras("2", "Eliaquim", 10200, 89);
System.out.println("-------EMPLEADOS----------------");
        empleadoPorHoras.calcularSalario();
        empleadoTiempoCompleto.calcularSalario();

        
    }
}