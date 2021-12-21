/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamificación.pkg4;

/**
 *
 * @author Pere Antoni
 */
public class Gamificación4 {

    /**
     * @param args the command line arguments
     */
    public void prueba() {
        Vehiculo coche = new Vehiculo("8611HMX");     //Se crea un nuevo vehiculo
        Vehiculo camion = new Vehiculo("8654JYD");    //Se crea un nuevo vehiculo
        coche.repostar(30);       //El vehiculo 'coche' repuesta 30L
        camion.repostar(5);       //El ehiculo camion repuesta 5L
        System.out.println("La cantidad de combustible usada por el coche es de " + coche.viaja(165) + "L");          //EL vehiculo 'Coche' viaja 165Km
        System.out.println("La cantidad de combustible usada por el camion es de " + camion.viaja(165) + "L");        //EL vehiculo 'Coche' viaja 165Km
        System.out.println("La distancia que se puede viajar actualmente con el coche es de " + coche.estimacionDistancia() + "Km");       //Se calcula la distancia estimada que se puede viajar
        System.out.println("Los vehiculos son iguales? " + coche.equals(camion.matricula()));             //Se compara si coche = camion
        System.out.println(coche.toString());         //Se imprimen los datos de coche
        System.out.println(camion.toString());        //Se imprimen los datos de camion
    }

    public static void main(String[] args) {
        Gamificación4 g = new Gamificación4();
        g.prueba();
    }

}
