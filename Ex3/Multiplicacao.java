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
public class Multiplicacao extends Operacao {

    Multiplicacao(double x, double y) {
        super(x, y);
    }

    @Override
    public double efetuarOperacao(double x, double y) {
        return (this.x * this.y);
    }
}
