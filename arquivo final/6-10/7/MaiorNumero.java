public class MaiorNumero {
    public static void main(String[] args) {
        int[] numeros = {15, 8, 42, 23, 4}; // array de exemplo

        int maior = numeros[0]; // começamos assumindo que o primeiro número é o maior

        // percorre o array comparando cada número com o atual "maior"
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i]; // atualiza se encontrar um número maior
            }
        }

        System.out.println("O maior número do array é: " + maior);
    }
}
