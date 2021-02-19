/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Etapa_Tecnica;

/**
 *
 * @author luisl
 */
public class Circulo implements AreaCalculavel {

    private double raio;

    Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return this.raio;
    }

    @Override
    public double calculaArea() {
        return Math.PI * Math.pow(this.raio, 2);
    }
}
