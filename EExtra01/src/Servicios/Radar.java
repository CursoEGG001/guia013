/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidad.Enemigo;
import Entidad.Objetivo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pc
 */
public class Radar {

    private List<Objetivo> radar;

    /**
     * Inicializa los objetivos en el radar.
     */
    public void cargarRadar() {
        radar = new ArrayList<>();
        Enemigo enemigos = new Enemigo();
        for (int i = 0; i < ((int) Math.random() * 100 + 10); i++) {
            enemigos = new Enemigo();
            int[] ubicacion = {(int) (Math.random() * 1000), (int) (Math.random() * 1000), (int) (Math.random() * 1000)};
            enemigos.setResistencia((int) (Math.random() * 100));
            enemigos.setCoordenadas(ubicacion);
            enemigos.setEsHostil((Math.random() * 10) <= 5);
            radar.add(enemigos);
            System.out.println("Obteniendo objetivos...\n\t" + radar);
        }
    }

    /**
     * Actividad del radar que indica si debe eliminarse o no un objetivo
     */
    public void destruyeEnemigo() {

        for (int i = 0; i < radar.size(); i++) {
            if (radar.get(i) instanceof Enemigo) {

                int distancia;
                distancia = (int) Math.sqrt(Math.pow(radar.get(i).getCoordenadas()[0], 2) + Math.pow(radar.get(i).getCoordenadas()[1], 2) + Math.pow(radar.get(i).getCoordenadas()[2], 2));
                int elDanio = (int) 5000 / distancia;
                radar.get(i).setResistencia(radar.get(i).getResistencia() - elDanio);
                if (radar.get(i).getResistencia() <= 0) {
                    radar.remove(radar.get(i));
                    System.out.println("Se destruyó un objetivo!");
                }
            }
        }
    }
}
