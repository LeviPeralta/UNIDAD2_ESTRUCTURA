import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        int n;
        System.out.println("¿Cuantas calificaciones quieres ingresar?");
        n = leer.nextInt();
        
        
        int[] calificaciones = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Ingresa la calificacion: ");
            calificaciones[i] = leer.nextInt();
        }

        BubbleSort bubble = new BubbleSort();
        bubble.sort(calificaciones);
    }
}
