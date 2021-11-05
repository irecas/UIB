package ejercicios;

/**
 * 
 * @author Pere Antoni
 * @subject Programació 1
 * @grade 1
 * @period 1
 *
 */
public class Ejercicios {

    //Programa
    private void programa() {
        System.out.println("Lista de ejercicios");
        System.out.println();
        System.out.println("Lab2:");
        System.out.println("[1] Declarar todos los tipos de variables primitivas");
        System.out.println("[2] Pasar de dolares($) a euros(€)");
        System.out.println("[3] Operaciones con enteros");
        System.out.println();
        System.out.println("Lab 3:");
        System.out.println("[1] Determinar si un numero es multiplo de 2");
        System.out.println("[2] Determinar si un numero es multiplo de otro");
        System.out.println("[3] Determinar si un alumno esta suspendido, aprobado o tiene matricula de honor");
        System.out.println("[4] Dada una letra mostrar la siguiente (ASCII)");
        System.out.println();
        System.out.println("Lab4:");
        System.out.println("[1] Ir sumando numeros que introduce el usuario");
        System.out.println("[2] Indicar al usuario si el numero que introduce es par o impar. Después muestra el numero de pares e impares introducidos");
        System.out.println("[3] Mostrar la tabla del numero introducido (este debe estar entre 1 y 10)");
        System.out.println("[4] Indicar todos los divisores de un numero");
        System.out.println("[5] Indicar si un numero es primo o no");
        System.out.println();
        System.out.println("Lab5:");
        System.out.println("[1] Leer una sequencia char que acaba con '.' e imprime la letra con el numero ASCII + grande");
        System.out.println("[2] Contar el numero de 'a' introducidas en una sequencia de char");
        System.out.println("[3] Encontrar la primera vocal introducida en una sequencia de char");
        System.out.println("[4] Contar los espacios en blanco a partir de la primera 't' que introduzca el usuario");
        System.out.println();
        System.out.println("Lab6:");
        System.out.println("[1] Leer dos numeros y devolver el mas grande");
        System.out.println("[2] Leer tres numeros y devolver el mas grande");
        System.out.println("[2] Leer una sequencia de palabras e indicar la posicion en la que aparece por primera vez cada vocal");
        System.out.println();

        LT lector = new LT();
        int lab;
        int ej;

        System.out.println("Introduce el numero de Lab al que pertenece el ejercicio que desea ejecutar");
        lab = lector.leerEntero();
        System.out.println("Ahora introduce el numero del ejercicio a ejecutar");
        ej = lector.leerEntero();

        switch (lab) {                                                                                          //Detecta de que lab es el ejercicio que se quiere ejecutar
            case 1:
                System.out.println("--------------------------------------------------------");
                System.out.println("El primer dia de laboratorio no se hizo ningún ejercicio");
                System.out.println("--------------------------------------------------------");
                break;
            case 2:                                                                                             //Ejercicios del lab 2
                switch (ej) {                                                                                   //Detecta que ejercicio se quiere ejecutar
                    case 1:
                        System.out.println("------------");
                        System.out.println("Lab " + lab + ", ej " + ej);
                        System.out.println("------------");
                        ej2_1();
                        break;
                    case 2:
                        System.out.println("------------");
                        System.out.println("Lab " + lab + ", ej " + ej);
                        System.out.println("------------");
                        ej2_2();
                        break;
                    case 3:
                        System.out.println("------------");
                        System.out.println("Lab " + lab + ", ej " + ej);
                        System.out.println("------------");
                        ej2_3();
                        break;
                    default:                                                                                    //Si el numero de lab aun no existe le indica al usuario su error
                        System.out.println("------------------------------");
                        System.out.println("No existe ningun ej " + ej + " en lab " + lab);
                        System.out.println("------------------------------");
                }
                break;
            case 3:                                                                                             //Ejercicios del lab 3
                switch (ej) {                                                                                   //Detecta que ejercicio se quiere ejecutar
                    case 1:
                        System.out.println("------------");
                        System.out.println("Lab " + lab + ", ej " + ej);
                        System.out.println("------------");
                        ej3_1();
                        break;
                    case 2:
                        System.out.println("------------");
                        System.out.println("Lab " + lab + ", ej " + ej);
                        System.out.println("------------");
                        ej3_2();
                        break;
                    case 3:
                        System.out.println("------------");
                        System.out.println("Lab " + lab + ", ej " + ej);
                        System.out.println("------------");
                        ej3_3();
                        break;
                    case 4:
                        System.out.println("------------");
                        System.out.println("Lab " + lab + ", ej " + ej);
                        System.out.println("------------");
                        ej3_4();
                        break;
                    default:                                                                                    //Si el numero de lab aun no existe le indica al usuario su error
                        System.out.println("------------------------------");
                        System.out.println("No existe ningun ej " + ej + " en lab " + lab);
                        System.out.println("------------------------------");
                }
                break;
            case 4:                                                                                             //Ejercicios del lab 4
                switch (ej) {                                                                                   //Detecta que ejercicio se quiere ejecutar
                    case 1:
                        System.out.println("------------");
                        System.out.println("Lab " + lab + ", ej " + ej);
                        System.out.println("------------");
                        ej4_1();
                        break;
                    case 2:
                        System.out.println("------------");
                        System.out.println("Lab " + lab + ", ej " + ej);
                        System.out.println("------------");
                        ej4_2();
                        break;
                    case 3:
                        System.out.println("------------");
                        System.out.println("Lab " + lab + ", ej " + ej);
                        System.out.println("------------");
                        ej4_3();
                        break;
                    case 4:
                        System.out.println("------------");
                        System.out.println("Lab " + lab + ", ej " + ej);
                        System.out.println("------------");
                        ej4_4();
                        break;
                    case 5:
                        System.out.println("------------");
                        System.out.println("Lab " + lab + ", ej " + ej);
                        System.out.println("------------");
                        ej4_5();
                        break;
                    default:                                                                                        //Si el numero de lab aun no existe le indica al usuario su error
                        System.out.println("------------------------------");
                        System.out.println("No existe ningun ej " + ej + " en lab " + lab);
                        System.out.println("------------------------------");
                }
                break;
            case 5:                                                                                                 //Ejercicios del lab 5
                switch (ej) {                                                                                       //Detecta que ejercicio se quiere ejecutar
                    case 1:
                        System.out.println("------------");
                        System.out.println("Lab " + lab + ", ej " + ej);
                        System.out.println("------------");
                        ej5_1();
                        break;
                    case 2:
                        System.out.println("------------");
                        System.out.println("Lab " + lab + ", ej " + ej);
                        System.out.println("------------");
                        ej5_2();
                        break;
                    case 3:
                        System.out.println("------------");
                        System.out.println("Lab " + lab + ", ej " + ej);
                        System.out.println("------------");
                        ej5_3();
                        break;
                    case 4:
                        System.out.println("------------");
                        System.out.println("Lab " + lab + ", ej " + ej);
                        System.out.println("------------");
                        ej5_4();
                        break;
                    default:                                                                                        //Si el numero de lab aun no existe le indica al usuario su error
                        System.out.println("------------------------------");
                        System.out.println("No existe ningun ej " + ej + " en lab " + lab);
                        System.out.println("------------------------------");
                }
                break;
            case 6:                                                                                             //Ejercicios del lab 2
                switch (ej) {                                                                                   //Detecta que ejercicio se quiere ejecutar
                    case 1:
                        System.out.println("------------");
                        System.out.println("Lab " + lab + ", ej " + ej);
                        System.out.println("------------");
                        ej6_1();
                        break;
                    case 2:
                        System.out.println("------------");
                        System.out.println("Lab " + lab + ", ej " + ej);
                        System.out.println("------------");
                        ej6_2();
                        break;
                    case 3:
                        System.out.println("------------");
                        System.out.println("Lab " + lab + ", ej " + ej);
                        System.out.println("------------");
                        ej6_3();
                        break;
                    default:                                                                                    //Si el numero de lab aun no existe le indica al usuario su error
                        System.out.println("------------------------------");
                        System.out.println("No existe ningun ej " + ej + " en lab " + lab);
                        System.out.println("------------------------------");
                }
                break;
        }
    }

