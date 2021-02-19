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
public class Quadrado implements AreaCalculavel {

    private double lado;

    Quadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return this.lado;
    }

    @Override
    public double calculaArea() {
        return this.lado * this.lado;
    }
}
