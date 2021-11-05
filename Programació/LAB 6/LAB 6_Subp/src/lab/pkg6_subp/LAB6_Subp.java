/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg6_subp;

/**
 *
 * @author Pere Antoni
 */
public class LAB6_Subp {
    LT lector = new LT();
    private void p1(){
        System.out.println("Introduce tres números");
        int x = lector.leerEntero();
        int y = lector.leerEntero();
        int z =lector.leerEntero();
        int g = mayor(x, y);
        int h = mayor3 (x, y, z);
        System.out.println("El numero mas grande de los dos primeros es " + g);
        System.out.println("El numero mas grande de los tres es " + h);
    }
    
    private void p2(){
        System.out.println("Introduce un caracter");
        char c;
        boolean vocal;
         
        do{
            c = lector.leerCaracter();
            vocal = esvocal(c);
        }while(!vocal || c!='.');
        System.out.println("Vocal " + c);
    }
     
    private boolean esvocal(char c){
        boolean temp = (c=='a' || c=='e' || c=='i' || c=='o' || c=='u');
        return temp;
    }
    
    public int mayor (int i, int j){
    if (i>j){
        return i;
    }
    else
        return j;
    }
    
    public int mayor3(int i, int j, int k){
        int m = i;
        if(j>m){
            m=j;
        }
        if (k>m){
            m=k;
        }
        return m;
    }
    
    public static void main(String[] args) {
        LAB6_Subp s = new LAB6_Subp();
        s.p2();
    }
}
