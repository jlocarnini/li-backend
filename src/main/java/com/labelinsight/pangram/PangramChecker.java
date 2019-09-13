package com.labelinsight.pangram;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PangramChecker {

    // iterate over the ascii values for all lowercase
    // characters and add to the set
    private static final HashSet<Character> asciiLowerCase = IntStream.range(97, 123).boxed()
            .map(c -> (char)c.intValue()).collect(Collectors.toCollection(HashSet::new));
    // regex for alpha input
    private static final String regex = "[^a-z]";

    public String getMissingLetters(String input) {
        // shallow copy the lowercase ascii set
        Set<Character> allCharacters = (HashSet<Character>) asciiLowerCase.clone();
        // get the lowercase version of the input, stripped down to letters.
        // may be inefficient for huge inputs, potentially would rethink
        // if that was common - possible to process the string in chunks
        String strippedInput = input.toLowerCase().replaceAll(regex, "");

        // iterate over all characters and remove from the set
        // we will either run out of characters in the set and return empty
        // or we'll complete the string and return the remaining characters
        for (int i = 0; i < strippedInput.length(); i++) {
            allCharacters.remove(strippedInput.charAt(i));
            if (allCharacters.size() == 0)
                return "";
        }

        // stream the remaining characters into a string and return
        StringBuilder remainingCharacters = new StringBuilder();
        allCharacters.stream().sorted().forEach(c -> remainingCharacters.append(c));
        return remainingCharacters.toString();

    }

}
