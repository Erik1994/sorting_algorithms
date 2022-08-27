package swap;

public interface Swap<T extends Integer> {
    void swap(T[] array, int i, int j);
}
