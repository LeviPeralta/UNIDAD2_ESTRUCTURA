import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
         Scanner sc = new Scanner(System.in);

        // 1. Solicitar al usuario un arreglo de enteros
        System.out.print("¿Cuántos elementos tendrá el arreglo?: ");
        int n = sc.nextInt();

        int[] numeros = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingresa el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        // Guardar copia del arreglo original
        int[] original = new int[n];
        for (int i = 0; i < n; i++) {
            original[i] = numeros[i];
        }

        // 3. Ordenar usando Bubble Sort
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1 - i; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int aux = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = aux;
                }
            }
        }

        // 4. Identificar mínimo, máximo y diferencia
        int minimo = numeros[0];
        int maximo = numeros[numeros.length - 1];
        int diferencia = maximo - minimo;

        // 5. Impresiones
        System.out.println("\n--- RESULTADOS ---");

        System.out.print("Arreglo original: ");
        for (int i = 0; i < original.length; i++) {
            System.out.print(original[i] + " ");
        }

        System.out.print("\nArreglo ordenado: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        System.out.println("\nValor mínimo: " + minimo);
        System.out.println("Valor máximo: " + maximo);
        System.out.println("Diferencia (máximo - mínimo): " + diferencia);
    }
}
