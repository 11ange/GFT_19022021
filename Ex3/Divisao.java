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
public class Divisao extends Operacao {

    Divisao(double x, double y) {
        super(x, y);
    }

    @Override
    public double efetuarOperacao(double x, double y) {
        if (y == 0)  {
            System.out.print("!!ERRO!! Divisão por zero! ");
            return 0;
        } else {
            return (x / y);
        }
    }
}
