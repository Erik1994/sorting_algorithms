package factory;

import algorithm.Algorithm;
import algorithm.Insertion;

public class InsertionSortFactory<T extends Integer> extends AlgorithmFactory<T> {
    @Override
    public Algorithm<T> createAlgorithm() {
        return new Insertion<T>();
    }
}
