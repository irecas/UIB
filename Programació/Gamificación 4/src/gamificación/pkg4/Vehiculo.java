/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamificación.pkg4;

/**
 *
 * @author Pere Antoni
 */
public class Vehiculo {

    private double deposito;
    private char[] matricula = new char[7];
    private final int consumo = 8;

    //Constructor
    public Vehiculo(String mat) {
        deposito = 0;                   //Deja el deposito vacio
        matricula = mat.toCharArray();  //Define la matricula
    }

    public void repostar(double litros) {
        deposito += litros;     //se suman los litros a repostar a los litros actuales
    }

    public double viaja(int dist) {
        double consumido = (dist * consumo) / 100;        //se calculan los litros que se han consumido

        if (consumido <= deposito) {            //Si se dispone de suficiente combustible
            deposito -= consumido;              //se resta el combustible usado al deposito
            return consumido;
        } else {
            return 0;           //Si no se dispone de suficiente combustible no se realiza el viaje
        }
    }

    public double estimacionDistancia() {
        double estimacion = (deposito * 100) / consumo;   //Se calcula la distancia estimada
        return estimacion;
    }

    public String toString() {
        String mat = "";

        for (int i = 0; i <= 6; i++) {
            mat += matricula[i];
        }

        return "La matricula del vehiculo es " + mat + " y el vehiculo tiene " + deposito + "L";
    }

    public boolean equals(char[] mat) {
        boolean iguales = true;

        for (int i = 0; i <= 6 && iguales; i++) {      //se comprueba si las matriculas son iguales
            if (matricula[i] != mat[i]) {
                iguales = false;
            }
        }

        //Se retorna si son iguales o no
        return iguales;
    }

    public char[] matricula() {
        return matricula;       //se retorna la matricula del vehiculo
    }
}
