import algorithm.Algorithm;
import factory.AlgorithmFactory;
import factory.BubbleSortFactory;
import factory.SelectionSortFactory;
import manager.AbstractSortingManager;
import manager.SortingManager;

public class Main {
    public static void main(String[] args) {
        Integer[] arrayToSort = {56, 21, 11, 2, 7, 14, 11, 1};

        AlgorithmFactory<Integer> algorithmFactory = new BubbleSortFactory<Integer>();
        Algorithm<Integer> algorithm = algorithmFactory.createAlgorithm();
        AbstractSortingManager<Integer> manager = new SortingManager<Integer>(algorithm);

        manager.sort(arrayToSort);
        manager.printArray(arrayToSort);

        algorithmFactory = new SelectionSortFactory<Integer>();
        algorithm = algorithmFactory.createAlgorithm();

        manager.setAlgorithm(algorithm);
        manager.sort(arrayToSort);
        manager.printArray(arrayToSort);


    }
}
