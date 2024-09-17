import java.util.Arrays;

public class Bitonic extends AlgoritmoOrdenamiento{
    public Bitonic(int[] arr){
        super(arr);
    }
    public Bitonic(){
    }
    protected Resultado sort(){
        bitonicSort();
        Resultado res = new Resultado("BitonicSort", operaciones, comparaciones, intercambios, arr, arr.length);
        resultados.add(res);
        return res;
    }

    private void bitonicSort() {
        int size = arr.length;
        int newSize = 1;
        while (newSize < size) {
            newSize *= 2;
        }
        // Rellenar el arreglo para que su tamaño sea una potencia de 2
        int[] extendedArray = Arrays.copyOf(arr, newSize);
        for (int i = size; i < newSize; i++) {
            extendedArray[i] = Integer.MAX_VALUE; // Rellenar con valor grande
        }
        bitonicSort1(extendedArray, 0, newSize, true);

        // Eliminar los elementos ficticios del arreglo
        System.arraycopy(extendedArray, 0, arr, 0, size);
    }

    private void bitonicMerge1(int[] array, int low, int cnt, boolean dir) {
        if (cnt > 1) {
            int k = cnt / 2;
            for (int i = low; i < low + k; i++) {
                if ((dir && array[i] > array[i + k]) || (!dir && array[i] < array[i + k])) {
                    Utilerias.intercambiar(array, i, i + k);
                }
            }
            bitonicMerge1(array, low, k, dir);
            bitonicMerge1(array, low + k, k, dir);
        }
    }

    private void bitonicSort1(int[] array, int low, int cnt, boolean dir) {
        if (cnt > 1) {
            int k = cnt / 2;
            bitonicSort1(array, low, k, true); // Sort in ascending order
            bitonicSort1(array, low + k, k, false); // Sort in descending order
            bitonicMerge1(array, low, cnt, dir); // Merge the sorted halves
        }
    }

        
    //STATIC 
    
    
    // Método para ordenar el arreglo utilizando Bitonic Sort
    public static void sort(int[] array) {
        int size = array.length;
        int newSize = 1;
        while (newSize < size) {
            newSize *= 2;
        }
        // Rellenar el arreglo para que su tamaño sea una potencia de 2
        int[] extendedArray = Arrays.copyOf(array, newSize);
        for (int i = size; i < newSize; i++) {
            extendedArray[i] = Integer.MAX_VALUE; // Rellenar con valor grande
        }
        bitonicSort(extendedArray, 0, newSize, true);

        // Eliminar los elementos ficticios del arreglo
        System.arraycopy(extendedArray, 0, array, 0, size);
    }
    
    private static void bitonicSort(int[] array, int low, int cnt, boolean dir) {
        if (cnt > 1) {
            int k = cnt / 2;
            bitonicSort(array, low, k, true); // Sort in ascending order
            bitonicSort(array, low + k, k, false); // Sort in descending order
            bitonicMerge(array, low, cnt, dir); // Merge the sorted halves
        }
    }
    
    private static void bitonicMerge(int[] array, int low, int cnt, boolean dir) {
        if (cnt > 1) {
            int k = cnt / 2;
            for (int i = low; i < low + k; i++) {
                if ((dir && array[i] > array[i + k]) || (!dir && array[i] < array[i + k])) {
                    Utilerias.intercambiar(array, i, i + k);
                }
            }
            bitonicMerge(array, low, k, dir);
            bitonicMerge(array, low + k, k, dir);
        }
    }



    /*
    public static void main(String[] args) {
        // int[] originalArray = { 5, 1, 3, 2, 8, 7, 6 };
        int[] arr = new int[25];
        Utilerias.randomArr(arr, 25);
        Utilerias.imprimirArreglo(arr);
        
        
        // Ordenar el arreglo utilizando Bitonic Sort
        sort(arr);

        // Imprimir el resultado
        // System.out.println(Arrays.toString(arr));
         Utilerias.imprimirArreglo(arr);
    }*/
}
