import algorithm.Algorithm;
import factory.AlgorithmFactory;
import factory.BubbleSortFactory;
import manager.ISortingManager;
import manager.SortingManager;

public class Main {
    public static void main(String[] args) {
        Integer[] arrayToSort = {56, 21, 11, 2, 7, 14, 11, 1};
        AlgorithmFactory<Integer> algorithmFactory = new BubbleSortFactory<Integer>();
        Algorithm<Integer> algorithm = algorithmFactory.createAlgorithm();
        ISortingManager<Integer> manager = new SortingManager<Integer>(algorithm);
        manager.sort(arrayToSort);

        printArray(arrayToSort);
    }

    public static <T> void printArray(T[] array) {
        for (T bigDecimal : array) {
            System.out.println(bigDecimal);
        }
    }
}
