
package domain;

public class Rectangulo extends Figura {
    
    private double largo; 
    private double ancho ;
    
    public Rectangulo (){}
    
    public Rectangulo(Double largo ,Double ancho){
        this.largo = largo; 
        this.ancho = ancho ; 
    }
    
    public double getLargo() {
        return this.largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAncho() {
        return this.ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }
    
    // Implementacion de la clase abstracta figura
    @Override
    public double calcularArea() {
        return (this.largo*this.ancho); 
    }
    // METODO TOSTRING para mostrar Datos
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rectangulo\n");
        sb.append("\nLargo=").append(this.largo);
        sb.append("\nAncho=").append(this.ancho);
        sb.append("\nArea del rectangulo : ").append(String.format("%.2f",calcularArea()));
        return sb.toString();
    }

    
}
