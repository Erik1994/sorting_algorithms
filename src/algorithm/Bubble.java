package algorithm;

public class Bubble<T extends Integer> extends Algorithm<T> {
    @Override
    public void sort(T[] array) {
        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; --lastUnsortedIndex) {
            for (int i = 0; i < lastUnsortedIndex; ++i) {
                if (array[i].compareTo(array[i + 1]) > 0) {
                    swap(array, i, i + 1);
                }
            }
        }
    }

    private void swap(T[] array, int i, int j) {
        if (i == j) {
            return;
        }

        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
