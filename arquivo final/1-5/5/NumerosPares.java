public class NumerosPares {
    public static void main(String[] args) {
        System.out.println("Números pares de 1 a 20:");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // nova linha
    }
}
