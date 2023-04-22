import java.util.Scanner;

public class ExercicioUm{
    public static void main(String[] args) {

     Scanner scan=new Scanner(System.in);

     System.out.println("Exercicio um.");
     
     System.out.println("Digite o primeiro número:");
     double primeironumero=scan.nextDouble();

     System.out.println("Digite o segundo número:");
     double segundonumero=scan.nextDouble();

     System.out.println("Digite o terceiro número:");
     double terceironumero=scan.nextDouble();

     double media=((primeironumero+segundonumero+terceironumero)/3);

double maior = Math.max(primeironumero,segundonumero);
maior=Math.max(maior,terceironumero);

System.out.println("O maior número é "+maior);

double menor = Math.min(primeironumero,segundonumero);
menor=Math.min(menor,terceironumero);

System.out.println("O menor número é "+menor);

System.out.println("A media aritmética: "+ media);

     scan.close();

    }
}