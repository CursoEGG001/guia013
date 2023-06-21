/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Servicios;

/**
 *
 * @author pc
 */
public interface Consola {

    /**
     * Descarga en el casco una información requerida.
     */
    void mostrarEstado();

    /**
     *Muestra la información en el casco del estado de la batería
     */
    void informarEstadoBateria();

    /**
     *Elemento de la Consola que muestra el estado del reactor en el casco.
     */
    void informarEstadoReactor();
    
}