    //Lab 2
    private void ej2_1() {
        //Proyecto 1 Lab1
        char grupo = 'B';                       //Variable caracter
        System.out.println("var char " + grupo);
        int contador = 45;                      //Variable entera
        System.out.println("var int " + contador);
        double resultado = 22.5;                //Variable real
        System.out.println("var double " + resultado);
        float resultadoF = 22.5f;               //Variable float (importante poner "f")
        System.out.println("var float " + resultadoF);
        boolean estaAbierto = false;            //Variable boolean
        System.out.println("var boolean " + estaAbierto);
        String asignatura = "Programacion 1";   //Variable string
        System.out.println("var string " + asignatura);
    }

    private void ej2_2() {
        //Operadores
        double euros = 427;
        double dolares;

        dolares = euros * 1.17;                 //convierte dolares a euros
        System.out.println(euros + "€ són " + dolares + ("$"));
    }

    private void ej2_3() {
        //Operaciones con enteros
        int num1 = 5;
        int num2 = 2;
        double res = (double) num1 / num2;         //(double) sirve para que num1 actue como un double y no perder info
        System.out.println("El resultado de 2/5 = " + res);
        System.out.println("El quociente de la division es " + num1 % num2);        //Sirve para no guardar el resultado en ninguna variable
    }

    //Lab3
    private void ej3_1() {
        //Determinar si un numero es multiplo de 2
        System.out.println("Introduce un numero entero");
        LT lector = new LT();
        int num = lector.leerEntero();

        if (num % 2 == 0) {                                    //(%) Hace la division del numero entre dos y determina el quociente
            System.out.println(num + "es multiplo de 2");
        } else {
            System.out.println(num + "no es multiplo de 2");
        }
    }

