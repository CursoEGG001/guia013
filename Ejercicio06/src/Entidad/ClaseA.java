/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import Servicio.MioException;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class ClaseA {

    public void metodoA() {
        Scanner uno = new Scanner(System.in, "UTF-8");

        int[] dos = new int[6];
        try {

            dos[5] = uno.nextInt();
            throw new MioException("No hiciste nada sentencia_a4");

        } catch (MioException e) {
            System.out.println("No está :" + e.getMessage());
        }
        System.out.println("Sentencia_a6");
    }

}

