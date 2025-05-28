public class Computadora {
    private String marca, modelo;
    private boolean encendida;

    public Computadora(String modelo){
        this.marca = marca;
        this.modelo= modelo;
    }
    public void encender(){
        if (!encendida) {
            encendida = true;
            System.out.println("La computadora se esta encendiendo.");    
        }
    }

    public void apagar(){
        if (encendida) {
            encendida = false;
            System.out.println("Apagando...");
        }
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public boolean isEncendida() {
        return encendida;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
