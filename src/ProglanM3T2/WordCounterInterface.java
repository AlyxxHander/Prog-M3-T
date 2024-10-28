package ProglanM3T2;

import java.util.Map;

/**
 * Kelas ini digunakan sebagai sebuah interface atau blueprint terkait apa yang wajib diperlukan untuk WordCounter.
 */
public interface WordCounterInterface {
    String[] splitTextIntoWords(String text);
    Map<String, Integer> countWords(String text);
    void updateWordCount(Map<String, Integer> wordCountMap, String word);
    void displayWordCount(Map<String, Integer> wordCount);
}