import java.util.InputMismatchException;
import java.util.Scanner;

public class VetorInteiros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[10];
        int indice = 0;

        try {
            while (true) {
                System.out.print("Digite um valor inteiro (0 para parar): ");
                int valor = scanner.nextInt();

                if (valor == 0) {
                    vetor[indice] = valor;
                    break;
                }

                vetor[indice] = valor;
                indice++;

                if (indice == 10) {
                    System.out.println("Você atingiu o limite máximo de valores.");
                    break;
                }
            }

            System.out.println("\nValores digitados:");

            for (int i = 0; i < indice; i++) {
                System.out.println(vetor[i]);
            }
        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Por favor, digite um valor inteiro.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Você informou mais do que 10 valores.");
        } finally {
            scanner.close();
        }
    }
}

