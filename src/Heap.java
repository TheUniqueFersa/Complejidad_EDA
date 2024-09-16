public class Heap extends AlgoritmoOrdenamiento {
    public Heap(int[] arr) {
        super(arr);
    }
    protected Resultado sort() {
        heapSort();
        Resultado res = new Resultado("HeapSort", operaciones, comparaciones, intercambios, inserciones, arr, arr.length);
        resultados.add(res);
        return res;
    }
    
    private void heapSort() {
        buildHeap();
        int size = arr.length;
        operaciones+=2;

        operaciones+=3;
        for (int i = size - 1; i > 0; i--, operaciones+=3) {
            
            operaciones+=7;
            intercambios++;
            Utilerias.intercambiar(arr, 0, i);
            
            operaciones++; //Operacion aritmetica al pasar parametro
            heapify(0, i - 1);
        }
    }
    //HEapSort heapify buildhwap
    private void heapify(int i, int size) {
        int l = 2 * i + 1; // nodo hijo izq
        operaciones+=3;
        int r = 2 * i + 2; // nodo hijo der
        operaciones+=3;
        int largest;

        operaciones+=5; //para la comparacion
        comparaciones++; //para la comparacion
        if (l <= size && arr[l] > arr[i]) {
            operaciones++;
            largest = l;
        } else {
            operaciones++;
            largest = i;
        }

        operaciones+=5; //para la comparacion
        comparaciones++; //para la comparacion
        if (r <= size && arr[r] > arr[largest]) {
            operaciones++;
            largest = r;
        }

        operaciones++; //para la comparacion
        if (largest != i) {
            operaciones+=7;
            intercambios++;
            Utilerias.intercambiar(arr, i, largest);
            heapify(arr, largest, size);
        }
    }
    private void buildHeap() {
        int size = arr.length;
        operaciones+=2;

        operaciones+=4;
        for (int i = (size - 1) / 2; i >= 0; i--, operaciones+=3) {
            operaciones++;
            heapify(arr, i, size - 1);
            //printArray(A);
        }
    }
    //STATICS
    public static void sort(int[] A) {
        buildHeap(A);
        int size = A.length;
        for (int i = size - 1; i > 0; i--) {
            Utilerias.intercambiar(A, 0, i);
            heapify(A, 0, i - 1);
        }
    }
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
            heapify(A, largest, size);
        }
    }
    public static void buildHeap(int[] A) {
        int size = A.length;
        for (int i = (size - 1) / 2; i >= 0; i--) {
            heapify(A, i, size - 1);
            //printArray(A);
        }
    }
}
