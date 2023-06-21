/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase13;

import Entidad.Armadura;
import Servicios.Radar;

/**
 *
 * @author pc
 */
public class EExtra01 {

    /**
     * 
     * Simulación de Destrucción de enemigos en combate
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Armadura MarkV = new Armadura("Rojo", "Oro", 80, 100, 1000);
        Radar activo = new Radar();
        
        activo.cargarRadar();
        MarkV.mostrarEstado();
        for (int i = 0; i < 25; i++) {
            
            activo.destruyeEnemigo();

            MarkV.sintetizarObjeto("Guantes");
            MarkV.escribirEnConsola("Inicio de servicio");
            MarkV.usarGuantesComoArmas(1.3f);
            MarkV.volar(60.5f);
            MarkV.sintetizarObjeto("Botas");
            MarkV.informarEstadoReactor();
            MarkV.setDispositivoDanado(2, true);
            MarkV.mostrarEstado();
            MarkV.usarGuantesComoArmas((float) i);

        }
        MarkV.mostrarEstado();
    }

}
