import java.util.ArrayList;
import java.util.List; 
public class CountingSort {

    public static void countingSort(char[] arr) {
        int elem;
        int n = arr.length;
        int max = 10;
        int[] count = new int[max];
        char[] res = new char[n];

        Utilerias.fillZeros(count);
        Utilerias.fillChar(res);
        for(int j=0; j<n;j++){
            elem = Utilerias.letraANumero(arr[j]);
            count[elem]++;
        }
        System.out.println("Arreglo con las apariciones de cada elemento:");
        Utilerias.imprimirArreglo(count);
        for (int i = 1; i < max; i++) {
            count[i] = count[i]+count[i-1];
        }
        System.out.println("Arreglo con la suma de cada elemento: ");
        Utilerias.imprimirArreglo(count);
        
        for (int j = n-1; j>=0; j--){
            Utilerias.restore(res, count, arr[j]);
            Utilerias.imprimirArregloChar(res);
        }
        
        Utilerias.imprimirArregloChar(res);
    }
}
