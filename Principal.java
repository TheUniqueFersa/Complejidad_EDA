//import Burbuja;


public class Principal {
    
    public static void main(String args[]){
        int size = 15;
        int[] arr1 = new int[size];

        Utilerias.llenarArreglo(arr1, size);
        Utilerias.imprimirArreglo(arr1);


        //Creacion de los objetos
        Insercion objInsercion = new Insercion();
        Burbuja obkBurbuja = new Burbuja();
        Seleccion objSeleccion = new Seleccion();

        MergeSort objMergeSort = new MergeSort();
        QuickSort objQuickSort = new QuickSort();
        //Heap
        
        Utilerias.imprimirArreglo(arr1);        
    }  
    
   
}

















