/*
* == PROYECTO 1. COMPLEJIDAD COMPUTACIONAL EN LOS ALGORITMOS DE ORDENAMIENTO | EDA II 2025-1. UNIVERSIDAD NACIONAL AUTONOMA DE MEXICO. FACULTAD DE INGENIERIA. == 
 * @autor: Fernando Samuel López Morales 
 * @autor: Luis Adrián González Falcón
 * 
 * Esta clase implementa el algoritmo de ordenamiento insertionSort que extiende de la clase AlgoritmoOrdenamiento y los métodos
 * sort, insertionSort que son necesarios para el funcionamiento del algoritmo
 * 
 * última modificación: 16/09/2024
 * @version: 1.0, 2024-09-16
 * 
 * @see Utilerias
 * @see AlgoritmoOrdenamiento
 */
public class Insertion extends AlgoritmoOrdenamiento{  
    public Insertion(int[] arr){
        super(arr);
    }
    public Insertion(){
    }
    protected Resultado sort() {
        insertionSort();
        Resultado res = new Resultado("InsertionSort", operaciones, comparaciones, intercambios, arr, arr.length);
        resultados.add(res);
        return res;
    }
    private void insertionSort() {  
        int n = arr.length;  
        operaciones+=2;

        operaciones+=2; //inicializa j = 1; para la comparacion
        for (int j = 1; j < n; j++, operaciones+=2) {  
            int key = arr[j];  
            operaciones+=2;

            int i = j-1;  
            operaciones+=2;

            operaciones+=4; //para la comparacion
            comparaciones++; //para la comparacion
            while ( (i > -1) && ( arr [i] > key ) ) {  
                arr [i+1] = arr [i]; 
                intercambios++;
                operaciones+=4; //para acceder al elemento y comparar 
                i--;  
                operaciones+=2; //para el decremento de i
                
                operaciones+=4; //para la comparacion
                comparaciones++; //para la comparacion
            }  
            arr[i+1] = key; 
            intercambios++;
            operaciones+=3; //para acceder al elemento y comparar 

            operaciones++; //para la condicion del for
       }  
    } 
    public static void sort(int array[]) {  
        int n = array.length;  
        for (int j = 1; j < n; j++) {  
            int key = array[j];  
            int i = j-1;  
            while ( (i > -1) && ( array [i] > key ) ) {  
                array [i+1] = array [i];  
                i--;  
            }  
            array[i+1] = key;  
       }  
    }
}
