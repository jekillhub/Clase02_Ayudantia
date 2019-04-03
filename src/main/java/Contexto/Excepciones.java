package Contexto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Excepciones {

    /**
     * Función que divide dos números enteros.
     * @param num1 divisor.
     * @param num2 dividendo.
     * @return cociente.
     * */
    public static int divison(int num1, int num2){
        return num1/num2;
    }

    /**
     * Entrega la palabra almacenada en la posicion indicada del ArrayList.
     * @param palabras ArrayList que contiene palabras.
     * @param posicion posición de la palabra a retornar.
     * @return palabra almacenada en la posición indicada.
     * */
    public static String getPosicion(ArrayList<String>palabras, int posicion){
        return palabras.get(posicion);
    }

    /**
     * Entrega el caracter almacenado en la posicion indicada del String.
     * @param palabra  palabra de la cual se retornará un determinado caracter.
     * @param posicion posición del caracter a retornar.
     * @return caracter almacenado en la posición indicada.
     * */
    public static char getChar(String palabra, int posicion){
        return palabra.charAt(posicion);
    }

    /**
     * Convierte un String en Integer.
     * @param numero numero en formato String.
     * @return numero en formato Integer.
     * */
    public static Integer convertirStringInt(String numero){
        return Integer.parseInt(numero);
    }

}
