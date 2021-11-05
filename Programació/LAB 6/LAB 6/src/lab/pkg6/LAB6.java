/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg6;

/**
 *
 * @author Pere Antoni
 */
public class LAB6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Indicar la posición de la primera aparición de cada vocal
        LT lector = new LT();
        char letra = 'c';
        int posición = 0;
        int pa = 0, pe = 0, pi = 0, po = 0, pu = 0;
        
        System.out.println("Porfavor introduce la palabra letea por letra");
        
        while ((pa==0 || pe==0 || pi==0 || po==0 || pu==0) && (letra != '.')){
            posición++;
            letra = lector.leerCaracter();
            if(letra == 'a'){
                if(pa == 0){
                    pa = posición;
                }
            }
            if(letra == 'e'){
                if(pe == 0){
                    pe = posición;
                }
            }
            if(letra == 'i'){
                if(pi == 0){
                    pi = posición;
                }
            }
            if(letra == 'o'){
                if(po == 0){
                    po = posición;
                }
            }
            if(letra == 'u'){
                if(pu == 0){
                    pu = posición;
                }
            }
                        
        }
        //posición a
        if(pa != 0){
            System.out.println("La primera a sen encuentra en la posición " + pa);
        }
        else{
            System.out.println("No aparece ninguna a");
        }
        //posición e
        if(pe != 0){
            System.out.println("La primera e sen encuentra en la posición " + pe);
        }
        else{
            System.out.println("No aparece ninguna e");
        }//posición i
        if(pi != 0){
            System.out.println("La primera i sen encuentra en la posición " + pi);
        }
        else{
            System.out.println("No aparece ninguna i");
        }
        //posición o
        if(po != 0){
            System.out.println("La primera o sen encuentra en la posición " + po);
        }
        else{
            System.out.println("No aparece ninguna o");
        }
        //posición u
        if(pu != 0){
            System.out.println("La primera u sen encuentra en la posición " + pu);
        }
        else{
            System.out.println("No aparece ninguna u");
        }
        
        //
    }
}
