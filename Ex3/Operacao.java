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
public abstract class Operacao {

    double x, y;

    Operacao(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public abstract double efetuarOperacao(double x, double y);
}
