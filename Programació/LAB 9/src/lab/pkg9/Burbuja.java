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
public class Burbuja {
    private int radio;
    private boolean humo;
    private static int contador = 0;
    
    //constructores
    public Burbuja(){
        radio = 1;
        humo = false;
        contador++;
    }
    public Burbuja(int r){
        radio = r;
        humo = false;
        contador++;
    }
    
    //getter
    public int consultRad(){
        return radio;
    }
    //setter
    public void asignRad(int r){
        radio = r;
    }
    
    public static int totalBurbujas(){
        return contador;
    }
}
