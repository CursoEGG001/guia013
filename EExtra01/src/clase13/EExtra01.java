/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase13;

import Entidad.Armadura;

/**
 *
 * @author pc
 */
public class EExtra01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Armadura armadura = new Armadura("Rojo", "Oro", 80, 100, 1000);

        armadura.mostrarEstado();
        for (int i = 0; i < 25; i++) {

            armadura.sintetizarObjeto("Guantes");
            armadura.escribirEnConsola("Inicio de servicio");
            armadura.usarGuantesComoArmas(1.3f);
            armadura.volar(60.5f);
            armadura.sintetizarObjeto("Botas");
            armadura.informarEstadoReactor();
            armadura.setDispositivoDanado(2, true);
            armadura.mostrarEstado();
            armadura.usarGuantesComoArmas((float) i);

        }
        armadura.mostrarEstado();
    }

}
