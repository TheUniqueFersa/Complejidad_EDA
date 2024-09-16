//import Burbuja;


public class Principal {
    public static void main(String args[]){
        int tam = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int[] arr = new int[tam];
        Utilerias.randomArr(arr, tam);

        System.out.println("Arreglo original: ");
        Utilerias.imprimirArreglo(arr);


        //Creacion de los objetos
        // Insercion objInsercion = new Insercion(arr);
        Burbuja b1 = new Burbuja(arr);
        for(int i = 0; i < n; i++){
            b1.calcularOperaciones();

            Utilerias.randomArr(arr, tam);
            b1.inicializarArr(arr);
        }
        for(Resultado r: b1.resultados){
            r.mostrarResultados();
        }

        // Seleccion objSeleccion = new Seleccion(arr);

        // MergeSort objMergeSort = new MergeSort();
        // QuickSort objQuickSort = new QuickSort();
        // HeapSort objHeapSort = new HeapSort();

        // objHeapSort.heapSort(arr1);
        // System.out.println("heap");
        // Utilerias.imprimirArreglo(arr1);        
    }  
    
   
}

















