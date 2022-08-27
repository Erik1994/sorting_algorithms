package factory;

import algorithm.Algorithm;
import algorithm.Bubble;
import swap.SwapImpl;

public class BubbleSortFactory<T extends Integer> extends AlgorithmFactory<T> {
    @Override
    public Algorithm<T> createAlgorithm() {
        return new Bubble<T>(new SwapImpl<T>());
    }
}
