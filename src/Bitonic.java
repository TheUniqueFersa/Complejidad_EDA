/*
* == PROYECTO 1. COMPLEJIDAD COMPUTACIONAL EN LOS ALGORITMOS DE ORDENAMIENTO | EDA II 2025-1. UNIVERSIDAD NACIONAL AUTÓNOMA DE MÉXICO. FACULTAD DE INGENIERÍA. == 
 * @autor: Fernando Samuel López Morales 
 * @autor: Luis Adrián González Falcón
 * 
 * Esta clase implementa el algoritmo de ordenamiento bitonic que extiende de la clase AlgoritmoOrdenamiento y los métodos
 * sort, bitonicSort, bitonicMerge, bitonicSort1, bitonicMerge1 que son necesarios para el funcionamiento del algoritmo
 * 
 * última modificación: 16/09/2024
 * @version: 1.0, 2024-09-16
 * 
 * @see Utilerias
 * @see AlgoritmoOrdenamiento
 */
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
        operaciones+=2;
        int newSize = 1;
        operaciones+=1;

        operaciones+=1;
        while (newSize < size) {
            newSize *= 2;
            operaciones+=1;
        }


        // Rellenar el arreglo para que su tamaño sea una potencia de 2
        int[] extendedArray = Arrays.copyOf(arr, newSize);
        operaciones+=1+arr.length+newSize; //solo se considera operacion de asignacion...?

        operaciones+=2;
        for (int i = size; i < newSize; i++, operaciones+=3) {
            extendedArray[i] = Integer.MAX_VALUE; // Rellenar con valor grande
            operaciones+=3;
        }

        bitonicSort1(extendedArray, 0, newSize, true);

        // Eliminar los elementos ficticios del arreglo
        System.arraycopy(extendedArray, 0, arr, 0, size);
        operaciones += size;
    }

    private void bitonicMerge1(int[] array, int low, int cnt, boolean dir) {
        operaciones++;
        if (cnt > 1) {
            int k = cnt / 2;
            operaciones+=2;

            operaciones+=3;
            for (int i = low; i < low + k; i++, operaciones+=3) {
                operaciones+=12;
                comparaciones+=2;
                if ((dir && array[i] > array[i + k]) || (!dir && array[i] < array[i + k])) {
                    operaciones+=8;
                    intercambios++;
                    Utilerias.intercambiar(array, i, i + k);
                }
            }
            
            bitonicMerge1(array, low, k, dir);
            operaciones++;
            bitonicMerge1(array, low + k, k, dir);
        }
    }

    private void bitonicSort1(int[] array, int low, int cnt, boolean dir) {
        operaciones+=1;
        if (cnt > 1) {
            int k = cnt / 2;
            operaciones+=2;

            bitonicSort1(array, low, k, true); // Ordena en orden ascendente

            operaciones++;
            bitonicSort1(array, low + k, k, false); // Ordena en orden descendente

            bitonicMerge1(array, low, cnt, dir); // Combina las mitades ordenadas
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
            bitonicSort(array, low, k, true);
            bitonicSort(array, low + k, k, false);
            bitonicMerge(array, low, cnt, dir);
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
}