    private void ej3_2() {
        //Determinar si un numero es multiplo de otro
        System.out.println("Introduce un numero entero");
        LT lector = new LT();
        int num1 = lector.leerEntero();
        System.out.println("Introduce otro numero entero");
        int num2 = lector.leerEntero();

        if (num1 % num2 == 0) {
            System.out.println(num1 + " es multiplo de " + num2);
        } else {
            System.out.println(num1 + " no es multiplo de " + num2);
        }
    }

    private void ej3_3() {
        //Determinar si un alumno esta suspendido, aprobado o tiene matricula de honor
        System.out.println("Introduce la nota");
        LT lector = new LT();
        double nota = lector.leerReal();

        if (nota >= 0.0 && nota <= 4.99) {
            System.out.println("Suspendido");
        } else if (nota >= 4.99 && nota < 9) {
            System.out.println("Aprobado");
        } else if (nota <= 9 && nota <= 10) {
            System.out.println("Matricula de honor");
        }
    }

    private void ej3_4() {
        //Dada una letra mostrar la siguiente (ASCII)
        LT lector = new LT();
        System.out.println("Introduce una letra:");
        char lletra1 = lector.leerCaracter();
        int numL1 = lletra1;
        int numL2 = numL1 + 1;
        char lletra2 = (char) numL2;
        System.out.println("La siguiente letra es " + lletra2);
    }

    //Lab4
    private void ej4_1() {
        //Ir sumando numeros que introduce el usuario
        System.out.println("introduce un número");
        LT lector = new LT();
        int num = lector.leerEntero();
        int suma = 0;

        while (num != 0) {
            suma += num;
            System.out.println("introduce un número");
            num = lector.leerEntero();
        }
        System.out.println("El total es " + suma);
    }

    private void ej4_2() {
        //Indicar al usuario si el numero que introduce es par o impar, si introduce un 0 el programa finaliza. Después muestra el numero de pares e impares introducidos
        LT lector = new LT();
        int num = 1;
        int par = 0;
        int impar = 0;

        while (num != 0) {                                                        //determina si el numero no es 0 (si lo fuera se detendria el progr)          
            System.out.println("Introduce un número");
            num = lector.leerEntero();
            if (num % 2 == 0) {                                                    //los pares entre dos dan quociente 0
                par++;                                                          //suma 1 al contador de pares
                System.out.println("El número " + num + " es par");
            } else {
                impar++;                                                        //suma 1 al contador de impares
                System.out.println("El número " + num + " es impar");
            }
        }

        System.out.println("El numero de pares introducido es " + par);
        System.out.println("El numero de impares introducido es " + impar);
    }

