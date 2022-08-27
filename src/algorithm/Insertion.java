package algorithm;

public class Insertion<T extends Integer> extends Algorithm<T> {

    public Insertion() {
        setAlgorithmName("Insertion sort");
    }
    @Override
    public void sort(T[] array) {
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < array.length; ++firstUnsortedIndex) {
            T newItem = array[firstUnsortedIndex];
            int i;
            for (i = firstUnsortedIndex; i > 0 && array[i - 1].compareTo(newItem) > 0; --i) {
                array[i] = array[i - 1];
            }
            array[i] = newItem;
        }
    }
}
