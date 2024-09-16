
/*
 * @autors: Fernando López y Luis González
 * @file: Burbuja.java
 * @brief: Esta clase implementa el algoritmo de ordenamiento burbuja
 * y extiende de la clase AlgoritmoOrdenamiento
 * @date: 16/09/2024
 * @version: 1.0
 * 
 * @see Utilerias
 * @see AlgoritmoOrdenamiento
 * 
 */
public class Burbuja extends AlgoritmoOrdenamiento{
    /*
     * @brief: Constructor de la clase Burbuja
     * @param: int[] arr
     * @return: void
     */
    public Burbuja(int[] arr){
        super(arr);
    }
    protected Resultado sort() {
        bubbleSort();
        Resultado res = new Resultado("BubbleSort", operaciones, comparaciones, intercambios, inserciones, arr, arr.length);
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
        Burbuja b = new Burbuja(arr);
        System.out.println(b.calcularOperaciones());
    }
}
