
package domain;

import javax.swing.JOptionPane;

public class Cheques extends Cuenta {
   
    private double comision; 
            
    public Cheques() {
    }

    public Cheques(int numeroCuenta, String nombreCliente, double saldo , double comision) {
        super(numeroCuenta, nombreCliente, saldo); 
        this.comision = comision;
        this.saldo -= this.comision;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }
    
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cheques");
        sb.append("\nNombre del Cliente= ").append(this.nombreCliente);
        sb.append("\nNumero Cuenta= ").append(this.numeroCuenta); 
        sb.append("\nComision de Chequera Descontado =").append(this.comision);
        sb.append("\nSaldo Actual =").append(this.saldo);
        return sb.toString();
    }

    
}
