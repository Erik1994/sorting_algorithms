package algorithm;

public abstract class Algorithm<T extends Integer> {
    private String algorithmName;

    public abstract void sort(T[] array);

    protected void setAlgorithmName(String algorithmName) {
        this.algorithmName = algorithmName;
    }

    public String getAlgorithmName() {
        return algorithmName;
    }
}
