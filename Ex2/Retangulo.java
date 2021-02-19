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
public class Retangulo implements AreaCalculavel {

    private double largura, altura;

    Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double getLargura() {
        return this.largura;
    }

    public double getAltura() {
        return this.altura;
    }

    @Override
    public double calculaArea() {
        return this.largura * this.altura;
    }
}
