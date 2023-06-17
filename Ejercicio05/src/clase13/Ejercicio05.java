/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase13;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Ejercicio05 {

    /**
     * Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora debe generar un número
     * aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para ello, cada vez que el usuario introduce un
     * valor, la computadora debe decirle al usuario si el número que tiene que adivinar es mayor o menor que el que ha
     * introducido el usuario. Cuando consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el
     * usuario ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe controlar esa
     * excepción e indicarlo por pantalla. En este último caso también se debe contar el carácter fallido como un intento.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int numAleatorio = (int) (Math.random() * 500) + 1;
        int intento = 0;
        int adivina = 0;
        Scanner leer = new Scanner(System.in);

        do {
            boolean bandera = true;

            while (bandera) {                
                System.out.print("Ingresa un intento: ");
                
                try {
                    adivina = leer.nextInt();
                    bandera = true;
                    intento++;
                } catch (Exception e) {
                    System.out.println("No es válida");
                    leer.next();
                    bandera = false;
                    intento++;
                }
                
                if (adivina == numAleatorio) {
                    System.out.println("Congratulations! Adivinaste en " + intento + " intentos.");
                    break;
                } else if (adivina < numAleatorio) {
                    System.out.println("Tu intento está por debajo.");
                } else {
                    System.out.println("Tu intento está por encima.");
                }
            }

        } while (true);

    }
}
