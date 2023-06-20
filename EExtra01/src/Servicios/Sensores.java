/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

/**
 *
 * @author pc
 */
public class Sensores {
    
    public Sensores() {
    }

    protected float obtenerConsumoBotas(float tiempo) {
        return tiempo * 0.5f;
    }

    protected float obtenerConsumoGuantes(float tiempo) {
        return tiempo * 1.0f;
    }

    protected float obtenerConsumoConsola() {
        return 2.0f;
    }

    protected float obtenerConsumoSintetizador() {
        return 5.0f;
    }
    
}
