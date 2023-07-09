package org.example;

public class Solution {
    /**
     * Finds the maximum number of words in the given array of sentences.
     *
     * @param sentences an array of strings representing sentences
     * @return the maximum number of words found in any sentence
     */
    public int mostWordsFound(String[] sentences) {
        int max = 0;

        for (String sentence : sentences) {
            max = Math.max(max, sentence.split(" ").length);
        }

        return max;
    }
}
