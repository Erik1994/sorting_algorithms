package manager;

import algorithm.Algorithm;

public class SortingManager<T extends Integer> implements ISortingManager<T> {
    private Algorithm<T> algorithm;

    public SortingManager(Algorithm<T> algorithm) {
        this.algorithm = algorithm;
    }

    @Override
    public void sort(T[] array) {
        algorithm.sort(array);
    }
}
