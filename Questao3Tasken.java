import java.util.Scanner;

public class RelatorioNumeros {
    public RelatorioNumeros() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[200];
        int contagem = 0;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int soma = 0;
        int menorImpar = Integer.MAX_VALUE;
        int[] ocorrencias = new int[101];

        while(true) {
            System.out.print("Digite um número positivo (0 para parar): ");
            int numero = scanner.nextInt();
            if (numero == 0) {
                double media = contagem > 0 ? (double)soma / (double)contagem : 0.0;
                System.out.println("\nRelatório:");
                System.out.println("a) Quantos números foram lidos: " + contagem);
                System.out.println("b) O maior número lido: " + maior);
                System.out.println("c) A média dos números lidos: " + media);
                if (menorImpar != Integer.MAX_VALUE) {
                    System.out.println("d) O menor número ímpar lido: " + menorImpar);
                } else {
                    System.out.println("d) Nenhum número ímpar foi lido.");
                }

                System.out.println("e) A quantidade de vezes que cada número ocorreu:");

                for(int i = 1; i <= 100; ++i) {
                    if (ocorrencias[i] > 0) {
                        System.out.println("O número " + i + " ocorreu " + ocorrencias[i] + " vez(es).");
                    }
                }

                scanner.close();
                return;
            }

            if (numero > 0) {
                numeros[contagem] = numero;
                ++contagem;
                soma += numero;
                if (numero > maior) {
                    maior = numero;
                }

                if (numero < menor) {
                    menor = numero;
                }

                if (numero % 2 != 0 && numero < menorImpar) {
                    menorImpar = numero;
                }

                if (numero <= 100) {
                    int var10002 = ocorrencias[numero]++;
                }
            }
        }
    }
}
