package Huffman;

/**
 * HuffmanNode Comparable helper class
 */
public class HuffmanNode implements Comparable<HuffmanNode> {

    private char data;
    private double probability;
    private HuffmanNode left;
    private HuffmanNode right;

    /**
     * Constructor class
     * @param data
     * @param prob
     * @param left
     * @param right
     */
    public HuffmanNode(char data, double prob, HuffmanNode left, HuffmanNode right) {
        this.data = data;
        probability = prob;
        this.left = left;
        this.right = right;
    }

    @Override
    public int compareTo(HuffmanNode other) {
        // return probability - other;
        return 0;
    }

    /**
     * Return the probability
     * @return
     */
    public double getProbability() {
        return probability;
    }

    /**
     * Set the probability
     * @param probability
     */
    public void setProbability(double probability) {
        this.probability = probability;
    }

    @Override
    public String toString() {
        return "HuffmanNode{" +
                "data=" + data +
                ", probability=" + probability +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
