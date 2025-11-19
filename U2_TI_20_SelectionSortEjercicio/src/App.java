import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        // 1. Solicitar N números enteros
        System.out.print("¿Cuántos números vas a ingresar?: ");
        int n = sc.nextInt();

        int[] numeros = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingresa el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        // Copia del arreglo original
        int[] original = new int[n];
        for (int i = 0; i < n; i++) {
            original[i] = numeros[i];
        }

        // 2. Separar en pares e impares (primero contar)
        int cantPares = 0;
        int cantImpares = 0;

        for (int i = 0; i < n; i++) {
            if (numeros[i] % 2 == 0) {
                cantPares++;
            } else {
                cantImpares++;
            }
        }

        int[] pares = new int[cantPares];
        int[] impares = new int[cantImpares];

        int ip = 0;
        int ii = 0;

        for (int i = 0; i < n; i++) {
            if (numeros[i] % 2 == 0) {
                pares[ip] = numeros[i];
                ip++;
            } else {
                impares[ii] = numeros[i];
                ii++;
            }
        }

        // 3. Selection Sort para pares
        for (int i = 0; i < pares.length - 1; i++) {
            int min = i;

            for (int j = i + 1; j < pares.length; j++) {
                if (pares[j] < pares[min]) {
                    min = j;
                }
            }

            int aux = pares[i];
            pares[i] = pares[min];
            pares[min] = aux;
        }

        // Selection Sort para impares
        for (int i = 0; i < impares.length - 1; i++) {
            int min = i;

            for (int j = i + 1; j < impares.length; j++) {
                if (impares[j] < impares[min]) {
                    min = j;
                }
            }

            int aux = impares[i];
            impares[i] = impares[min];
            impares[min] = aux;
        }

        // 4. Imprimir resultados
        System.out.print("\nArreglo original: ");
        for (int i = 0; i < original.length; i++) {
            System.out.print(original[i] + " ");
        }

        System.out.print("\nNúmeros pares ordenados: ");
        for (int i = 0; i < pares.length; i++) {
            System.out.print(pares[i] + " ");
        }

        System.out.print("\nNúmeros impares ordenados: ");
        for (int i = 0; i < impares.length; i++) {
            System.out.print(impares[i] + " ");
        }

        System.out.println();
    }
}
