import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args){

        Scanner scannerImc = new Scanner(System.in);

        System.out.println("Digite o peso: ");

        double peso = scannerImc.nextDouble();

        System.out.println("Digite a altura: ");

        double altura = scannerImc.nextDouble();

        double imc;

        imc = peso / (altura * altura);

        System.out.printf("Seu IMC é de: %.2f" , imc);

    }


}
