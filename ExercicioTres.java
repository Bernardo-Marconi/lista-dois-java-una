import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println(" Exercicio três.");
        
        System.out.print("Informe o valor de a: ");
        double a = entrada.nextDouble();
        
        System.out.print("Informe o valor de b: ");
        double b = entrada.nextDouble();
        
        System.out.print("Informe o valor de c: ");
        double c = entrada.nextDouble();
        
        double delta = Math.pow(b, 2) - 4 * a * c;
        
        if (a == 0 && b == 0 && c != 0) {
            System.out.println("Coeficientes informados incorretamente.");
        } else if (a == 0 && b != 0) {
            System.out.println("Essa é uma equação de primeiro grau.");
            double raiz = -c/b;
            System.out.printf("Raiz real da equação: %.2f\n", raiz);
        } else if (delta < 0) {
            System.out.println("Esta equação não possui raízes reais.");
        } else if (delta == 0) {
            System.out.println("Esta equação possui duas raízes reais iguais.");
            double raiz = -b/(2*a);
            System.out.printf("Raízes da equação: %.2f e %.2f\n", raiz, raiz);
        } else {
            System.out.println("Esta equação possui duas raízes reais diferentes.");
            double raiz1 = (-b + Math.sqrt(delta))/(2*a);
            double raiz2 = (-b - Math.sqrt(delta))/(2*a);
            System.out.printf("Raízes da equação: %.2f e %.2f\n", raiz1, raiz2);
        }
        
        entrada.close();
    }
}