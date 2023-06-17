/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import Servicio.MioException;

/**
 *
 * @author pc
 */
public class ClaseB {
    public void metodoB(){
        int uno=4;
        
        try {
            throw new MioException("Lo inicia aquí");
        } catch (MioException mioException) {
            System.out.println("Estemmm..." + mioException.getMessage());
        } finally {
            System.out.println("Sigamos? "+uno);
        }
    
}
}
