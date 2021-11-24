/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg8;

/**
 *
 * @author Pere Antoni
 */
public class LAB8 {
    LT lector = new LT();
    //Pedir dos arrays de 5 nums al usuario
    private void p1(){
        int vector1[] = new int[5];
        int vector2[] = new int[5];
        int idx;
        
        System.out.println("Introduce el vector 1");
        for(idx = 0; idx < vector1.length; idx++){
            vector1 [idx] = lector.leerEntero();
        }
        System.out.println("Introduce el vector 2");
        for(idx = 0; idx < vector2.length; idx++){
            vector2 [idx] = lector.leerEntero();
        }
        
        int escalar = pescalar(vector1, vector2);
        System.out.println("El producto escalar es : " + escalar);
    }
    //comparar si dos arrays son iguales
    private void p3(){
        System.out.println("introduce una palabra");
        String s1 = lector.leerLinea();
        char pal1[] = s1.toCharArray();
        System.out.println("introduce otra palabra");
        String s2 = lector.leerLinea();
        char pal2[] = s2.toCharArray();
        
        boolean iguales = compareArray(pal1, pal2);
        
        if(iguales){
            System.out.println("Las palabras son iguales");
        }else if(!iguales){
            System.out.println("Las palabras no son iguales");
        }
    }
    //funcion para crear arrays de enteros de un n numero de digitos
    private int[] devuelveArrayEnteros(int tam){
        int vector [] = new int[tam];
        for(int i = 0; i < tam; i++){
            vector[i] = lector.leerCaracter();
        }
        return vector;
    }
    //Hacer el producto escalar de dos arrays
    private int pescalar(int [] v1, int [] v2){
        int res = 0;
        int tam = v1.length;
        for(int i = 0; i < tam; i++){
            res = res + (v1[i] * v2[i]);
        }
        return res;
    }
    //Comparar arrays
    private boolean compareArray(char v1[], char v2[]){
        boolean iguales = true;
        int i = 0;
        while(i<v1.length || iguales){
            if(v1[i] != v2[i]){
                iguales = false;
            }
            i++;
        }
        
        return iguales;
    }
    
    public static void main(String[] args) {
        LAB8 p = new LAB8();
        p.p3();
    }
    
}
