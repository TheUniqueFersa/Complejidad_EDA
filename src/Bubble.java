/*
* == PROYECTO 1. COMPLEJIDAD COMPUTACIONAL EN LOS ALGORITMOS DE ORDENAMIENTO | EDA II 2025-1. UNIVERSIDAD NACIONAL AUTONOMA DE MEXICO. FACULTAD DE INGENIERIA. == 
 * @autor: Fernando Samuel López Morales 
 * @autor: Luis Adrián González Falcón
 * 
 * Esta clase implementa el algoritmo de ordenamiento burbuja que extiende de la clase AlgoritmoOrdenamiento
 * última modificación: 16/09/2024
 * @version: 1.0, 2024-09-16
 * 
 * @see Utilerias
 * @see AlgoritmoOrdenamiento
 */
public class Bubble extends AlgoritmoOrdenamiento{
    public Bubble(int[] arr){
        super(arr);
    }
    public Bubble(){
    }
    protected Resultado sort() {
        bubbleSort();
        Resultado res = new Resultado("BubbleSort", operaciones, comparaciones, intercambios, arr, arr.length);
        resultados.add(res);
        return res;
    }
    public static void sort(int[] arr) { //Para uso estático: BubbleSort convencional
        int n = arr.length;
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    Utilerias.intercambiar(arr, j, j+1);
                }
            }
        }
    }
    private int bubbleSort() {
        boolean cambio;
        int n = this.arr.length;
        operaciones+=2;
        
        operaciones+=2; //inicializa i = n; para la comparacion
        for (int i=n; i > 0; i--, operaciones+=2) {//para el decremento del i del for
            

            cambio=false;
            operaciones++;

            operaciones++; //Operacion aritmetica de comparacion
            operaciones+=2; //para la comparacion
            for (int j=0; j < i-1; j++, operaciones+=2) {

                operaciones+=4; //para acceder al elemento y comparar
                comparaciones++; //para la comparacion
                if (arr[j] > arr[j+1]) {
                    
                    operaciones+=7; //para acceder al elemento y comparar
                    intercambios++; //para el cambio
                    Utilerias.intercambiar(arr, j, j+1);

                    operaciones++; //para el cambio
                    cambio = true;
                }

                operaciones+=2; //para la condicion del for
            }

            operaciones+=2; //para el if
            if (!cambio) {
                return 0;
            }

            operaciones++;
        }
        return 0;
    }
    
    public static void main(String args[]){  
        int[] arr = {10,15,4,3,44,12,59,23}; 
        //int[] arr2 = {10,15,4,3,44,12,59,23}; 
        //int[] arr3 = {2,5,4,7,1,9,12,15,20};
        Bubble b = new Bubble(arr);
        System.out.println(b.calcularOperaciones());
    }
}
