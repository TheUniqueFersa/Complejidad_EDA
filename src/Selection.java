/*
* == PROYECTO 1. COMPLEJIDAD COMPUTACIONAL EN LOS ALGORITMOS DE ORDENAMIENTO | EDA II 2025-1. UNIVERSIDAD NACIONAL AUTÓNOMA DE MÉXICO. FACULTAD DE INGENIERÍA. == 
 * @autor: Fernando Samuel López Morales 
 * @autor: Luis Adrián González Falcón
 * 
 * Esta clase implementa el algoritmo de ordenamiento selectionSort que extiende de la clase AlgoritmoOrdenamiento y los métodos
 * sort, selectionSort que son necesarios para el funcionamiento del algoritmo
 * 
 * última modificación: 16/09/2024
 * @version: 1.0, 2024-09-16
 * 
 * @see Utilerias
 * @see AlgoritmoOrdenamiento
 */
public class Selection extends AlgoritmoOrdenamiento{
    public Selection(int[] arr){
        super(arr);
    }
    public Selection(){
    }
    protected Resultado sort() {
        selectionSort();
        Resultado res = new Resultado("SelectionSort", operaciones, comparaciones, intercambios, arr, arr.length);
        resultados.add(res);
        return res;
    }
    private void selectionSort(){  
        int n = arr.length;
        operaciones+=2;

        operaciones+=2; //inicializa i = 0; para la comparacion
        for (int i = 0; i < n - 1; i++, operaciones+=4) {  
            int min = i;
            operaciones++;

            operaciones+=3;
            for (int j = i + 1; j < n; j++, operaciones+=3) {  
                operaciones+=3; //para acceder al elemento y comparar
                comparaciones++;
                if (arr[j] < arr[min]){  
                    min = j;  
                    operaciones++;
                }                      
            }
            intercambios++;
            operaciones+=7; //para acceder al elemento y comparar
            Utilerias.intercambiar(arr, i,min);
        }  
    }
    public static void sort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n - 1; i++){  
            int min = i;  
            for (int j = i + 1; j < n; j++){  
                if (arr[j] < arr[min]){  
                    min = j;  
                }                      
            }  
            Utilerias.intercambiar(arr, i,min);
        }  
    } 

}  
