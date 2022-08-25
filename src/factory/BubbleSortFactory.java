package factory;

import algorithm.Algorithm;
import algorithm.Bubble;

public class BubbleSortFactory<T extends Integer> extends AlgorithmFactory<T> {
    @Override
    public Algorithm<T> createAlgorithm() {
        return new Bubble<T>();
    }
}
