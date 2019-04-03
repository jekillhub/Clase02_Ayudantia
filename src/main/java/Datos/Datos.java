package Datos;

import java.util.ArrayList;

public class Datos {

    public int[] resultados1;
    public String[] resultados2;
    public char[] resultados3;
    public int[] resultados4;

    public ArrayList<String> palabras2;
    public String[] palabras3;
    public String[] numeros4;

    public Datos(){
        this.resultados1 = new int[3];
        this.resultados2 = new String[3];
        this.resultados3 = new char[3];
        this.resultados4 = new int[3];

        this.palabras2 = new ArrayList<String>();
        this.palabras3 = new String[3];
        this.numeros4 = new String[3];

        llenado();
    }

    private void llenado(){
        //Datos Ejercicio 1
            resultados1[0] = 3;  //division de 18 entre 6
            resultados1[1] = -1;  //division de 20 entre 0
            resultados1[2] = 4;  //division de 4 entre 1
            //-1 representa error.

            resultados2[0] = "NULL"; //posicion -1
            resultados2[1] = "adidas"; //posicion 1
            resultados2[2] = "NULL"; //posicion 3

        //Datos Ejercicio 2
            palabras2.add("jordan");
            palabras2.add("adidas");
            palabras2.add("puma");

        //Datos Ejercicio 3
            resultados3[0] = 'c'; //palabra: calabasas, posicion: 0
            resultados3[1] = 'z'; //palabra: arroz, posicion: 4
            resultados3[2] = 'E'; //palabra: arrollo, posicion: 7
            //E representa empty.

            palabras3[0] = "calabasas";
            palabras3[1] = "arroz";
            palabras3[2] = "arrollo";

        //Datos Ejercicio 4
            resultados4[0] = 800;
            resultados4[1] = -1;
            resultados4[2] = 350;
            //-1 representa error.

            numeros4[0] = "800";
            numeros4[1] = "O";
            numeros4[2] = "350";
    }
}
