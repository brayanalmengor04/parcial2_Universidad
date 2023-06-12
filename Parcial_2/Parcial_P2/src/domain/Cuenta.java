
package domain;

import javax.swing.JOptionPane;

public  class Cuenta {
    protected int numeroCuenta ;
    protected String nombreCliente ; 
    protected double saldo; 

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, String nombreCliente, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.nombreCliente = nombreCliente;
        this.saldo = saldo;
    }

    public int getNumeroCuenta() {
        return this.numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getNombreCliente() {
        return this.nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public  String consultarSaldo (){
    
        return toString();
    };
    public  void depositarSaldo (double saldo){
        if (saldo>0) this.saldo+=saldo; 
        else JOptionPane.showMessageDialog(null, "Error ,No se puede depositar esta cifra","Cifra INVALIDA"
                ,JOptionPane.ERROR_MESSAGE);
    }; 
    public void retirarSaldo(double saldo){
         if(saldo>this.saldo)JOptionPane.showMessageDialog(null, "Error ,Saldo Insuficiente","Saldo Insuficiente"
                ,JOptionPane.ERROR_MESSAGE);
        else this.saldo -=saldo;
    };

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cuenta");
        sb.append("\nNumero Cuenta= ").append(this.numeroCuenta);
        sb.append("\nNombre Cliente= ").append(this.nombreCliente);
        sb.append("\nSaldo= ").append(this.saldo);
        return sb.toString();
    }    
}
