/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase13;

import Entidad.DivisionNumero;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "UTF-8").useDelimiter("\n");

        int primerNum;
        int segundoNum;

        System.out.println("Ingrese 2 numeros :");
        primerNum = leer.nextInt();
        segundoNum = leer.nextInt();
        System.out.println(DivisionNumero.hacer(primerNum, segundoNum));

    }

}
