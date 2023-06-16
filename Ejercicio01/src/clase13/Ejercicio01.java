/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase13;

import Entidades.Persona;
import Servicio.PersonaServicio;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pc
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner opc = new Scanner(System.in, "UTF-8");

        PersonaServicio unaPersona = new PersonaServicio();
        Persona[] pacientes = new Persona[4];

        int CuantosIMC = 0;
        int CuantosIMCBajo = 0;
        int CuantosMayores = 0;

        for (int i = 0; i < pacientes.length; i++) {

                pacientes[i] = unaPersona.crearPersona();
                

            try {
                if (unaPersona.esMayorDeEdad(pacientes[i])) {
                    System.out.println("El paciente es mayor de edad");
                    CuantosMayores += 1;
                } else {
                    System.out.println("Paceinte menor de edad");
                }
            } catch (Exception e) {
                System.out.println( e.getMessage());
            }
     
                
                byte Exceso = unaPersona.calcularIMC(pacientes[i]);
                if (Exceso < 0) {
                    CuantosIMCBajo++;
                    System.out.println("Paciente de bajo peso");
                } else if (Exceso > 0) {
                    CuantosIMC++;
                    System.out.println("Paciente de alto peso");
                } else {
                    System.out.println("El Paciente tiene peso ideal");
                }
                System.out.println("Fin de paciente actual..");

        }

        System.out.println("Los Pacientes con bajo peso son : " + (CuantosIMCBajo * 100 / 4)
                + "%\nLos pacientes con alto peso :" + (CuantosIMC * 100 / 4)
                + "%\nLos Mayores de edad son " + CuantosMayores);

    }

}
