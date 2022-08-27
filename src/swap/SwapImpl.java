package swap;

public class SwapImpl<T extends Integer> implements Swap<T> {
    @Override
    public void swap(T[] array, int i, int j) {
        if (i == j) {
            return;
        }

        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
