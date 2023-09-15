import java.util.Scanner;

public class Exercicio3 {

    static public void main(String[] args) {
        /*
        Variaveis:
        Seu Salario:
        Quantidade de Salarios Minimos:

        Constante:
        Valor Salario Minimo: R$ 1.212,00

        Açoes:

        Calcular a quantidade de salarios minimo que cada funcionario recebe:
        Seu Salario / Salario Minimo = quantidade de salarios minimo

        Capturar o valor do salario do usuario:
        Me informe valor do seu salario:

        Calcular quantidade de salarios minimos:
        Seu Salario / Salario Minimo = quantidade de salarios minimo

        Imprimir informação para o usuario:
        x Salarios Minimos

         */

        /*constante*/
        final double SALARIO_MINIMO = 1212.00;

        /*Variaveis*/
        Scanner sc = new Scanner(System.in);
        double salarioUsuario;
        double quantidadeSalarioMinimo;

        System.out.println("Digite o valor do seu salario: ");
        salarioUsuario = sc.nextDouble();

        quantidadeSalarioMinimo = salarioUsuario / SALARIO_MINIMO;

        System.out.printf("Você recebe %.2f salarios minimos",quantidadeSalarioMinimo);

    }

}


