/******************************************************************************
Questão 14

*******************************************************************************/
import java.util.Scanner;

public class Main {
    
  
    public static void tabuada(int x) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(x + " x " + i + " = " + (x * i));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.print("Informe um número: ");
        int x = scanner.nextInt(); 

        tabuada(x);

        scanner.close();
    }
}
