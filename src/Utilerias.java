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

    
}
