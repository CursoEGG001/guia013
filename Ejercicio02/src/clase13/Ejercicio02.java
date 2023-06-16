/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase13;

/**
 *
 * @author pc
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String[] nula = new String[5];
        
        try {
            nula[5] = "nada";
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Indice Incorrecto: "+e.getMessage());
        }
    }
    
}
