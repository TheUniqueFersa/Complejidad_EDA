//import Burbuja;


public class Principal {
    
    public static void main(String args[]){
        int size = Integer.parseInt(args[0]);
        int[] arr = new int[size];
        Utilerias.llenarArreglo(arr, size);

        System.out.println("Arreglo original: ");
        Utilerias.imprimirArreglo(arr);


        //Creacion de los objetos
        Insercion objInsercion = new Insercion(arr);
        Burbuja objBurbuja = new Burbuja(arr);
        Seleccion objSeleccion = new Seleccion(arr);

        MergeSort objMergeSort = new MergeSort(arr);
        QuickSort objQuickSort = new QuickSort(arr);
        //Heap

        objBurbuja.bub
        
        Utilerias.imprimirArreglo(arr1);        
    }  
    
   
}

















