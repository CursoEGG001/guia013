/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author pc
 */
public class Enemigo extends Objetivo {

    protected int danioAtaque;
    protected int defensaDanios;
    protected int saludEstimada;

    public Enemigo(int danioAtaque, int defensaDanios, int saludEstimada) {
        this.danioAtaque = danioAtaque;
        this.defensaDanios = defensaDanios;
        this.saludEstimada = saludEstimada;
    }

    public Enemigo() {
    }

    public Enemigo(int Resistencia, boolean esHostil) {
        super(Resistencia, esHostil);
    }

    public int getDanioAtaque() {
        return danioAtaque;
    }

    public void setDanioAtaque(int danioAtaque) {
        this.danioAtaque = danioAtaque;
    }

    public int getDefensaDanios() {
        return defensaDanios;
    }

    public void setDefensaDanios(int defensaDanios) {
        this.defensaDanios = defensaDanios;
    }

    public int getSaludEstimada() {
        return saludEstimada;
    }

    public void setSaludEstimada(int saludEstimada) {
        this.saludEstimada = saludEstimada;
    }

    @Override
    public int[] getCoordenadas() {
        return Coordenadas;
    }

    @Override
    public void setCoordenadas(int[] Coordenadas) {
        this.Coordenadas = Coordenadas;
    }

    @Override
    public int getResistencia() {
        return Resistencia;
    }

    @Override
    public void setResistencia(int Resistencia) {
        this.Resistencia = Resistencia;
    }

    public boolean esHostil() {
        return esHostil;
    }

    public void setEsHostil(boolean esHostil) {
        this.esHostil = esHostil;
    }

    public Enemigo(int danioAtaque, int defensaDanios, int saludEstimada, int Resistencia, boolean esHostil) {
        super(Resistencia, esHostil);
        this.danioAtaque = danioAtaque;
        this.defensaDanios = defensaDanios;
        this.saludEstimada = saludEstimada;
    }

}
