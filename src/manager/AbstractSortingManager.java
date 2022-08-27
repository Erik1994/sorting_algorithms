package manager;

import algorithm.Algorithm;

public abstract class AbstractSortingManager<T extends Integer> {
    protected Algorithm<T> algorithm;

    public abstract void sort(T[] array);
}
