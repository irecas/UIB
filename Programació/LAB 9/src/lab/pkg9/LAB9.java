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
public class LAB9 {

    public void programa(){
    Cuenta rico = new Cuenta(5000000, 25);
    Cuenta normal = new Cuenta(4500);
    Cuenta bebe = new Cuenta();
    
    rico.consultSaldo();
    rico.transferencia(bebe, 1000);
} 
    public static void main(String[] args) {
        LAB9 p = new LAB9();
        p.programa();
    }
    
}
