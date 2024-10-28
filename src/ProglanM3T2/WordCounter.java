package ProglanM3T2;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Kelas ini digunakan sebagai main function dari WordCounter
 */
public class WordCounter implements WordCounterInterface {
    /**
     * Method yang digunakan untuk menghitung text yang sudah diinputkan.
     *
     * @param text text yang akan dihitung.
     * @return wordCountMap atau hasil penghitungan kata.
     */
    @Override
    public Map<String, Integer> countWords(String text) {
        Map<String, Integer> wordCountMap = new LinkedHashMap<>();
        String[] wordArray = splitTextIntoWords(text);

        for (String word : wordArray) {
            updateWordCount(wordCountMap, word);
        }

        return wordCountMap;
    }

    /**
     * Method yang digunakan untuk memecah text menjadi beberapa kata-kata.
     *
     * @param text yang perlu dipecah.
     * @return sejumlah kata yang sudah di split dari text
     */
    @Override
    public String[] splitTextIntoWords(String text) {
        return text.split("\\W+");
    }

    /**
     * Method yang digunakan untuk mengupdate jumlah kata.
     *
     * @param wordCountMap merupakan parameter pertama berupa list kata
     * @param word merupakan parameter kedua berupa kata yang perlu diupdate
     */
    @Override
    public void updateWordCount(Map<String, Integer> wordCountMap, String word) {
        wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
    }

    /**
     * Method yang digunakan untuk mendisplay tiap kata dari text.
     *
     * @param wordCount berupa jumlah kata
     */
    @Override
    public void displayWordCount(Map<String, Integer> wordCount) {
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

//    public int getTotalWordCount(Map<String, Integer> wordCountMap) {
//        int totalCount = 0;
//        for(int count : wordCountMap.values()) {
//            totalCount += count;
//        }
//
//        return totalCount;
//    }
}
