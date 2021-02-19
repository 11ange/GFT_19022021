/*
3) Crie uma classe abstrata chamada Operacao com um método abstrato chamado 
efetuarOperacao, que recebe dois parâmetros: x e y e retorna um valor. 
• Crie quatro classes: Soma, Subtracao, Multiplicacao, Divisao, herdando a 
classe Operacao e implementando o método “efetuarOperacao” com a devida operação
matemática correspondente.  
• Crie uma classe com método main, que usuário digite x e y, imprima o resultado
dos retornos de todas as classes as implementadas.  

o Exemplo: o método “efetuarOperacao” da classe Soma deve retornar o valor de 
x + y , o da classe Subtracao deve retornar x – y e assim por diante. 
o Atenção: Caso o usuário tente fazer uma divisão por 0, exiba na tela uma 
mensagem dizendo que a operação não será possível, e retorne 0. 
 */
package Etapa_Tecnica;

import java.util.Scanner;

/**
 *
 * @author luisl
 */
public class Ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double valor1, valor2;
        System.out.println("");
        System.out.print("Digite o valor de X: ");
        valor1 = teclado.nextDouble();
        System.out.print("Digite o valor de Y: ");
        valor2 = teclado.nextDouble();

        Soma soma = new Soma(valor1, valor2);
        Subtracao subtracao = new Subtracao(valor1, valor2);
        Divisao divisao = new Divisao(valor1, valor2);
        Multiplicacao multiplicacao = new Multiplicacao(valor1, valor2);

        System.out.println("");
        System.out.println("A     soma      de " + valor1 + " e " + valor2 + " é " + soma.efetuarOperacao(valor1, valor2));
        System.out.println("A   subtracao   de " + valor1 + " e " + valor2 + " é " + subtracao.efetuarOperacao(valor1, valor2));
        System.out.println("A multiplicacao de " + valor1 + " e " + valor2 + " é " + multiplicacao.efetuarOperacao(valor1, valor2));
        System.out.println("A    divisao    de " + valor1 + " e " + valor2 + " é " + divisao.efetuarOperacao(valor1, valor2));
    }
}
