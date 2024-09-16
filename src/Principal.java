//import Burbuja;


public class Principal {
    public static void main(String args[]){
        int tam = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int[] arr = new int[tam];
        Utilerias.randomArr(arr, tam);

        System.out.println("Arreglo original: ");
        // Utilerias.imprimirArreglo(arr);


        //Creacion de los objetos
        // Insercion objInsercion = new Insercion(arr);
        Burbuja bubble = new Burbuja(arr);
        Seleccion selection = new Seleccion(arr);
        Insercion insertion = new Insercion(arr);
        Heap heap = new Heap(arr);
        Quick quick = new Quick(arr);
        Merge merge = new Merge(arr);
        for(int i = 0; i < n; i++){
            bubble.calcularOperaciones();
            selection.calcularOperaciones();
            insertion.calcularOperaciones();
            heap.calcularOperaciones();
            quick.calcularOperaciones();
            merge.calcularOperaciones();

            Utilerias.randomArr(arr, tam);
            // Utilerias.imprimirArreglo(arr);
            bubble.inicializarArr(arr);
            selection.inicializarArr(arr);
            insertion.inicializarArr(arr);
            heap.inicializarArr(arr);
            quick.inicializarArr(arr);
            merge.inicializarArr(arr);
        }
        System.out.println("--- BubbleSort ---");
        for(Resultado r: bubble.resultados){
            // r.mostrarResultados();
            r.escribirOperacionesEnArchivo();
            System.out.println();
        }
        System.out.println("--- SelectionSort ---");
        for(Resultado r: selection.resultados){
            // r.mostrarResultados();
            r.escribirOperacionesEnArchivo();
            System.out.println();
        }
        System.out.println("--- InsertionSort ---");
        for(Resultado r: insertion.resultados){
            // r.mostrarResultados();
            r.escribirOperacionesEnArchivo();
            System.out.println();
        }
        System.out.println("--- HeapSort ---");
        for(Resultado r: heap.resultados){
            // r.mostrarResultados();
            r.escribirOperacionesEnArchivo();
            System.out.println();
        }
        System.out.println("--- QuickSort ---");
        for(Resultado r: quick.resultados){
            // r.mostrarResultados();
            r.escribirOperacionesEnArchivo();
            System.out.println();
        }
        System.out.println("--- MergeSort ---");
        for(Resultado r: merge.resultados){
            // r.mostrarResultados();
            r.escribirOperacionesEnArchivo();
            System.out.println();
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

















