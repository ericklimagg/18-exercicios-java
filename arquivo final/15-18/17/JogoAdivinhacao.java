import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner para ler entrada do usuário
        Random random = new Random(); // Gerador de número aleatório

        int numeroSorteado = random.nextInt(100) + 1; // Sorteia número entre 1 e 100
        int tentativa;
        int tentativasFeitas = 0; // Contador de tentativas

        System.out.println("Tente adivinhar o número entre 1 e 100!");

        // Loop até o usuário acertar o número
        do {
            System.out.print("Digite sua tentativa: ");
            tentativa = scanner.nextInt(); // Lê tentativa do usuário
            tentativasFeitas++; // Incrementa o número de tentativas

            // Fornece dicas ao usuário
            if (tentativa < numeroSorteado) {
                System.out.println("Tente um número MAIOR.");
            } else if (tentativa > numeroSorteado) {
                System.out.println("Tente um número MENOR.");
            } else {
                System.out.println("Parabéns! Você acertou em " + tentativasFeitas + " tentativa(s)!");
            }

        } while (tentativa != numeroSorteado); // Continua até acertar

        scanner.close(); // Fecha o scanner
    }
}
