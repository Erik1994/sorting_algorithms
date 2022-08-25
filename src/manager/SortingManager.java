package manager;

import algorithm.Algorithm;

public class SortingManager<T extends Integer> extends AbstractSortingManager<T> {

    public SortingManager(Algorithm<T> algorithm) {
        this.algorithm = algorithm;
    }

    @Override
    public void sort(T[] array) {
        algorithm.sort(array);
    }
}
