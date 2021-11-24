package LAB2;

/**
 *
 * @author Pere Antoni
 */
public class LAB2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        //Declaracipnes de variables
        char grupo = 'B';                       //Variable caracter
        System.out.println(grupo);
        int contador = 45;                      //Variable entera
        System.out.println(contador);
        double resultado = 22.5;                //Variable real
        System.out.println(resultado);
        float resultadoF = 22.5f;               //Variable float (importante poner "f")
        System.out.println(resultadoF);
        boolean estaAbierto = false;            //Variable boolean
        System.out.println(estaAbierto);
        String asignatura = "Programacion 1";   //Variable string
        System.out.println(asignatura);
        
        final double PI = 3.14;                 //EL final sirve para que la varaible sea invarible
        System.out.println(PI);
        
        //Que se le puede asignar a cada variable
        int a, b;
        a = 25;      //valor literal
        b = 8;       //Valor literal
                System.out.println("a="+a);
                System.out.println("b="+b);
                
        a = b;       //otra variable
                System.out.println("a="+a);
                
        a = 3+8;     //expresión
                System.out.println("a="+a);
                
        a= a+b;      //expresión
                System.out.println("a="+a);
        
        
        
        //Operadores
        double euros = 427;
        double dolares;
        
        dolares = euros * 1.17;                 //convierte dolares a euros
        System.out.println(euros + "€ són " + dolares + ("$"));
        
        int num1 = 5;
        int num2 = 2;
        double res = (double)num1/num2;         //(double) sirve para que num1 actue como un double y no perder info
        System.out.println(res);
        System.out.println(num1 % num2);        //Sirve para no guardar el resultado en ninguna variable
        
        
        //Logicos
        boolean verd = true;
        boolean falso = false;
        System.out.println("AND");
        System.out.println(verd && verd);
        System.out.println(verd && falso);
        System.out.println(falso && falso);
        System.out.println(falso && verd);
        System.out.println("OR");
        System.out.println(verd || verd);
        System.out.println(verd || falso);
        System.out.println(falso || falso);
        System.out.println(falso || verd);
        System.out.println("NOT");
        System.out.println(!verd);
        System.out.println(!falso);
        */
        
        //Prueba
        LT lector = new LT();
        int i;
        char c;
        
        c = lector.leerCaracter();
         i = (int) c - 48;
         System.out.println(i);
        
    }
    
}
