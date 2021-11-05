/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamificación.pkg2;

/**
 *
 * @author Pere Antoni
 * @subject Programació 1
 * @grade 1
 * @period 1
 *
 */
public class Gamificación2 {

    LT lector = new LT();
    char c;
    int n;
    String original_string = "";    //Esta sera la sequencia de caracteres introducida sin sustituir los numeros
    String replaced_string = "";    //Esta sera la sequencia de caracteres con los numeros sustituidos

    private void programa() {
        initial_message();          //Enseña el mensage inicial
        
        while (c != '.') {                          //Si "C" es un punto se termina el programa
            c = lector.leerCaracter();
            if (c >= 'a' && c <= 'z') {             //Comprueba que el cartacter inrtoducido sea una minuscula
                add_original_letter(c);             //Se añade el caracter a la sequencia original_string
                add_replaced_letter(c);             //Se añade el caracter a lal sequencia replaced_string
            } else if (c >= 48 && c <= 57) {        //Comprueba si el caracter es un número
                add_original_letter(c);             //Se añade el caracter a la sequencia original_string
                assign_num(c);                      //Se hace el cambio del numero en el string al mismo numero en una int ej:(c = '9' --> n = 9)
                c = change_letter(c);               //Se cambia el numero por la letra correspondiente
                add_replaced_letter(c);             //Se añade el caracter a lal sequencia replaced_string
            } else if (c != '.') {                  //Si el caracter no es ni una minuscula ni un numero se indica al usuario su error
                System.out.println("El caracter introducido no es correcto");
                System.out.println("Introduzca otro caracter");
            }
        }
        //Se imprime la sequencia original y la que tiene los numeros transformados
        System.out.println("-----------------------------");
        System.out.println("La sequencia dada és:          " + original_string);
        System.out.println("La sequencia transformada es:  " + replaced_string);
        System.out.println("-----------------------------");
    }
    
    private char change_letter(char l) {
        int temp = 97 + n;      //se suma el numero introducido por el usuario a la letra 'a'
        l = (char) temp;        //se cambia el valor ASII obtenido a su letra asignada en la tabla
        return l;
    }
    
    private void assign_num(char l) {       
        /*Ya que el numero 0 tiene asignado el valor ASCII 48 se resta este al valor ASCII del numero inrtoducido por el usuario para
        asignarlo a la variable n*/ 
        n = (int) l - 48;
    }
    
    private void add_original_letter(char l) {
        //Se añade el caracter introducido por el usuario a la sequencia original
        original_string += l;
    }

    private void add_replaced_letter(char l) {
        //Se añade el numero ya transformado a caracter a la sequencia transformada
        replaced_string += l;
    }
    
    private void initial_message(){
        //Mensage inicial mostrado al usuario
        System.out.println("Este programa lee una sequencia de caracteres "
                + "acabada en punto y, formada por letras "
                + "minúsculas y dígitos numéricos (del 0 al 9)");
        System.out.println("y da como resultado la misma frase pero que "
                + "substituya cada dígito por su letra minúscula "
                + "correspondiente");
        System.out.println();
        System.out.println("Porfavor, vaya introduciendo los caracteres de uno en uno");

    }

    public static void main(String[] args) {
        Gamificación2 g = new Gamificación2();
        g.programa();
    }
}
