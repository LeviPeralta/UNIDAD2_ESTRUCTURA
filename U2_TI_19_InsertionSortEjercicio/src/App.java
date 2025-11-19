public class App {
    public static void main(String[] args) throws Exception {
        
        // 1. Declarar un arreglo de temperaturas
        double[] temperaturas = { 21.5, 19.0, 25.3, 18.4, 30.0, 16.8, 22.1 };

        // Guardar copia del arreglo original
        double[] original = new double[temperaturas.length];
        for (int i = 0; i < temperaturas.length; i++) {
            original[i] = temperaturas[i];
        }

        // 2. Imprimir arreglo original
        System.out.print("Arreglo original: ");
        for (int i = 0; i < original.length; i++) {
            System.out.print(original[i] + " ");
        }
        System.out.println();

        // 3. Insertion Sort (orden ascendente)
        for (int i = 1; i < temperaturas.length; i++) {
            double actual = temperaturas[i];
            int j = i - 1;

            while (j >= 0 && temperaturas[j] > actual) {
                temperaturas[j + 1] = temperaturas[j];
                j--;
            }

            temperaturas[j + 1] = actual;
        }

        // 4. Cálculos
        double minima = temperaturas[0];
        double maxima = temperaturas[temperaturas.length - 1];
        double rango = maxima - minima;

        // 3 temperaturas más bajas (si existen)
        double[] bajas = new double[3];
        int cantBajas = 0;
        for (int i = 0; i < temperaturas.length && i < 3; i++) {
            bajas[i] = temperaturas[i];
            cantBajas++;
        }

        // 3 temperaturas más altas (si existen)
        double[] altas = new double[3];
        int cantAltas = 0;
        int inicio = temperaturas.length - 3;
        if (inicio < 0) {
            inicio = 0;
        }
        for (int i = inicio; i < temperaturas.length; i++) {
            altas[cantAltas] = temperaturas[i];
            cantAltas++;
        }

        // 5. Impresiones finales
        System.out.print("\nArreglo ordenado: ");
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.print(temperaturas[i] + " ");
        }

        System.out.println("\n\nResultados:");
        System.out.println("Temperatura mínima: " + minima);
        System.out.println("Temperatura máxima: " + maxima);
        System.out.println("Rango (máxima - mínima): " + rango);

        System.out.print("3 temperaturas más bajas: ");
        for (int i = 0; i < cantBajas; i++) {
            System.out.print(bajas[i] + " ");
        }

        System.out.print("\n3 temperaturas más altas: ");
        for (int i = 0; i < cantAltas; i++) {
            System.out.print(altas[i] + " ");
        }

        System.out.println();
    }
}
