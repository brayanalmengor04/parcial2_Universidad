
package domain;

public class Triangulo extends Figura {
    private double altura;
    private double ancho ;  
    
    
    public Triangulo(){} 

    public Triangulo(double altura, double ancho) {
        this.altura = altura;
        this.ancho = ancho;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAncho() {
        return this.ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    } 

    @Override
    public double calcularArea() { 
        return (this.ancho*this.altura)/2;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Triangulo");
        sb.append("\nAltura=").append(this.altura);
        sb.append("\nAncho=").append(this.ancho);
        sb.append("\nArea del Triangulo=").append(String.format("%.2f",calcularArea()));
        return sb.toString();
    }
    
    
    
    
    
    
}
