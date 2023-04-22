import java.util.Scanner;

public class ExercicioQuatro{
    public static void main(String[] args) {

     Scanner scan=new Scanner(System.in);

     System.out.println("Exercicio quatro.");

     double pi=3.141592;

System.out.println("Para calcular o perímetro digite 1:\nPAra calcular a área digite 2:\nPara calcular volume digite 3:\n");
int indicador=scan.nextInt();

System.out.println("Digite o raio do círculo ou esfera:");
double raio=scan.nextDouble();

double perimetro=(2*pi*raio);
double area=(Math.exp(raio)*pi);
double volume=(4/3)*pi*(Math.pow(raio,3));

switch(indicador){
case 1:
    System.out.printf("O perimetro é: %.2f\n",perimetro);
 break;

case 2:
    System.out.printf("A área é: %.2f\n",area);
break;

case 3:
    System.out.printf("O volume é: %.2f\n",volume);
break;

    default:
System.out.println("Erro, o número da operação é inválido!");
    break;
}

     scan.close();
    }
}