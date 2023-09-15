import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {
        /*
        * Variaveis
        * Anos
        * Mes
        * Dias
        * Total de Dias
        *
        * Constantes
        * Ano em dias = 365
        * Mes em dias = 30
        *
        * Açoes:
        * Pedir Idade do Usuario;
        * Calcular em dias
        * Imprimir em anos meses e dias
        *
        * */
        final int ano_dias = 365;
        final int mes_dias = 30;

        int anos;
        int meses;
        int dias;
        int total_dias;

        Scanner entradas = new Scanner(System.in);

        System.out.println("Digite sua idade em anos dias e meses: ");

        System.out.print("anos: ");
        anos = entradas.nextInt();

        System.out.print("meses: ");
        meses = entradas.nextInt();

        System.out.print("dias: ");
        dias = entradas.nextInt();

        total_dias = anos * ano_dias + meses * mes_dias + dias;

        System.out.println("O total de dias que você tem é: " + total_dias);

        System.out.printf("%d anos, %d meses e %d dias = %d dias.", anos, meses, dias, total_dias);

    }
}

