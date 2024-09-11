public class MergeSort {

    public void mergeSort(int arr[], int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            Utilerias.merge(arr, left, mid, right);
        }
    }
}
