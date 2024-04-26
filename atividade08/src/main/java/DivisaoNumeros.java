import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisaoNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite o primeiro número:");
            double numero1 = scanner.nextDouble();

            System.out.println("Digite o segundo número:");
            double numero2 = scanner.nextDouble();

            double resultado = dividirNumeros(numero1, numero2);
            System.out.println("Resultado da divisão: " + resultado);
        } catch (InputMismatchException e) {
            System.out.println("Erro: Valor informado não é numérico.");
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero.");
        }

        scanner.close();
    }

    public static double dividirNumeros(double numero1, double numero2) {
        if (numero2 == 0) {
            throw new ArithmeticException();
        }
        return numero1 / numero2;
    }
}

