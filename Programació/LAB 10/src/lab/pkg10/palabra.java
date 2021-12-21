/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg10;

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
        
        for(longitud = 0; longitud < letras.length; longitud++){
            esVocal = ((letras[longitud] == 'a') || (letras[longitud] == 'e') || (letras[longitud] == 'i') || (letras[longitud] == 'o') || (letras[longitud] == 'u') || (letras[longitud] == 'A') || (letras[longitud] == 'E') || (letras[longitud] == 'I') || (letras[longitud] == 'O') || (letras[longitud] == 'U'));
            if(!esVocal){
                aux.addCharacter(letras[longitud]);
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
