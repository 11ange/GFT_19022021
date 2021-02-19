/*
2) Crie um projeto contendo as classes: 

Quadrado, Retângulo e Círculo. 

Crie também uma interface chamada AreaCalculavel que será implementada pelas classes.  
Essa interface conterá um método que calcula a área:  

Área do Quadrado = lado*lado;  
Área do Retângulo = largura * altura;  
Área do Círculo = π*r^2 

Crie uma classe principal Teste instanciando os objetos, passando 
valores via construtor, e exiba no console o cálculo da área.  
 */
package Etapa_Tecnica;

/**
 *
 * @author luisl
 */
public class Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(2);
        Circulo circulo = new Circulo(2);
        Retangulo retangulo = new Retangulo(2, 3);
        
        System.out.println("");
        System.out.printf("Raio do circulo: %.2f / Área do circulo: %.2f \n",
                circulo.getRaio(),circulo.calculaArea());
        
        System.out.println("");
        System.out.println("Lado do quadrado: " + quadrado.getLado() + 
                " / Área do quadrado = " + quadrado.calculaArea());
        
        System.out.println("");
        System.out.println("Largura do retângulo: " + retangulo.getLargura() + 
                " Altura do retângulo: " + retangulo.getAltura() + 
                " / Área do retângulo: " + retangulo.calculaArea());
        System.out.println("");
    }

}
