public class HeapSort {
    public void heapSort(int[] A) {
        Utilerias.buildHeap(A);
        int size = A.length;
        for (int i = size - 1; i > 0; i--) {
            Utilerias.intercambiar(A, 0, i);
            Utilerias.heapify(A, 0, i - 1);
        }
    }
}
