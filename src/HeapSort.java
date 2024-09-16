public class HeapSort {

    
    public void heapSort(int[] A) {
        buildHeap(A);
        int size = A.length;
        for (int i = size - 1; i > 0; i--) {
            Utilerias.intercambiar(A, 0, i);
            heapify(A, 0, i - 1);
        }
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
