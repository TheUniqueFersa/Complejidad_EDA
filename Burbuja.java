/*
    Comparaciones
    Intercambios
    Inserciones

 */

public class Burbuja extends AlgoritmoOrdenamiento{
    
    public Burbuja(int[] arr){
        super(arr);
    }
    protected void ordenar() {
        bubbleSort(this.arr);
    }
    
    public int bubbleSort(int[] array) {
        boolean cambio;
        int n = array.length;
        operaciones+=2;

        operaciones++; //inicializa i = n
        operaciones++; //para la comparacion
        for (int i=n; i > 0; i--, operaciones+=2) {//para el decremento del i del for
            

            cambio=false;
            operaciones++;

            operaciones++;
            operaciones+=2; //para la comparacion
            for (int j=0; j < i-1; j++, operaciones+=3) {

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
