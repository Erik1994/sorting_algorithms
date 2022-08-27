package algorithm;

import swap.Swap;

public class Selection<T extends Integer> extends Algorithm<T> {
    private final Swap<T> swap;

    public Selection(Swap<T> swap) {
        this.swap = swap;
        setAlgorithmName("Selection sort");
    }

    @Override
    public void sort(T[] array) {
        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; --lastUnsortedIndex) {
            int maxIndex = 0;
            for (int i = 1; i <= lastUnsortedIndex; ++i) {
                if (array[i].compareTo(array[maxIndex]) > 0) {
                    maxIndex = i;
                }
            }
            swap.swap(array, maxIndex, lastUnsortedIndex);
        }
    }
}
