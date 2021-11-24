/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg7;

/**
 *
 * @author Pere Antoni
 */
public class LAB7 {
    LT lector = new LT();
    char letra;
    //Ejercicios
    private void contar_palabras(){
        int total;
        total = 0;
        System.out.println("Introduce una letra");
        letra = lector.leerCaracter();      //lee el primer caracter
        saltar_blancos();           //se salta los espacios en blanco ya que no son palabras
        
        while (letra != '.'){       //se ejecuta hasta que se introduce un punto
            saltar_palabra();       //se lee la palabra completa
            total++;                //al acabar la palabra se suma uno al total
            saltar_blancos();       //se salta los blancos ya que no son palabras
        }
        
        System.out.println("El total de palabras escritas es " + total);
    }
    private void p1(){
        //contar palabras pares e impares
        int pares;
        pares = 0;
        int impares;
        impares = 0;
        int letras;
        letras = 0;
        
        System.out.println("Introduce una letra");
        letra = lector.leerCaracter();      //lee el primer caracter
        saltar_blancos();           //se salta los espacios en blanco ya que no son palabras

        while (letra != '.'){
            letras = contar_letras(letras);  
            pares = pares + contar_pares(letras);
            impares = impares + contar_impares(letras);
            saltar_blancos();
        }
        System.out.println("El total de palabras pares es: " + pares);
        System.out.println("El total de palabras impares es: " + impares);
    }
    private void p2(){
        //Contar las palabras que al menos tienen una a 
        int tienea;
        tienea = 0;
        
        System.out.println("Introduce las letras de la palabra");
        letra = lector.leerCaracter();
        saltar_blancos();
        while(letra != '.'){
            tienea = tienea + contar_a();
            saltar_blancos();
        }
        System.out.println("El numero de palabras que contienen al menos una 'a' es: " + tienea);
    }
    private void p3(){
        //contar las palabras que al menos tienen una vocal
        int tienevocal;
        tienevocal = 0;
        
        System.out.println("Introduce las letras de la palabra");
        letra = lector.leerCaracter();
        saltar_blancos();
        while(letra != '.'){
            tienevocal = tienevocal + contar_vocal();
            saltar_blancos();
        }
        System.out.println("El numero de palabras que contienen al menos una 'vocal' es: " + tienevocal);
    }
    private void p4(){
        int totalSA;
        totalSA = 0;
        System.out.println("Introduce una letra");
        letra = lector.leerCaracter();
        saltar_blancos();
        
        while(letra != '.'){
            totalSA = totalSA + buscarSA();
            saltar_palabra();
            saltar_blancos();            
        }
        System.out.println("El total de palabras que empiezan por 'sa' es " + totalSA);
    }
    //Subprogramas
    private void saltar_blancos(){
        while(letra == ' '){
            letra = lector.leerCaracter();
        }
    }
    private void saltar_palabra(){
        while(letra != ' ' && letra != '.'){
            letra = lector.leerCaracter();
        }
    }    
    private int contar_letras(int i){
        while(letra != ' ' && letra != '.'){
            i++;
            letra = lector.leerCaracter();            
        }
        return i;
    }
    private int contar_pares(int i){
        int j = 0;
        if(i % 2 == 0){j++;}
        return j;
    }
    private int contar_impares(int i){
        int j = 0;
        if(i % 2 != 0){j++;}
        return j;
    }
    private int contar_a(){
        boolean j = false;
        while (letra != ' ' && letra != '.'){
            if(letra == 'a' || letra == 'A'){j = true;}
            letra = lector.leerCaracter();
        }           
        if(j == true){return 1;}
        else{return 0;}
    }
    private int contar_vocal(){
        boolean j = false;
        while (letra != ' ' && letra != '.'){
            if((letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u')|| (letra == 'A' ||  letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U')){
                j = true;
            }
            letra = lector.leerCaracter();
        }           
        if(j == true){return 1;}
        else{return 0;}
    }
    private int buscarSA(){
        if ((letra == 's') || (letra == 'S')){
            letra = lector.leerCaracter();
            if(letra == 'a' || letra == 'A'){
                return 1;
            }else{
                return 0;
            }
        }else{
            return 0;
        }
    }
    
    public static void main(String[] args) {
        LAB7 p = new LAB7();
        p.p4();
    }
    
}
