//import Bubble;
import java.util.ArrayList;

public class Principal {
    public static void main(String args[]){
        int n = Integer.parseInt(args[0]);
        String[] arg2 = args[1].split(",");
        ArrayList<Integer> tamArr = new ArrayList<>();
        for(int i = 0; i < arg2.length; i++){
            tamArr.add(Integer.parseInt(arg2[i]));
        }
        for(int i = 0; i < tamArr.size(); i++){
            System.out.println("Tamaño del arreglo: "+tamArr.get(i));
        }
        // Utilerias.randomArr(arr, primerTam);
        // Utilerias.imprimirArreglo(arr);
        Bubble bubble = new Bubble();
        Selection selection = new Selection();
        Insertion insertion = new Insertion();
        Heap heap = new Heap();
        Quick quick = new Quick();
        Merge merge = new Merge();
        Bitonic bitonic = new Bitonic();

        int[] arr;
        for (int tam : tamArr) {
            arr = new int[tam];
            for(int i = 0; i < n; i++){
                Utilerias.randomArr(arr, tam);
                // Utilerias.imprimirArreglo(arr);
                bubble.inicializarArr(arr);
                selection.inicializarArr(arr);
                insertion.inicializarArr(arr);
                heap.inicializarArr(arr);
                quick.inicializarArr(arr);
                merge.inicializarArr(arr);
                bitonic.inicializarArr(arr);


                bubble.calcularOperaciones();
                selection.calcularOperaciones();
                insertion.calcularOperaciones();
                heap.calcularOperaciones();
                quick.calcularOperaciones();
                merge.calcularOperaciones();
                bitonic.calcularOperaciones();
            }
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
        System.out.println("--- BitonicSort ---");
        for(Resultado r: bitonic.resultados){
            // r.mostrarResultados();
            r.escribirOperacionesEnArchivo();
            System.out.println();
        }
    }
}