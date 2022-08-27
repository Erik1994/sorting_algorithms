package manager;

import algorithm.Algorithm;

public abstract class AbstractSortingManager<T extends Integer> {
    protected Algorithm<T> algorithm;

    public abstract void sort(T[] array);
    public void setAlgorithm(Algorithm<T> algorithm) {
        this.algorithm = algorithm;
    }

    public void printArray(T[] array) {
        System.out.println(algorithm.getAlgorithmName());
        for (int i = 0; i < array.length; ++i) {
            if(i < array.length - 1) {
                System.out.print(array[i] + ", ");
            } else  {
                System.out.println(array[i]);
            }
        }
    }
}
