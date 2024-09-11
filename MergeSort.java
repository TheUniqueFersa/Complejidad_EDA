public class MergeSort {

    public static void mergeSort(int arr[], int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            MergeSort.mergeSort(arr, left, mid);
            MergeSort.mergeSort(arr, mid + 1, right);

            Utilerias.merge(arr, left, mid, right);
        }
    }
}
