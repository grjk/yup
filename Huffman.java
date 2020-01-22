package Huffman;

import java.util.Scanner;

/**
 * Huffman assignment
 * Joshua Kristiansen
 */
public class Huffman {

    private static String inputString = "";

    /**
     * @param args mmethod to run the Huffman code
     */
    public static void main(String[] args) {

        double start = System.currentTimeMillis();
        welcomeUser();

        HuffmanEncoding encoding = new HuffmanEncoding(inputString);
        encodeAndDecodeString(encoding);
        encoding.printCharacterFrequencies();

        showResults();
        double finish = System.currentTimeMillis();
        System.out.println("**EXTRA** Total elapsed milliseconds since program start: " + (finish - start) / 1000);
    }

    private static void welcomeUser() {

        System.out.println("Welcome to my Huffman Encoding Program!");
        System.out.println("***************************************");
        System.out.print("Please entire a string: ");

        Scanner userInput = new Scanner(System.in);
        inputString = userInput.nextLine();
    }

    private static void encodeAndDecodeString(HuffmanEncoding encoding) {
        encoding.encode();
        encoding.toString();
    }

    private static void showResults() {

        System.out.println("Original text: " + inputString);
        System.out.println("Original text length: " + (inputString.length() * 8) + " - " + (inputString.length() * 16) +
                " bits");
    }

    private static void countFrequencies() {

        for (int i = 0; i < inputString.length(); i++) {

        }
    }
}
