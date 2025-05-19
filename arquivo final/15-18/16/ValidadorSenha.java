import java.util.Scanner;

public class ValidadorSenha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria o objeto para leitura do teclado

        System.out.print("Digite a senha para validar: ");
        String senha = scanner.nextLine(); // Lê a senha digitada pelo usuário

        // Verifica se a senha é válida usando a função validarSenha()
        if (validarSenha(senha)) {
            System.out.println("Senha válida.");
        } else {
            // Informa que a senha é inválida e exibe os critérios necessários
            System.out.println("Senha inválida. Requisitos:");
            System.out.println("- Pelo menos 8 caracteres");
            System.out.println("- Pelo menos uma letra maiúscula");
            System.out.println("- Pelo menos uma letra minúscula");
            System.out.println("- Pelo menos um número");
        }

        scanner.close(); // Fecha o scanner
    }

    // Função que valida a senha com base nos critérios especificados
    public static boolean validarSenha(String senha) {
        // Verifica se a senha tem pelo menos 8 caracteres
        if (senha.length() < 8) {
            return false;
        }

        // Flags para verificar os critérios
        boolean temMaiuscula = false;
        boolean temMinuscula = false;
        boolean temNumero = false;

        // Percorre cada caractere da senha
        for (char c : senha.toCharArray()) {
            if (Character.isUpperCase(c)) {
                temMaiuscula = true; // Encontrou letra maiúscula
            } else if (Character.isLowerCase(c)) {
                temMinuscula = true; // Encontrou letra minúscula
            } else if (Character.isDigit(c)) {
                temNumero = true; // Encontrou número
            }
        }

        // Retorna verdadeiro se todos os critérios forem atendidos
        return temMaiuscula && temMinuscula && temNumero;
    }
}
