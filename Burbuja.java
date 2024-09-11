
public class Burbuja {
    public static int bubbleSort(int[] array) {
        boolean cambio;
        int n = array.length;
        for (int i=n; i > 0; i--) {
            cambio=false;
            for (int j=0; j < i-1; j++) {
                if (array[j] > array[j+1]) {
                    Utilerias.intercambiar(array, j, j+1);
                    cambio = true;
                }
            }
            if (!cambio) {
                return 0;
            }
        }
        return 0;
    }
}
