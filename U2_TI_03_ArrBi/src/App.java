public class App {
    public static void main(String[] args) throws Exception {
        int[][] entrada = {
            {1},
            {6, 3, 1},
            {1, 2, 3, 4},
            {0, 5, 3, 0},
            {2, 5, 9},
            {2, 4, 8, 9, 10}
        };

        int[][] salida = new int[entrada.length][];
        int i = 0;
        for (int[] fila : entrada) {
            int valorExtra = (fila.length % 2 == 0) ? fila[0] + fila[fila.length - 1] : 0;
            int[] nuevaFila = new int[fila.length + 1];
            int j = 0;
            for (int n : fila) {
                nuevaFila[j++] = n;
            }
            nuevaFila[fila.length] = valorExtra;
            salida[i++] = nuevaFila;
        }

        System.out.println("Arreglo: ");
        System.out.println("{");
        for (int[] fila : salida) {
            System.out.print("  {");
            int j = 0;
            for (int n : fila) {
                System.out.print(n);
                if (j++ < fila.length - 1) System.out.print(",");
            }
            System.out.println("}");
        }
        System.out.println("}");
    }
}