    private void ej4_3() {
        //Mostrar la tabla del numero introducido (este debe estar entre 1 y 10)
        System.out.println("Introduce un numero del 1 al 10:");
        LT lector = new LT();
        int num = lector.leerEntero();
        int res;

        if (num <= 0 || num >= 11) {                                                  //Si el usario introduce un numero diferenta a (1, 10) le dice que no esta bien
            System.out.println("El numero introducido debe ser del 1 al 10");
        } else {
            System.out.println("La tabla del " + num);
            for (int i = 0; i <= 10; i++) {                                           //la i multiplica al num desde 0 hasta 10
                res = num * i;                                                      //asigna el valor de la multiplicación a la var resultado
                System.out.println(num + "x" + i + " = " + res);                //imprime AxB = C
            }
        }
    }

    private void ej4_4() {
        //Indicar todos los divisores de un numero
        System.out.println("introduce un numero:");
        LT lector = new LT();
        int num = lector.leerEntero();

        System.out.println("Los divisores de " + num + " són:");
        for (int i = 1; i <= num; i++) {                                             //Va dividiendo el numero entre i (i va desde 1 hasta el num introducido)
            if (num % i == 0) {                                                     //Si el quociente de la división es 0 imprime el numero ya que es divisor
                System.out.println(i);
            }
        }
    }

    private void ej4_5() {
        //Indicar si un numero es primo o no
        System.out.println("introduce un numero:");
        LT lector = new LT();
        int num = lector.leerEntero();
        int divisores = 0;

        for (int i = 1; i <= num; i++) {                           //Busca los divisores del num desde 1 hasta el mismo num a menos que encuentre mas de dos divisores
            if (num % i == 0) {                                                     //Cuando encuentra un divisor suma 1 a la var divisores
                divisores++;
            }
        }
        if (divisores == 2) {                                                       //Si var divisores = 2 el numero es primo ya que un primo solo se puede dividir entre 1 y el mismo
            System.out.println("El número " + num + " es primo");
        } else {
            System.out.println("El número " + num + " no es primo");
        }
    }

    //Lab 5
    private void ej5_1() {
        //Leer sequencia char que acaba con '.' e imprime la letra con el numero ASCII + grande
        LT lector = new LT();
        char l1;                            //la letra que introduce el usr
        char lg;                            //la letra + grande
        int letra1 = Integer.MIN_VALUE;     //num ASCII + grande
        int letra2;                         //num ASCII var l1

        System.out.println("Este programa lee una sequencia de char que acaba con '.' e imprime la letra con el numero ASCII + grande y se detiene cuando se introduce un '.'");
        System.out.println("Porfavor introduzca una letra");
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
        if (letra1 != Integer.MIN_VALUE) {                //comprueba que se haya introducido algún caracter
            System.out.println("La letra mas grande según la tabla ASCII es: " + lg);
        } else {
            System.out.println("No se ha introducido ningun caracter");
        }
    }

    private void ej5_2() {
        //Contar el numero de 'a'
        LT lector = new LT();
        char letraA;
        int numA = 0;
        System.out.println("Este programa cuenta el numero de 'a' y 'A' introducidas y se detiene cuando se introduce un '.'");
        System.out.println("Porfavor introduzca una letra");
        letraA = lector.leerCaracter();

        while (letraA != '.') {                               //Siempre que letraA no sea un punto hacer lo de dentro del bucle
            if (letraA == 'a' || letraA == 'A') {             //Si el usuario ha introducido 'a' o 'A' aumentar el contador de aes
                numA++;
            }
            letraA = lector.leerCaracter();                 //leer otro caracter
        }
        System.out.println("El numero total de 'a' introducidas es " + numA);
    }

