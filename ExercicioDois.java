import java.util.Scanner;
public class ExercicioDois {
    public static void main(String[] args) {
        
Scanner scan=new Scanner(System.in);

System.out.println("Exercicio dois");

double[] qtdnota=new double[6];

System.out.println("Digite o valor da compra: ");
double valor=scan.nextDouble();

System.out.println("Digite valor pago: ");
double pago=scan.nextDouble();

if(pago<valor){
    System.out.println("Valor insuficiente para realizar a comprar!");
}else{
    double troco=((valor-pago)*-1);
    System.out.printf("Seu troco é: R$ %.2f\n",troco,"\n");

    qtdnota[0]=(troco/50);
    troco=troco%50;
    qtdnota[1]=(troco/20);
    troco=troco%20;
    qtdnota[2]=(troco/10);
    troco=troco%10;
    qtdnota[3]=(troco/5);
    troco=troco%5;
    qtdnota[4]=(troco/2);
    troco=troco%2;
    qtdnota[5]=troco;

System.out.printf("Notas de R$50,00: %.0f\n",Math.floor(qtdnota[0]));
System.out.printf("Notas de R$20,00: %.0f\n",Math.floor(qtdnota[1]));
System.out.printf("Notas de R$10,00: %.0f\n",Math.floor(qtdnota[2]));
System.out.printf("Notas de R$5,00: %.0f\n",Math.floor(qtdnota[3]));
System.out.printf("Notas de R$2,00: %.0f\n",Math.floor(qtdnota[4]));
System.out.printf("Notas de R$1,00: %.0f\n",Math.floor(qtdnota[5]));

}

scan.close();

    }
}
