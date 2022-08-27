import algorithm.Algorithm;
import factory.AlgorithmFactory;
import factory.BubbleSortFactory;
import factory.InsertionSortFactory;
import factory.SelectionSortFactory;
import manager.AbstractSortingManager;
import manager.SortingManager;

public class Main {
    public static void main(String[] args) {
        Integer[] bubbleSortArray = {56, 21, 11, 2, 7, 14, 11, 1};

        AlgorithmFactory<Integer> algorithmFactory = new BubbleSortFactory<Integer>();
        Algorithm<Integer> algorithm = algorithmFactory.createAlgorithm();
        AbstractSortingManager<Integer> manager = new SortingManager<Integer>(algorithm);

        manager.sort(bubbleSortArray);
        manager.printArray(bubbleSortArray);

        Integer[] selectionSortArray = {56, 21, 11, 2, 7, 14, 11, 1};
        algorithmFactory = new SelectionSortFactory<Integer>();
        algorithm = algorithmFactory.createAlgorithm();

        manager.setAlgorithm(algorithm);
        manager.sort(selectionSortArray);
        manager.printArray(selectionSortArray);

        Integer[] insertionSortArray = {56, 21, 11, 2, 7, 14, 11, 1};
        algorithmFactory = new InsertionSortFactory<Integer>();
        algorithm = algorithmFactory.createAlgorithm();

        manager.setAlgorithm(algorithm);
        manager.sort(insertionSortArray);
        manager.printArray(insertionSortArray);

    }
}