    private void ej5_3() {
        //Encontrar la primera vocal introducida
        LT lector = new LT();
        char c;

        System.out.println("Este programa busca la primera vocal minúscula introducida");
        System.out.println("Introduce un caracter");
        c = lector.leerCaracter();

        while ((c != '.') && !(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')) {
            c = lector.leerCaracter();
        }
        if (c == '.') {
            System.out.println("No se ha inroducido ninguna vocal minúscula");
        } else {
            System.out.println("La vocal es: " + c);
        }
    }

    private void ej5_4() {
        //Contar los espacios en blanco a partir de la primera t
        LT lector = new LT();
        char c;                     //Variable donde se almacena la letra
        int espacios = 0;           //Numero de espacios despues de t
        boolean sit = false;

        System.out.println("Este programa cuenta los espacios en blanco a partir de la primera t");
        System.out.println("Introduce una letra");
        c = lector.leerCaracter();                      //Lee el primer caracter

        while (c != '.') {                              //Entra al bucle siempre que c no sea un punto
            if (c == 't' || c == 'T') {                      //cuando el usuario introduce una t se cambia el valor de sit a true
                sit = true;
            }
            c = lector.leerCaracter();                  //Lee otro caracter
            while (sit && c != '.') {                       //si el usuario introduce una t entra al bucle ya que sit sera true
                if (c == ' ') {                             //si se intropduce un espacio se suma 1 al contador de espacios y se lee orto caracter
                    espacios++;
                    c = lector.leerCaracter();
                } else {                                   //si no se introduce espacio se pregunta por otro caracter
                    c = lector.leerCaracter();
                }
            }
        }
    }

    //Lab 6
    private void ej6_1() {
        System.out.println("Este programa devuelve el numerro mas grande de los dos introducidos por el usuario");
        LT lector = new LT();
        System.out.println("Introduce tres números");
        int x = lector.leerEntero();
        int y = lector.leerEntero();
        int g = sub6_1(x, y);
        System.out.println("El numero mas grande de los dos es " + g);
    }

    private void ej6_2() {
        System.out.println("Este programa devuelve el numerro mas grande de los tres introducidos por el usuario");
        LT lector = new LT();
        System.out.println("Introduce tres números");
        int x = lector.leerEntero();
        int y = lector.leerEntero();
        int z = lector.leerEntero();
        int g = sub6_2(x, y, z);
        System.out.println("El numero mas grande de los tres es " + g);
    }

    private void ej6_3() {
        LT lector = new LT();
        char letra = 'c';
        int posición = 0;
        int pa = 0, pe = 0, pi = 0, po = 0, pu = 0;

        System.out.println("Este programa indica la posición en la que aparece por primera vez cada vocal");
        System.out.println("Porfavor introduce la palabra letea por letra");

        while ((pa == 0 || pe == 0 || pi == 0 || po == 0 || pu == 0) && (letra != '.')) {
            posición++;
            letra = lector.leerCaracter();
            if (letra == 'a') {
                if (pa == 0) {
                    pa = posición;
                }
            }
            if (letra == 'e') {
                if (pe == 0) {
                    pe = posición;
                }
            }
            if (letra == 'i') {
                if (pi == 0) {
                    pi = posición;
                }
            }
            if (letra == 'o') {
                if (po == 0) {
                    po = posición;
                }
            }
            if (letra == 'u') {
                if (pu == 0) {
                    pu = posición;
                }
            }

        }
        //posición a
        if (pa != 0) {
            System.out.println("La primera a sen encuentra en la posición " + pa);
        } else {
            System.out.println("No aparece ninguna a");
        }
        //posición e
        if (pe != 0) {
            System.out.println("La primera e sen encuentra en la posición " + pe);
        } else {
            System.out.println("No aparece ninguna e");
        }//posición i
        if (pi != 0) {
            System.out.println("La primera i sen encuentra en la posición " + pi);
        } else {
            System.out.println("No aparece ninguna i");
        }
        //posición o
        if (po != 0) {
            System.out.println("La primera o sen encuentra en la posición " + po);
        } else {
            System.out.println("No aparece ninguna o");
        }
        //posición u
        if (pu != 0) {
            System.out.println("La primera u sen encuentra en la posición " + pu);
        } else {
            System.out.println("No aparece ninguna u");
        }
    }

    //Subfunciones Lab6
    private int sub6_1(int i, int j) {
        if (i > j) {
            return i;
        } else {
            return j;
        }
    }

    private int sub6_2(int i, int j, int k) {
        int m = i;
        if (j > m) {
            m = j;
        }
        if (k > m) {
            m = k;
        }
        return m;
    }

    public static void main(String[] args) {
        Ejercicios e = new Ejercicios();
        e.programa();
    }
}
