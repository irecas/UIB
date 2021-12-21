/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamificación.pkg5;

/**
 *
 * @author Pere Antoni
 */
public class Gamificación5 {

    /**
     * @param args the command line arguments
     */
    
    private char[] frase;
    private int idx;
    private palabra primeraPalabra;
    private palabra pal;
    LT l = new LT();
    
    public void programa(){
        boolean cierto;
        System.out.println("Introduzca un texto terminado en '.'");
        String s = l.leerLinea();
        frase = s.toCharArray();
        //Leer primera palabra
        setPrimeraPal();
        //Leer siguiente palabra
        pal = leerPalabra();
        //Comprobar si la palabra es valida
        System.out.println("Estas son las palabras validas: ");
        while(!pal.palVacia()){
            cierto = posibleCandidato(pal);
            //Mostrar palabras validas
            if(cierto){
                System.out.println(pal);
            }
            pal = leerPalabra();
        }        
    }
    
    private void setPrimeraPal(){
        idx = 0;
        primeraPalabra = leerPalabra();
    }
    
    private boolean posibleCandidato(palabra p){
        boolean esCierto;
        int i;
        int j;
        char[] aux1;
        char[] aux2;
        
        aux1 = primeraPalabra.toString().toCharArray();
        aux2 = p.toString().toCharArray();
        i = 0;
        j = primeraPalabra.longitud();
        esCierto = false;
        
        if((j+1) == p.longitud()){
            //Si la primera letra es igual lo unico que puede ser es que la letra añadida sea la de atras
            if(aux1[i] == aux2[i]){
                esCierto = true;
                //Comprobar que el resto de letras son iguales
                for(i=1; i<j && esCierto == true; i++){
                    if(aux1[i] != aux2[i]){esCierto = false;}
                }
            }else if(aux1[i] == aux2[i+1]){     //Si la primera letra es igual lo unico que puede ser es que la letra añadida sea la de delante
                esCierto = true;
                //Comprobar que el resto de letras son iguales
                for(i=0; i<j && esCierto == true; i++){
                    if(aux1[i] != aux2[i+1]){esCierto = false;}
                }
            }
        }
        
        return esCierto;
    }
    
    public palabra leerPalabra(){
        palabra aux = new palabra();
        saltarBlancos();
        while(frase[idx]!=' ' && frase[idx]!='.'){
            aux.addCharacter(frase[idx]);
            idx++;
        }
        return aux;
    }
    
    public void saltarBlancos(){
        while(frase[idx] == ' '){
            idx++;
        }
    }    
    
    public static void main(String[] args) {
        Gamificación5 p  = new Gamificación5();
        p.programa();
    }
    
}
