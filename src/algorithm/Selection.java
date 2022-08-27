package algorithm;

import swap.Swap;

public class Selection<T extends Integer> extends Algorithm<T> {
    private final Swap<T> swap;

    public Selection(Swap<T> swap) {
        this.swap = swap;
    }

    @Override
    public void sort(T[] array) {
        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; --lastUnsortedIndex) {
            T max = array[0];
            int maxIndex = 0;
            for (int i = 1; i < lastUnsortedIndex; ++i) {
                if (array[i].compareTo(max) > 0) {
                    max = array[i];
                    maxIndex = i;
                }
            }
            swap.swap(array, maxIndex, lastUnsortedIndex);
        }
    }
}
