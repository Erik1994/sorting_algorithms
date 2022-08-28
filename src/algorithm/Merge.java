package algorithm;

public class Merge<T extends Integer> extends Algorithm<T> {

    public Merge() {
        setAlgorithmName("Merge sort");
    }

    @Override
    public void sort(T[] array) {
        mergeSort(array, 0, array.length);
    }

    private void mergeSort(T[] array, int start, int end) {
        if (end - start < 2) {
            return;
        }
        int mid = (start + end) / 2;
        mergeSort(array, start, mid);
        mergeSort(array, mid, end);
        merge(array, start, mid, end);
    }

    private void merge(T[] array, int start, int mid, int end) {
        if (array[mid - 1].compareTo(array[mid]) < 1) {
            return;
        }
        int i = start;
        int j = mid;
        int tempIndex = 0;
        Integer [] temp = new Integer [end - start];
        while (i < mid && j < end) {
            temp[tempIndex++] = array[i].compareTo(array[j]) < 1 ? array[i++] : array[j++];
        }
        System.arraycopy(array, i, array, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, array, start , tempIndex);
    }
}
