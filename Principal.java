public class Principal {
    
    public static void main(String args[]){  
        //int[] arr1 = {9,14,3,2,43,11,58,22}; 
        //int[] arr2 = {10,15,4,3,44,12,59,23}; 
        //int[] arr3 = {2,5,4,7,1,9,12,15,20};
  //      Utilerias.pedirDatos(arr1, 20);
    //    Utilerias.imprimirArreglo(arr1);
        //char[] arr1 = {'A','J','B','F','A','H','B','F','A','J',
         //           'I','D','H','A','C','H','F','C','D','I'};
        char[] arr1 = new char[20];
        Utilerias.pedirDatos(arr1, 20);

/*        System.out.println("Arreglos Originales");  
        Utilerias.imprimirArreglo(arr1);
        Utilerias.imprimirArreglo(arr2);
        Utilerias.imprimirArreglo(arr3);
        //Inercion
        Insercion.insertionSort(arr1);
        //Seleccion
        Seleccion seleccion = new Seleccion();   
        seleccion.selectionSort(arr2);  
        //Burbuja
        Burbuja.bubbleSort(arr3);
       
             
        System.out.println("Arreglos ordenados");  
        Utilerias.imprimirArreglo(arr1);
        Utilerias.imprimirArreglo(arr2);
        Utilerias.imprimirArreglo(arr3);
        System.out.println("Arreglo 1: ");
        Utilerias.imprimirArreglo(arr1);
        //MergeSort
        MergeSort mergesort = new MergeSort();
        mergesort.mergeSort(arr1, 0, arr1.length-1);*/

        //CountingSort
        System.out.println("Arreglo desordenado; ");
        Utilerias.imprimirArregloChar(arr1);
        CountingSort countingsort = new CountingSort();
        countingsort.countingSort(arr1);
        
    }  
    
   
}

















