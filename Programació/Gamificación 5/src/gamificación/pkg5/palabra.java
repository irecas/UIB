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

public class palabra {
    private final char [] letras;
    private int longitud;
    private static final int MAX = 20;
    
    public palabra(){
        letras = new char [MAX];
        longitud = 0;
    }
    
    public void addCharacter(char c){
        letras[longitud] = c;
        longitud++;
    }
    
    public boolean palVacia(){
        return(longitud==0);
    }
    
    public boolean esCapicua(){
        boolean escapicua = true;
        char [] aux;
        aux = invertirPalabra();
        int idxAux;
        idxAux = longitud - 1;
        char s, p;
        
        for(int i = 0; (i<=idxAux) && escapicua ;i++, idxAux--){
            s = letras[i];
            p = aux[idxAux];
            escapicua = (s == p);
        }        
        return escapicua;
    }
    
    public char [] invertirPalabra(){
        char [] aux = new char [letras.length];
        int idx = 0;
        int i;
        
        for(i = (longitud - 1); i >= idx; i--, idx++){
            aux[idx] = letras[i];            
        }
        
        if(i==0){
            aux[idx] = letras[i];
        }else{
            aux[idx] = letras[i];
            idx++; i--;
            aux[idx] = letras[i];
        }
        return aux;
    }
    
    public palabra quitarVocales(){
        palabra aux = new palabra();
        boolean esVocal;
        
        for(int i = 0; i < letras.length; i++){
            esVocal = ((letras[i] == 'a') || (letras[i] == 'e') || (letras[i] == 'i') || (letras[i] == 'o') || (letras[i] == 'u') || (letras[i] == 'A') || (letras[i] == 'E') || (letras[i] == 'I') || (letras[i] == 'O') || (letras[i] == 'U'));
            if(!esVocal){
                aux.addCharacter(letras[i]);
            }
        }
        return aux;
    } 
    
    public int longitud(){
        return longitud;
    }
    
    public String toString(){
        String res = "";
        for (int i = 0; i<longitud; i++){
            res = res + letras[i];
        }
        return res;
    }
}
