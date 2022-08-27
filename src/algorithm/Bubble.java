package algorithm;

import swap.Swap;

public class Bubble<T extends Integer> extends Algorithm<T> {
    private final Swap<T> swap;
    public Bubble(Swap<T> swap) {
        this.swap = swap;
    }
    @Override
    public void sort(T[] array) {
        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; --lastUnsortedIndex) {
            for (int i = 0; i < lastUnsortedIndex; ++i) {
                if (array[i].compareTo(array[i + 1]) == 1) {
                    swap.swap(array, i, i + 1);
                }
            }
        }
    }

    private void swap(T[] array, int i, int j) {

    }
}
