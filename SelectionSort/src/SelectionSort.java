
import java.util.Arrays;

public class SelectionSort {
    public void sort(int[] arr){
        int n = arr.length;
        int minIndex;

        for(int i = 0; i < n-1; i++){ //Recorremos el arreglo, evitando el desbordamiento
            minIndex=i;
            for (int j = i+1 ; j < n; j++) {
                if (arr[j]< arr[minIndex]) {
                    minIndex=j; //Seleccionamos el index
                }
            }
            int temp=arr[minIndex]; //guardamos el valor del minimo
            arr[minIndex]=arr[i]; //intercambio, mandamos el valor del actual ala posicion del
            arr[i]=temp;//en la posicion actual , guardamos el temporal
        }
        System.out.println("Arreglo ordenado");
        System.out.println(Arrays.toString(arr));
    }
}