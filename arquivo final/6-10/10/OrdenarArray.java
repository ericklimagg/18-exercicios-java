import java.util.Arrays;

public class OrdenarArray {
    public static void main(String[] args) {
        int[] numeros = {42, 15, 8, 23, 4};

        // Ordena o array em ordem crescente
        Arrays.sort(numeros);

        // Exibe o array ordenado
        System.out.println("Array em ordem crescente:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }
}
