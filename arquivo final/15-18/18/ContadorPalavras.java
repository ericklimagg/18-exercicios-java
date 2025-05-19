import java.util.Scanner;

public class ContadorPalavras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner para entrada do usuário

        // Solicita ao usuário que digite uma frase
        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        // Remove espaços extras no início/fim e divide a frase por espaços
        // O regex "\\s+" considera um ou mais espaços como separador
        String[] palavras = frase.trim().split("\\s+");

        // Se o usuário digitar só espaços ou uma string vazia, o array pode conter uma palavra vazia
        int quantidadePalavras = (frase.trim().isEmpty()) ? 0 : palavras.length;

        // Exibe o resultado
        System.out.println("Número de palavras: " + quantidadePalavras);

        scanner.close(); // Fecha o scanner
    }
}
