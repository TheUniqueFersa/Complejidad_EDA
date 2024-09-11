
/*
    Comparaciones
    Intercambios
    Inserciones

 */
public class Burbuja {
    static int operaciones = 0;


    public static int bubbleSort(int[] array) {
        boolean cambio;
        int n = array.length;
        operaciones+=2;

        operaciones++; //inicializa i = n
        for (int i=n; i > 0; i--) {
            operaciones++; //para la comparacion

            cambio=false;
            operaciones++;

            operaciones++;
            operaciones+=2; //para la comparacion
            for (int j=0; j < i-1; j++, operaciones++) {
                

                operaciones+=4; //para acceder al elemento y comparar
                if (array[j] > array[j+1]) {
                    
                    operaciones+=7; //para acceder al elemento y comparar
                    Utilerias.intercambiar(array, j, j+1);

                    operaciones++; //para el cambio
                    cambio = true;
                }

            }

            operaciones+=2; //para el if
            if (!cambio) {
                return 0;
            }

            operaciones++; //para el decremento del i del for
        }
        return 0;
    }
    public static int BUBBLESORT(int arr[]) {
        operaciones = 0;
        bubbleSort(arr);
        return operaciones;
    }
    public static void main(String args[]){  
        int[] arr1 = {16, 8, 4, 12, 2}; 
        //int[] arr2 = {10,15,4,3,44,12,59,23}; 
        //int[] arr3 = {2,5,4,7,1,9,12,15,20};
        System.out.println(BUBBLESORT(arr1));
    }
}
