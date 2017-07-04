package com.example.user.week07_day02_word_counter;

/**
 * Created by user on 04/07/2017.
 */

public class WordList {
    String trimmedWords;

    public WordList(String text) {
        this.trimmedWords = text.trim();
    }

    public int countWords() {
        int words = trimmedWords.isEmpty() ? 0 : trimmedWords.split("\\s+").length;
        return words;
    }

}
