/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamificación.pkg3;

/**
 *
 * @author Pere Antoni Prats Villlalonga
 */

public class Gamificación3 {

    public void programa(){
        int [] primos = new int [100];      //Array con los 100 primeros primos
        int idx;                            //Indice
        
        primos[0] = siguienteprimo(0);         //Buscar el primer primo
        
        for(idx = 1; idx < primos.length; idx++){           //buscar los primos desd el 2º hasta el nº100
            primos[idx] = siguienteprimo(primos[idx-1]);       //añadir cada primo a su respectiva posición
        }
        
        printNum(primos, idx);          //Imprimir los numeros
    }
    
    private int siguienteprimo(int primo){
        boolean encontrado = false;         //variable para saber si se ha encontrado un primo   
        //Buscar el siguiente numero primo        
        while(!encontrado){         //Si no se ha encontrado ningun primo, seguir buscando
            primo++;                //Pasar al siguiente numero
            encontrado = esprimo(primo);        //Comprobar si el numero actual es primo
        }        
        return primo;
    }
    
    private boolean esprimo(int primo){
        int divisores = 0;
        boolean encontrado = false;
            
        for (int i = 1; i <= primo; i++) {          //Busca los divisores del num desde 1 hasta el numero actual a menos que encuentre mas de dos divisores
            if (primo % i == 0) {                   //Cuando encuentra un divisor suma 1 a la var divisores
                divisores++;                        //Aumenta el numero de divisores
            }
        }
            if(divisores == 2){         //Si el numero es primo "encontrado" sera verdadero
                encontrado = true;
            }
            
        return encontrado;    
    }
    
    private void printNum(int [] primos, int idx){
        System.out.println("Los 100 primeros numeros primos són");
        for(idx = 0; idx < primos.length; idx++){
            System.out.println(primos[idx]);
        }
    }
    
    public static void main(String[] args) {
        Gamificación3 g = new Gamificación3();
        g.programa();
    }
    
}
