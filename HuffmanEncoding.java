package Huffman;
import java.util.*;

/**
 * HuffmanEncoding class
 */
public class HuffmanEncoding {

    private static String sourceText;
    private static Map<Character, Double> frequencyMap = new TreeMap<>();
    private static Map<Character, String> characterEncodings = new HashMap<>();
    private static Queue<HuffmanNode> tree = new PriorityQueue<>();

    /**
     * @param sourceText constructor
     */
    public HuffmanEncoding(String sourceText) {

        this.sourceText = sourceText;
        analyzeText();

    }

    private void analyzeText() {

        for (int i = 0; i < sourceText.length(); i++) {
            if (frequencyMap.containsKey(sourceText.charAt(i))) {
                frequencyMap.put(sourceText.charAt(i), frequencyMap.get(sourceText.charAt(i)) + (1.0 / sourceText.length()));
            }
            else {
                frequencyMap.put(sourceText.charAt(i), 1.0 / sourceText.length());
            }

            /*System.out.println(frequencyMap);*/
        }

        for (int i = 0; i < frequencyMap.size(); i++) {
            for (char key : frequencyMap.keySet()) {
                tree.add(new HuffmanNode(key, frequencyMap.get(key), null, null));
            }
        }
    }

    /**
     * Print the character frequencies
     */
    public void printCharacterFrequencies() {

        for (char key : frequencyMap.keySet()) {
            String value = frequencyMap.get(key).toString();
            System.out.println(key + " -> " + value);
        }
        System.out.println();
    }

    /**
     * @return Encoding the items
     */
    public String encode() {

        HuffmanNode root = null;
        HuffmanNode first = null;
        HuffmanNode second = null;
        StringBuilder returnString = new StringBuilder();

        while (tree.size() != 1) {
            first = tree.poll();
            second = tree.poll();
            root = new HuffmanNode('\u0000', (first.getProbability() + second.getProbability()), first, second);
            tree.add(root);
        }

        return null;
    }

    /**
     * @param encodedText
     * @return Got through tree and decode items
     */
    public String decode(String encodedText) {

        return null;
    }
}
