/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase13;

import Entidad.DivisionNumero;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pc
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in,"UTF-8").useDelimiter("\n");
        
        int primerNum;
        int segundoNum;
        
        try {
            System.out.println("Ingrese 2 numeros :");
            primerNum = leer.nextInt();
            segundoNum = leer.nextInt();
            System.out.println(DivisionNumero.hacer(primerNum, segundoNum));
        } catch (ArithmeticException e) {
            System.out.println("Operación incorrecta! "+e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Datos incorrectos: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida: " + e.getMessage());
        } catch (Exception ex) {
            Logger.getLogger(Ejercicio04.class.getName()).log(Level.SEVERE, "Algo no corresponde", ex);
        }
    }

}
