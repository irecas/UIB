/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg4;

/**
 *
 * @author Pere Antoni
 */
public class LAB4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    /*    
    //BUCLES
        //for   [for(inicialización; condición de finalización; que hacer después del bucle){}]
        //while [while(condición){hacer esto}]
        
        LT lector = new LT();
        int num = lector.leerEntero();
        int factorial = 1;
        
        //factorial for
        
        for(int i=1; i<=num; i++){
            factorial *= i;        
        }
        
        System.out.println("For: " + "El factorial de " + num + " es " + factorial );
        
        //factorial while
        
        factorial = 1;
        int i = 1;
        while(i<=num){
            factorial *= i;
            i++;        
        }
        
        System.out.println("While: " + "El factorial de " + num + " es " + factorial );
        
        //Ejercicio Propuesto 1 (ir sumando numeros que introduce el usuario)
        System.out.println("introduce un número");
        LT lector = new LT();
        int num = lector.leerEntero();
        int suma = 0;
        
        while(num!=0){
            suma += num;
            System.out.println("introduce un número");
            num = lector.leerEntero();
        }
        
        System.out.println("El total es " + suma);
       
        //Ejercicio propuesto 2 (indicar al usuario si el numero que introduce es par)
        
        LT lector = new LT();
        int num = 1;
        int par = 0;
        int impar = 0;
        
        while(num != 0){
            System.out.println("Introduce un número");
            num = lector.leerEntero();
             if( num%2 == 0){
                 par++;
                 System.out.println("El número " + num + " es par");
             }
             else{
                 impar++;
                 System.out.println("El número " + num + " es impar");
             }
             
        }
        
        System.out.println("El numero de pares introducido es " + par);
        System.out.println("El numero de impares introducido es " + impar);
        
        //Ejercicio propuesto 3 (indicar todos los divisores de un numero)
        
        System.out.println("introduce un numero:");
        LT lector = new LT();
        int num = lector.leerEntero();
        
        System.out.println("Los divisores de " + num + " són:");
        for (int i=1; i<=num; i++){
            if(num%i == 0){
                System.out.println(i);
            }
        }
        
        //Ejercicio programado 4 (decir si un numero es primo o no)
        System.out.println("introduce un numero:");
        LT lector = new LT();
        int num = lector.leerEntero();
        int divisores = 0;
        
        for (int i=1; i<=num; i++){
            if(num%i == 0){
                divisores++;
            }
        }
        if(num == 1 || num==0){
          System.out.println("El numero no puede ser ni 0 ni 1");
        }
        if(divisores==2){
            System.out.println("El número " + num + " es primo");
        }
        else{
            System.out.println("El número " + num + " no es primo");
        }*/
        
    
        //Ejercició programado 5 (mostrar la tabla del numero introducido)
        
        System.out.println("Introduce un numero del 1 al 10:");
        LT lector = new LT();
        int num = lector.leerEntero();
        int res;
        
        if(num<=0 || num>=11){
            System.out.println("El numero introducido debe ser del 1 al 10");
        }
        else{
            System.out.println("La tabla del " + num);
            for(int i=0; i<=10; i++){
                res=num*i;
                System.out.println(num + "x" + i + " = " + res);
            }
        }
        
    }
}
