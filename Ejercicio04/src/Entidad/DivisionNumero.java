/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author pc
 */
public class DivisionNumero {
    
    public int numA;
    public int numB;

    public DivisionNumero() {
    }

    public static int hacer(int numA, int numB) throws Exception {
        
        if (numB==0) {
            throw new ArithmeticException("Intenta dividir por cero");
        } else {
            
        }
        
        return numA / numB;
    }
}
