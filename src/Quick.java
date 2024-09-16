
public class Quick extends AlgoritmoOrdenamiento{
    public Quick(int[] arr){
        super(arr);
    }
    public Quick(){
    }
    protected Resultado sort() {
        QuickSort(0, this.arr.length-1);
        Resultado res = new Resultado("QuickSort", operaciones, comparaciones, intercambios, inserciones, arr, arr.length);
        resultados.add(res);
        return res;
    }
    private int partition(int low, int high){
        int pivot = arr[high];
        operaciones+=2;
        int i = (low-1);
        operaciones+=2;

        operaciones+=2;
        for (int j=low; j<high; j++, operaciones+=3){ 
            operaciones+=2;
            comparaciones++;
            if (arr[j] <= pivot){
                operaciones+=2;
                i++;
                operaciones+=7;
                intercambios++;
                Utilerias.intercambiar(arr, i,j);
            }
        }
        int temp = arr[i+1];
        operaciones+=3;

        arr[i+1] = arr[high];
        operaciones+=4;
        intercambios++;

        arr[high] = temp;
        operaciones+=2;
        intercambios++;

        operaciones++;
        return i+1;
    }
    private void QuickSort(int low, int high){
        operaciones++;
        if (low < high){
            operaciones++;
            int pi = partition(low, high);
            operaciones++;
            QuickSort(low, pi-1);

            operaciones++;
            QuickSort(pi+1, high);
        }
    }

    //STATIC
    public static int partition(int arr[], int low, int high){
        int pivot = arr[high];
        int i = (low-1);
        for (int j=low; j<high; j++){ 
            if (arr[j] <= pivot){
                i++;
                Utilerias.intercambiar(arr, i,j);
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    }

    public static void sort(int arr[], int low, int high){
        if (low < high){
            int pi = partition(arr, low, high);
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }
}
