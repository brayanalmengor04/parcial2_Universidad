
package domain;

public class Circunferencia extends Figura {

    private double radio ;
    
    public Circunferencia(){} 
    
    public Circunferencia(Double radio){
        this.radio = radio;
    }
     
    
    public double getRadio() {
        return this.radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() { 
        return Math.PI*(Math.pow(this.radio, 2)); 
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Circunferencia\n");
        sb.append("\nRadio=").append(this.radio);
        sb.append("\nArea de la Circunferencia =").append(String.format("%.2f",calcularArea()));
        return sb.toString();
    }
    
    
    
    
}
