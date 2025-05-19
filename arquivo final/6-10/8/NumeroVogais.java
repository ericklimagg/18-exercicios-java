import java.util.Scanner;

public class NumeroVogais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita a string ao usuário
        System.out.print("Digite uma frase ou palavra: ");
        String texto = scanner.nextLine();

        int contadorVogais = 0;

        // Percorre a string caractere por caractere
        for (int i = 0; i < texto.length(); i++) {
            char c = Character.toLowerCase(texto.charAt(i)); // converte para minúscula

            // Verifica se o caractere é uma vogal
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contadorVogais++;
            }
        }

        // Exibe o resultado
        System.out.println("Número de vogais: " + contadorVogais);

        scanner.close();
    }
}
