/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidades.Persona;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class PersonaServicio {

    Scanner leer = new Scanner(System.in, "UTF-8").useDelimiter("\n");

    public Persona crearPersona() {

        Persona persona = new Persona();
        String nombrecito;
        int Anios;
        double pesa;
        double mide;
        char sx;
        System.out.println("Por favor Introduzca un Nombre para la Persona:");
        nombrecito = leer.next();
        System.out.println("Introduzca la edad:");
        Anios = leer.nextInt();
        System.out.println("Ingrese el Peso:");
        pesa = leer.nextDouble();
        System.out.println("Ingrese su Altura: ");
        mide = leer.nextDouble();

        do {
            System.out.println("Indique el sexo (H, M o O): ");
            sx = leer.next().charAt(0);
            sx = Character.toUpperCase(sx);
        } while (!(sx == 'H' || sx == 'M' || sx == 'O'));

        persona.setNombre(nombrecito);
        persona.setEdad(Anios);
        persona.setAltura(mide);
        persona.setPeso(pesa);
        persona.setSexo(sx);
        return persona;
    }

    /**
     *
     * @param persona1 hace que la persona no sea válida
     * @return verdadero para mayor de edad y falso para lo otro
     * @throws java.lang.Exception por la edad en caso irreal.
     * 
     */
    public boolean esMayorDeEdad(Persona persona1) throws Exception {

        if (persona1.getEdad() < 1) {
                        throw new Exception("La edad es inválida");
        } else {

        }
        return persona1.getEdad() >= 18;
    }

    public byte calcularIMC(Persona persona2) {

        double formula = persona2.getPeso() / Math.pow(persona2.getAltura(), 2);
        if (formula < 20) {
            return -1;
        } else if (formula >= 20 && formula <= 25) {
            return 0;
        } else {
            return 1;
        }
    }

}
