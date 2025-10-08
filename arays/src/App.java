
public class App {
    public static void main(String[] args) throws Exception {

        int[][] arrExample={
            {2,5,0,1},
            {5,1,9,5},
            {9,5,2,8},
            {4,0,0,4},
            {7,5,1,2}
        };



        //suma con excepción en la diagnal ({0,0}, {1,1}, {2,2}, {4,4})
        int filaNumero = 0;
        int suma = 0;
        for (int[] is : arrExample) {
            int columna = 0;
            for (int num : is) {
                if(filaNumero != columna){
                    suma += num;
                }
                columna++;
            }
            filaNumero++;
        }
        System.out.println("suma de todos: " + suma);

    }
}