import java.util.Scanner;
import java.util.List;
import java.util.Random;

public class Utilerias {
    public static void llenarArreglo(int[] arreglo, int n){
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            arreglo[i] =  random.nextInt(600)+1;
        }
    }

    public static void imprimirArreglo(int[] arreglo){
        for(int i:arreglo){  
            System.out.print(i+" ");  
        }
        System.out.println(" ");
    }
    

    public static void imprimirArregloChar(char[] arreglo){
        for(char i:arreglo){  
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
    public static void pedirDatos(char[] arr, int tamano){
        Scanner en = new Scanner(System.in);
        for (int i = 0; i < tamano; i++) {
            System.out.println("Valor: "+ (i+1));
            arr[i] = en.next().charAt(0);
        }
        en.close();
    }
    

    public static void merge(int arr[], int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0;

        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
/*        System.out.print("Arreglo L: ");
        MergeSort.printArray(L);
        System.out.print("Arreglo R: ");
        MergeSort.printArray(R);*/
        //System.out.print("arr: ");
        //MergeSort.printArray(arr);
        Utilerias.imprimirArreglo(arr);
        //System.out.println();
    }

    public static void fillZeros(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }
    }
    public static void fillChar(char[] arr){
        for (int i = 0; i < arr.length; i++) {       
            arr[i] = '-';                          
        }
    }

    public static int letraANumero(char letra) {
        switch (letra) {
            case 'A':     
                return 0;
            case 'B':
                return 1;
            case 'C':
                return 2;
            case 'D':
                return 3;
            case 'E':
                return 4;
            case 'F':
                return 5;
            case 'G':
                return 6;
            case 'H':
                return 7;
            case 'I':
                return 8;
            case 'J':
                return 9;
            default:
                return 10;
        }
    }

    public static void restore(char[] res, int[] count, char letra){
        int indice = Utilerias.letraANumero(letra);
        int llenado = count[indice] -1;
        while(res[llenado] != '-'){
            llenado--;
        }
        res[llenado] = letra;

    }

    //HEapSort heapify buildhwap
    public static void heapify(int[] A, int i, int size) {
        int l = 2 * i + 1; // nodo hijo izq
        int r = 2 * i + 2; // nodo hijo der
        int largest;
        if (l <= size && A[l] > A[i]) {
            largest = l;
        } else {
            largest = i;
        }
        if (r <= size && A[r] > A[largest]) {
            largest = r;
        }
        if (largest != i) {
            Utilerias.intercambiar(A, i, largest);
            Utilerias.heapify(A, largest, size);
        }
    }
    public static void buildHeap(int[] A) {
        int size = A.length;
        for (int i = (size - 1) / 2; i >= 0; i--) {
            Utilerias.heapify(A, i, size - 1);
            //printArray(A);
        }
    }
}
