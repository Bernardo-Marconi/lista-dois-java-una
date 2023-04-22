import java.util.Scanner;
import java.util.Random;

public class ExercicioSeis{
    public static void main(String[] args) {

     Scanner scan=new Scanner(System.in);
     Random sorteio = new Random();

System.out.println("Exercicio seis.");

System.out.println("Digite o primeiro número: ");
double n1=scan.nextDouble();

System.out.println("Digite o segundo número: ");
double n2=scan.nextDouble();

double maior=Math.max(n1,n2);
double menor=Math.min(n1,n2);

double sorteado= sorteio.nextDouble(maior-menor+1)+menor;

sorteado=Math.floor(sorteado);

if(sorteado%2==0){
    System.out.printf("O número gerado é: %s, e ele é par.",sorteado);
}
else{
    System.out.printf("O número gerado é: %s, e ele é ímpar.",sorteado);
}

     scan.close();
     
    }
}