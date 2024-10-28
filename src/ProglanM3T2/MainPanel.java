package ProglanM3T2;

import java.util.Map;
import java.util.Scanner;

/**
 * Kelas ini digunakan sebagai starting point penjalanan kode.
 *
 * @author Alyxx
 * @version 1.0
 */
public class MainPanel {
    /**
     * Method ini digunakan untuk menjalankan method function dikelas WordCounter
     *
     * @param args merupakan parameter main secara default
     */
    public static void main(String[] args) {
        WordCounter wordCounter = new WordCounter();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan Text: ");
        String text = scanner.nextLine();

        Map<String, Integer> wordCountMap = wordCounter.countWords(text);
        wordCounter.displayWordCount(wordCountMap);
//        System.out.println("Jumlah Kata: " + wordCounter.getTotalWordCount(wordCountMap));

        scanner.close();
    }
}
