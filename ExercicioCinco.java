import java.util.Scanner;

public class ExercicioCinco {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

System.out.println("Exercicio cinco.");

System.out.println("Digite o primeiro número: ");
double n1=scan.nextDouble();

System.out.println("Digite o segundo número: ");
double n2=scan.nextDouble();

System.out.println("Para soma, digite '+': \nPara subitração, digite '-': \nPara multiplicação, digite '*': \nPara divisão, digite '/': \nPara potenciação, digite '^': \n");
String operacao=scan.next();

double soma=n1+n2;
double subitracao=n1-n2;
double multiplicacao=n1*n2;
double divisao=n1/n2;
double potenciacao=Math.pow(n1,n2);
switch(operacao){
case "+":
   System.out.println("A soma é: "+soma);  
break;

case "-":
   System.out.println("A subitração é: "+subitracao);  
break;

case "*":
   System.out.println("A multiplicação é: "+multiplicacao);  
break;

case "/":
   System.out.println("A divisão é: "+divisao);  
break;

case "^":
   System.out.println("A potenciação é: "+potenciacao);  
break;

default:
System.out.println("O símbolo da operação é inválido.");
break;
}

scan.close();

    }
}
