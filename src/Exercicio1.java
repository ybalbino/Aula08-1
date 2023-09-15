import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o peso dos peixes em kg: ");
        double peso = sc.nextDouble();

        double pesoLimite = 50.0;

        if (peso > pesoLimite){
            double excesso = peso - pesoLimite;
            double multa = excesso * 4.0;

            System.out.println("Excesso de peso: " + excesso + " quilos.");
            System.out.printf("Valor da Multa: R$ %.2f", multa);
        } else {
            System.out.println("Limite de peso respeitado, não tem multa.");
        }
        sc.close();
    }

}
