package day02;

import java.util.ArrayList;
import java.util.List;

public class StringLists {

    public List<String> shortestWords(List<String> words) {
        int shortestLength = getShortestLength(words);
        List<String> shortestWords = new ArrayList<>();
        for (String word : words) {
            if (word.length() == shortestLength) {
                shortestWords.add(word);
            }
        }
        return shortestWords;
    }

    private int getShortestLength(List<String> listToCheck) {
        int shortestLength;
        if (listToCheck.isEmpty()) {
            shortestLength = 0;
        } else {
            shortestLength = listToCheck.get(0).length();
        }
        for (String word : listToCheck) {
            if (word.length() <= shortestLength) {
                shortestLength = word.length();
            }
        }
        return shortestLength;
    }
}
