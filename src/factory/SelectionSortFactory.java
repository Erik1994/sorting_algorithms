package factory;

import algorithm.Algorithm;
import algorithm.Selection;
import swap.SwapImpl;

public class SelectionSortFactory<T extends Integer> extends AlgorithmFactory<T> {
    @Override
    public Algorithm<T> createAlgorithm() {
        return new Selection<T>(new SwapImpl<T>());
    }
}
