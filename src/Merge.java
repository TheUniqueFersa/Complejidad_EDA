public class Merge extends AlgoritmoOrdenamiento {
    public Merge(int[] arr) {
        super(arr);
    }
    protected Resultado sort() {
        mergeSort(0, this.arr.length-1);
        Resultado res = new Resultado("MergeSort", operaciones, comparaciones, intercambios, inserciones, arr, arr.length);
        resultados.add(res);
        return res;
    }

    private void mergeSort(int left, int right) {
        operaciones++;
        if (left < right) {
            int mid = (left + right) / 2;
            operaciones+=3;

            mergeSort(arr, left, mid);

            operaciones++;
            mergeSort(arr, mid + 1, right);

            operaciones++;
            merge(left, mid, right);
        }
    }
    private void merge(int left, int mid, int right) {
        int n1 = mid - left + 1;
        operaciones+=3;
        int n2 = right - mid;
        operaciones+=2;

        int L[] = new int[n1];
        int R[] = new int[n2];
        operaciones+=2;

        operaciones+=2;
        for (int i = 0; i < n1; ++i, operaciones+=3){
            L[i] = arr[left + i];
            operaciones+=4;
        }
        operaciones+=2;
        for (int j = 0; j < n2; ++j, operaciones+=3){
            R[j] = arr[mid + 1 + j];
            operaciones+=5;
        }

        int i = 0, j = 0;
        operaciones+=2;

        int k = left;
        operaciones++;

        operaciones+=3;
        while (i < n1 && j < n2) {
            
            operaciones+=3;
            comparaciones++;
            if (L[i] <= R[j]) {
                operaciones+=3;
                intercambios++;
                arr[k] = L[i];
                i++;
                operaciones+=2;
            } else {
                operaciones+=3;
                intercambios++;
                arr[k] = R[j];
                j++;
                operaciones+=2;
            }
            k++;
            operaciones+=2;

            operaciones+=3;
        }
        operaciones++;
        while (i < n1) {
            intercambios++;
            arr[k] = L[i];
            operaciones+=3;
            i++;
            k++;
            operaciones+=4;

            operaciones++;
        }
        operaciones++;
        while (j < n2) {
            intercambios++;
            arr[k] = R[j];
            operaciones+=3;
            j++;
            k++;
            operaciones+=4;

            operaciones++;
        }
    }

    //STATIC
    public static void mergeSort(int arr[], int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            merge(arr, left, mid, right);
        }
    }
    private static void merge(int arr[], int left, int mid, int right) {
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
}
