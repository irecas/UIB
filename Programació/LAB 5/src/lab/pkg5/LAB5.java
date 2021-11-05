/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg5;

/**
 *
 * @author Pere Antoni
 */
public class LAB5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        // Ejercicio propuesto letras ASCII
        //Leer sequencia char que acaba con '.' e imprime la letra con el numero ASCII + grande
        LT lector = new LT();
        char l1;                            //la letra que introduce el usr
        char lg;                            //la letra + grande
        int letra1 = Integer.MIN_VALUE;     //num ASCII + grande
        int letra2;                         //num ASCII var l1

        l1 = lector.leerCaracter();                         //se lee una nueva letra
        letra2 = (int) l1;                                  //asigna valor numerico a la letra    

        while (l1 != '.') {
            if (letra2 >= letra1) {
                letra1 = letra2;                        //el numero ASCII de la letra grande se guarda en letra1
                l1 = lector.leerCaracter();             //se lee una nueva letra
                letra2 = (int) l1;                      //asigna valor numerico a la letra

            } else {
                l1 = lector.leerCaracter();             //se lee una nueva letra
                letra2 = (int) l1;                      //asigna valor numerico a la letra
            }
        }
        lg = (char) letra1;                             //convierte el valor numerico de la letra mas grande a caracter
        if(letra1 != Integer.MIN_VALUE){                //comprueba que se haya introducido algún caracter
            System.out.println("La letra mas grande según la tabla ASCII es: " + lg);
        }
        else{
            System.out.println("No se ha introducido ningun caracter");
        }
        

        
        //Contar el numero de 'a'
        LT lector = new LT();
        char letraA;
        int numA = 0;
        System.out.println("Este programa cuenta el numero de 'a' y 'A' introducidas y se detiene cuando se introduce un '.'");
        System.out.println("Porfavor introduzca una letra");
        letraA = lector.leerCaracter();
        
        while(letraA != '.'){                               //Siempre que letraA no sea un punto hacer lo de dentro del bucle
            if(letraA == 'a' || letraA == 'A'){             //Si el usuario ha introducido 'a' o 'A' aumentar el contador de aes
                numA++;
            }
            letraA = lector.leerCaracter();                 //leer otro caracter
        }
        System.out.println("El numero total de 'a' introducidas es " + numA);
         
        
        //Encontrar la primera vocal introducida
        LT lector = new LT();
        char c;
        
        System.out.println("Este programa busca la primera vocal minúscula introducida");
        System.out.println("Introduce un caracter");
        c = lector.leerCaracter();
        
        while ((c != '.') && !(c=='a' || c== 'e' || c=='i' || c=='o' || c=='u')){
            c=lector.leerCaracter();
        }
        if(c=='.'){
            System.out.println("No se ha inroducido ninguna vocal minúscula");
        }
        else{
            System.out.println("La vocal es: " + c);
        }
         */
        //Contar los espacios en blanco a partir de la primera t
        LT lector = new LT();
        char c;                     //Variable donde se almacena la letra
        int espacios = 0;           //Numero de espacios despues de t
        boolean sit = false;        

        System.out.println("Este programa cuenta los espacios en blanco a partir de la primera t");
        System.out.println("Introduce una letra");
        c = lector.leerCaracter();                      //Lee el primer caracter

        while (c != '.') {                              //Entra al bucle siempre que c no sea un punto
            if (c=='t' || c=='T'){                      //cuando el usuario introduce una t se cambia el valor de sit a true
                sit = true;                
            }
            c = lector.leerCaracter();                  //Lee otro caracter
            while(sit && c!='.'){                       //si el usuario introduce una t entra al bucle ya que sit sera true
                if(c==' '){                             //si se intropduce un espacio se suma 1 al contador de espacios y se lee orto caracter
                    espacios++;
                    c = lector.leerCaracter();
                }
                else{                                   //si no se introduce espacio se pregunta por otro caracter
                    c = lector.leerCaracter();
                }
            }
           
        }
        System.out.println("El numero de espacios es " + espacios);
    }

}
