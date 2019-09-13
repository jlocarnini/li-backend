package com.labelinsight.pangram;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class PangramChecker_Test {

    @Test
    public void quickBrownFox() {
        System.out.println("Testing - A quick brown fox jumps over the lazy dog");
        PangramChecker pangramChecker = new PangramChecker();

        Assertions.assertEquals(pangramChecker.getMissingLetters("A quick brown fox jumps over the lazy dog"), "");
    }

    @Test
    public void slowYellowFox() {
        System.out.println("Testing - A slow yellow fox crawls under the proactive dog");
        PangramChecker pangramChecker = new PangramChecker();

        Assertions.assertEquals(pangramChecker.getMissingLetters("A slow yellow fox crawls under the proactive dog"), "bjkmqz");
    }

    @Test
    public void lionsTigersBears() {
        System.out.println("Testing - Lions, and tigers, and bears, oh my!");
        PangramChecker pangramChecker = new PangramChecker();

        Assertions.assertEquals(pangramChecker.getMissingLetters("Lions, and tigers, and bears, oh my!"), "cfjkpquvwxz");
    }

    @Test
    public void emptyString() {
        System.out.println("Testing - <empty string>");
        PangramChecker pangramChecker = new PangramChecker();

        Assertions.assertEquals(pangramChecker.getMissingLetters(""), "abcdefghijklmnopqrstuvwxyz");
    }
}
