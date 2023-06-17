/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author pc
 */
public class Armadura {
    private final String colorPrimario;
    private final String colorSecundario;
    private int nivelResistencia;
    private int nivelSalud;
    private float cargaBateria;
    private boolean generadorActivo;
    private boolean[] dispositivosDanados;

    // Constructor
    public Armadura(String colorPrimario, String colorSecundario, int nivelResistencia, int nivelSalud, float cargaBateria) {
        this.colorPrimario = colorPrimario;
        this.colorSecundario = colorSecundario;
        this.nivelResistencia = nivelResistencia;
        this.nivelSalud = nivelSalud;
        this.cargaBateria = cargaBateria;
        this.generadorActivo = true;
        this.dispositivosDanados = new boolean[4];
    }

    public void volar(float tiempo) {
        try {
            if (dispositivosDanados[0]) {
                throw new DispositivoDanadoException("Las botas están dañadas. No se puede volar.");
            }

            float consumoBotas = obtenerConsumoBotas(tiempo);
            float consumoGuantes = obtenerConsumoGuantes(tiempo);
            if (verificarDisponibilidadEnergia(consumoBotas) && verificarDisponibilidadEnergia(consumoGuantes)) {
                // Realizar la acción de volar
                System.out.println("Volando...");
                // Restar el consumo de energía
                consumirEnergia(consumoBotas);
                consumirEnergia(consumoGuantes);
            } else {
                System.out.println("Nivel de batería insuficiente para volar.");
            }
        } catch (DispositivoDanadoException e) {
            System.out.println(e.getMessage());
        }
    }

    public void usarGuantesComoArmas(float tiempo) {
        try {
            if (dispositivosDanados[1]) {
                throw new DispositivoDanadoException("Los guantes están dañados. No se pueden usar como armas.");
            }

            float consumo = obtenerConsumoGuantes(tiempo) * 3;
            if (verificarDisponibilidadEnergia(consumo)) {
                // Realizar el ataque con los guantes
                System.out.println("Atacando con los guantes...");
                // Restar el consumo de energía
                consumirEnergia(consumo);
            } else {
                System.out.println("Nivel de batería insuficiente para utilizar los guantes como armas.");
            }
        } catch (DispositivoDanadoException e) {
            System.out.println(e.getMessage());
        }
    }

    public void escribirEnConsola(String mensaje) {
        try {
            if (dispositivosDanados[2]) {
                throw new DispositivoDanadoException("La consola está dañada. No se puede escribir en ella.");
            }

            float consumo = obtenerConsumoConsola();
            if (verificarDisponibilidadEnergia(consumo)) {
                // Realizar la acción de escribir en la consola
                System.out.println("Escribiendo en la consola: " + mensaje);
                // Restar el consumo de energía
                consumirEnergia(consumo);
            } else {
                System.out.println("Nivel de batería insuficiente para utilizar la consola.");
            }
        } catch (DispositivoDanadoException e) {
            System.out.println(e.getMessage());
        }
    }

    public void sintetizarObjeto(String objeto) {
        try {
            if (dispositivosDanados[3]) {
                throw new DispositivoDanadoException("El sintetizador está dañado. No se puede sintetizar ningún objeto.");
            }

            float consumo = obtenerConsumoSintetizador();
            if (verificarDisponibilidadEnergia(consumo)) {
                // Realizar la acción de sintetizar el objeto
                System.out.println("Sintetizando objeto: " + objeto);
                // Restar el consumo de energía
                consumirEnergia(consumo);
            } else {
                System.out.println("Nivel de batería insuficiente para utilizar el sintetizador.");
            }
        } catch (DispositivoDanadoException e) {
            System.out.println(e.getMessage());
        }
    }

    public void mostrarEstado() {
        System.out.println("Estado de la armadura:");
        System.out.println("Color primario: " + colorPrimario);
        System.out.println("Color secundario: " + colorSecundario);
        System.out.println("Nivel de resistencia: " + nivelResistencia);
        System.out.println("Nivel de salud: " + nivelSalud);
        informarEstadoBateria();
        informarEstadoReactor();
    }

    private void informarEstadoBateria() {
        float estadoBateria = (cargaBateria / 1000) * 100;
        System.out.println("Estado de la batería: " + estadoBateria + "%");
    }

    public void informarEstadoReactor() {
        float cargaReactor = cargaBateria * 1000;
        float cargaReactorKilogramos = cargaReactor * 0.00002f;
        float cargaReactorLibras = cargaReactor * 0.000044f;
        System.out.println("Estado del reactor:");
        System.out.println("Carga del reactor en kilogramos: " + cargaReactorKilogramos);
        System.out.println("Carga del reactor en libras: " + cargaReactorLibras);
    }

    private boolean verificarDisponibilidadEnergia(float consumo) {
        return (cargaBateria - consumo) >= 0;
    }

    private void consumirEnergia(float consumo) {
        cargaBateria -= consumo;
        if (cargaBateria <= 0) {
            cargaBateria = 0;
            generadorActivo = false;
        }
    }

    private float obtenerConsumoBotas(float tiempo) {
        return tiempo * 0.5f;
    }

    private float obtenerConsumoGuantes(float tiempo) {
        return tiempo * 1.0f;
    }

    private float obtenerConsumoConsola() {
        return 2.0f;
    }

    private float obtenerConsumoSintetizador() {
        return 5.0f;
    }

    public void setDispositivoDanado(int indice, boolean danado) {
        if (indice >= 0 && indice < dispositivosDanados.length) {
            dispositivosDanados[indice] = danado;
        }
    }
}

class DispositivoDanadoException extends Exception {
    public DispositivoDanadoException(String mensaje) {
        super(mensaje);
    }
}

