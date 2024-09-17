/*
* == PROYECTO 1. COMPLEJIDAD COMPUTACIONAL EN LOS ALGORITMOS DE ORDENAMIENTO | EDA II 2025-1. UNIVERSIDAD NACIONAL AUTONOMA DE MEXICO. FACULTAD DE INGENIERIA. == 
 * @autor: Fernando Samuel López Morales 
 * @autor: Luis Adrián González Falcón
 * 
 * Esta clase implementa métodos de utilerias que son utiles y recurrentes en los algoritmos de ordenamiento
 * 
 * última modificación: 16/09/2024
 * @version: 1.0, 2024-09-16
 * 
 * @see Utilerias
 * @see AlgoritmoOrdenamiento
 */
import java.util.Scanner;
import java.util.List;
import java.util.Random;

public class Utilerias {
    public static void randomArr(int[] arreglo, int n){
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            arreglo[i] =  random.nextInt(1000)+1;
        }
    }

    public static void imprimirArreglo(int[] arreglo){
        for(int i:arreglo){  
            System.out.print(i+" ");  
        }
        System.out.println(" ");
    }
    
    //7 operaciones básicas
    public static void intercambiar(int[] arr, int x, int y) {
        int temp = arr[x];  //2 
        arr[x] = arr[y];  //3
        arr[y] = temp; //2
    }    
}
