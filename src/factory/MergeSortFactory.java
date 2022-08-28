package factory;

import algorithm.Algorithm;
import algorithm.Merge;

public class MergeSortFactory<T extends Integer> extends AlgorithmFactory<T> {
    @Override
    public Algorithm<T> createAlgorithm() {
        return new Merge<T>();
    }
}
