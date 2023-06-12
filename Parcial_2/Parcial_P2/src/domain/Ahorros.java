
package domain;

import javax.swing.JOptionPane;

public class Ahorros  extends Cuenta{
    private  float totalInteres ; 
    private String fechaVencimiento;
    private int porcentajeMensual;
    
    
    public Ahorros() {
    }

    
    public Ahorros(int numeroCuenta, String nombreCliente, double saldo,int porcentajeM ) {
        super(numeroCuenta, nombreCliente, saldo); 
       this.porcentajeMensual = porcentajeM;
       this.totalInteres = (float) (this.saldo*this.porcentajeMensual/100);
        
    }
    
    public String getFechaVencimiento() {
        return this.fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public int getPorcentajeMensual() {
        return this.porcentajeMensual;
    }

    public void setPorcentajeMensual(int porcentajeMensual) {
        this.porcentajeMensual = porcentajeMensual;
    }
    
   public float getTotalInteres() {
        return totalInteres;
    }

    public void setTotalInteres(float totalInteres) {
        this.totalInteres = totalInteres;
    }

    
    
    // AL ver herencia esta clase tambien hereda los metodos como de consulta , deposito y retiro
    
    // Simulare la fecha digamos que proporcoion esta fecha 04 /07 /2012
    // el substring obtendra lo que hay en el string del indice 0 y 1 osea 
    // 04 el dia de la fecha de vencimiento
    
    // esto es un metodo diferente al metodo heredado osea especialmente para esta clase que 
    // solo permitira retirar si esta en el dia de fecha de vencimiento
    public void retirarSaldo(double saldoI, String dia ) {  
        if(dia.equals(this.fechaVencimiento.substring(0,1)) && this.saldo >=saldoI)
           this.saldo =getSaldo()-saldoI; 
        else if(dia.equals(this.fechaVencimiento.substring(0,1)) && this.saldo <saldoI)
             JOptionPane.showMessageDialog(null, "Saldo Insuficiente");
    }
    
    // Hare que si no se deposita interes no permita retirar dinero hasta que pague el dinero
    public void depositarInteres (double interes){
        if(interes>this.totalInteres) this.totalInteres=0.00f;
        
        else if (interes==this.totalInteres){
            this.totalInteres =0.00f;
            JOptionPane.showMessageDialog(null, "Usted a Pagado toda la Cuota");}
        else if(this.totalInteres==0.00 && this.totalInteres<0.00){ 
            this.totalInteres =0.00f;
        JOptionPane.showMessageDialog(null, "Usted a Pagado toda la Cuota");} 
        
        else if(interes <this.totalInteres) this.totalInteres -= interes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Ahorros");
        sb.append("\nNombre del Cliente= ").append(this.nombreCliente);
        sb.append("\nNumero Cuenta= ").append(this.numeroCuenta); 
        sb.append("\nFecha Vencimiento=").append(this.fechaVencimiento);
        sb.append("\nPorcentaje Mensual=").append(this.porcentajeMensual);
        sb.append("\nTotal Intereses =").append(this.totalInteres);
        sb.append("\nSaldo Actual =").append(this.saldo);
        return sb.toString();
    }

    
    
   
}
