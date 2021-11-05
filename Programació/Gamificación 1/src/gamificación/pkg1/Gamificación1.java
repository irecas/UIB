/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamificación.pkg1;

/**
 *
 * @author Pere Antoni
 */
public class Gamificación1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LT lector = new LT();           //Se declara una variable lector para recibir datos del usuario
        int Lmin;                       //Esta variable es el numero ASCII equivalente a la letra minúscula introducida
        int Lmay;                       //Esta variable es el numero ASCII equivalente a la letra mayúscula introducida
        boolean validez = false;
        System.out.println("Este programa transforma una letra minuscula a una letra mayuscula");           //Presentación del programa

        do {                     //Se va a repetir el proceso hasta que el usuario introduzca un caracter válido                                 
            System.out.println("Porfavor introduzca un caracter en minúscula y presione enter:");           //Se solicita al usuario que introduzca un caracter
            Lmin = (int) lector.leerCaracter();                                //Se asigna a la variable Lmin el valor en ASCII del caracter introducido

            if (Lmin <= 96 || Lmin >= 123) {                    //Se comprueba si la letra introduzida es una letra minuscula
                if (Lmin >= 65 && Lmin <= 90) {                 //En caso de que no sea una letra minuscula se comprueba si es una letra mayuscula (en caso afirmativo se informa de que ha introducido una letra mayuscula)
                    System.out.println("Ha introducido una letra mayuscula.");
                } else {                                        //En casode que no sea ni una letra minuscula ni mayuscula se informa de que ha introducido otro tipo de caracter 
                    System.out.println("Ha introducido un caracter especial o un numero.");
                }
            } else {                                            //En caso de que la letra sea minuscula
                validez = true;
                Lmay = Lmin - 32;                               //Se transforma la letra minuscula a mayuscula ya que en la tabla ASCII la letra mayuscula correspondiente esta asignada al valor que esta 32 posiciones antes
                System.out.println((char) Lmin + " en mayuscula es " + (char) Lmay);              //Se devuelve por pantalla la letra mayuscula
            }
        } while (validez != true);
    }
}
