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
public class LAB10 {
    private char [] frase;
    private int idx;
    
    public void main(){
        //Menú
        LT lector = new LT();
        char opc = ' ';
        
        while(opc != 's'){
            idx = 0;
            System.out.println();
            System.out.println("----------------------");
            System.out.println("Introduzca una frase");
            frase = lector.leerLinea().toCharArray();
            System.out.println();
            System.out.println("---------MENÚ---------");
            System.out.println("Opc 1: contar palabras");
            System.out.println("Opc 2: contar capicuas");
            System.out.println("Opc 3: quitar vocales");
            System.out.println("Opc s: salir");        
            System.out.println("----------------------");
            System.out.println("Introduzca una opción:");
            opc = lector.leerCaracter();
            switch(opc){
                case '1': contarPalabras(); break;
                case '2': contarCapicuas(); break;
                case '3': sinVocales(); break;
                case 's': System.out.println("Adiós"); break;
                default: System.out.println("Opción no válida");
            }
        }
    }
    
    public void contarPalabras(){
        int total = 0;
        palabra pal = leerPalabra();
        
        while(!pal.palVacia()){
            total++;
            System.out.println(pal + " esta en posición " + total);
            pal = leerPalabra();
        }
        System.out.println("El total de palabras es de " + total);
    }
    
    public void contarCapicuas(){
        int total = 0;
        boolean capicua;
        palabra pal = leerPalabra();
        
        while(!pal.palVacia()){
            capicua = pal.esCapicua();
            if(capicua){
                total++;
            }
            pal = leerPalabra();
        }
        System.out.println("El total de palabras capicuas es de " + total);
    }
    
    public void sinVocales(){
        palabra aux;
        palabra pal;
        pal = leerPalabra();
        while (!pal.palVacia()){
            aux = pal.quitarVocales();
            System.out.println(pal + " es " + aux);
            pal = leerPalabra();
        }
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
        LAB10 p = new LAB10();
        p.main();    
    }
} 
