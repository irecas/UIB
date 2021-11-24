/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg9;

/**
 *
 * @author Pere Antoni
 */

public class Cuenta {
    private double saldo;
    private double interes;
    private static int total;
    
    
    //Cuenta normal
    public Cuenta(double saldo){
        this.saldo = saldo;
        interes = 5;
        total++;
    }
    //cuenta bebe
    public Cuenta(){
        saldo = 100;
        interes = 2;
        total++;
    }
    //cuenta vip
    public Cuenta(double saldo, double interes){
        this.saldo = saldo;
        this.interes = interes;
        total++;
    }
    
    //Metodos
    //Deposito
    public void deposito(double deposito){
        saldo = saldo + deposito;
    }
    //Pago
    public void pago(double pago){
        if(saldo<pago){
            System.out.println("No dispone de suficiente saldo");
        }else{
        saldo = saldo - pago;
        }
    }
    //Modificar interes
    public void cambiarInteres(double interes){
        this.interes = interes;
    }
    //Abono intés
    public void abonoInteres(){
        saldo = (saldo*interes)/100;
    }
    //Consultar Saldo
    public double consultSaldo(){
        return saldo;
    }
    //Consultar Interes
    public double consultInteres(){
        return interes;
    }
    //Transferencia
    public void transferencia(Cuenta cuentaDeposito, double cantidad){
        if(saldo<cantidad){
            System.out.println("No dispone de suficiente saldo");
        }else{
            this.saldo = this.saldo - cantidad;
            cuentaDeposito.deposito(cantidad);
            System.out.println("LA transferencia de " + cantidad + " a " + cuentaDeposito + " se ha realizado con èxito ");
        }
    }
    //Transferencia Main
    public static void transferencia(Cuenta cuentaPago, Cuenta cuentaDeposito, double cantidad){
        if((cuentaPago.consultSaldo() - cantidad) > 0){
            cuentaPago.pago(cantidad);
            cuentaDeposito.deposito(cantidad);
            System.out.println("La transferencia de " + cantidad + " desde " + cuentaPago + "a" + cuentaDeposito + " se ha realizado con èxito");
        }else{
            System.out.println("No dispone de saldo suficiente para realizar la transferencia");
        }
        
        
    }
    //Consultar datos de la cuenta
    public String toString(){
        return "El saldo es de " + saldo + " € y el interes es del " + interes + "%";
    }
}
