package com.example.user.week07_day02_word_counter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by user on 04/07/2017.
 */

public class WordListTest {

    WordList wordlist;

    @Before
    public void before() {
        wordlist = new WordList(" abc def ghi jkl ");
    }

    @Test
    public void canCountWords() {
        assertEquals(4, wordlist.countWords());
    }

}
