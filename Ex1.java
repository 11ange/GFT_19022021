/*
1) Crie um programa cujo usuário digite um número(multiplicando), o início 
e o fim de um intervalo(multiplicadores). Calcule o resultado(produto) das 
multiplicações entre o multiplicando e os multiplicadores que estão entre 
o intervalo e exiba a operação realizada: “multiplicando x multiplicador = 
produto”.
Regras: 
• O multiplicando não pode ser negativo e não pode ser maior que 3000. 
• Tanto o início como o fim do intervalo, não podem ser números negativos e não 
podem ser maiores de 3000. 
• O intervalo não pode ter uma diferença maior que 10. 
o Exemplo: Intervalo entre 1 e 10: válido; Intervalo entre 1 e 11: inválido. 
• O programa deve validar se o início do intervalo é menor que o fim. 
o Exemplo: Início = 1 e Fim = 3: Válido; Início = 3 e Fim = 1: Inválido. 
Caso o usuário não respeite as regras acima, exiba uma mensagem de erro. 
 */
package Etapa_Tecnica;

import java.util.Scanner;

/**
 *
 * @author luisl
 */
public class Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int multiplicando, inicioIntervalo, fimIntervalo;
        System.out.println("");
        System.out.print("Entre com o valor do Multiplicando: ");
        multiplicando = teclado.nextInt();
        if (multiplicando < 0 || multiplicando > 3000) {
            System.out.println("Erro! O valor do multiplicando deve ser positivo"
                    + " e menor que 3000");
            System.out.println("");
        } else {
            System.out.print("Entre com o valor do início do intervalo: ");
            inicioIntervalo = teclado.nextInt();
            if (inicioIntervalo < 0 || inicioIntervalo > 3000) {
                System.out.println("Erro! O valor do início do intervalo deve "
                        + "ser positivo e menor que 3000");
                System.out.println("");
            } else {
                System.out.print("Entre com o valor do fim do intervalo: ");
                fimIntervalo = teclado.nextInt();
                if (fimIntervalo < 0 || fimIntervalo > 3000) {
                    System.out.println("Erro! O valor do final do intervalo deve"
                            + " ser positivo e menor que 3000");
                    System.out.println("");
                } else if (fimIntervalo < inicioIntervalo) {
                    System.out.println("Erro! O valor do final do intervalo deve"
                            + " ser maior que o início do intervalo");
                    System.out.println("");
                } else if (fimIntervalo - inicioIntervalo > 10) {
                    System.out.println("Erro! O intervalo deve ser menor ou "
                            + "igual a 10");
                    System.out.println("");
                } else {
                    for (int i = 0; i <= fimIntervalo - inicioIntervalo; i++) {
                        System.out.println(multiplicando + " x " + (inicioIntervalo
                                + i) + " = " + multiplicando * (inicioIntervalo + i));
                    }
                    System.out.println("");
                }

            }
        }
    }
}
