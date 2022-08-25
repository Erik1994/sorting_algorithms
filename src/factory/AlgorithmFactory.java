package factory;

import algorithm.Algorithm;

public abstract class AlgorithmFactory<T extends Integer> {
    public abstract Algorithm<T> createAlgorithm();
}
