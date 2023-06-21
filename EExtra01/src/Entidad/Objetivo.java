/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author pc
 */
public abstract class Objetivo {
    
    protected int [] Coordenadas = new int[3];
    
    protected int Resistencia;
    
    protected boolean esHostil;

    public Objetivo() {
    }

    public Objetivo(int Resistencia, boolean esHostil) {
        this.Resistencia = Resistencia;
        this.esHostil = esHostil;
    }

    public void setCoordenadas(int[] Coordenadas) {
        this.Coordenadas = Coordenadas;
    }

    public int[] getCoordenadas() {
        return Coordenadas;
    }

    public int getResistencia() {
      return this.Resistencia; 
    }

    public void setResistencia(int Resistencia) {
        this.Resistencia=Resistencia; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


}
