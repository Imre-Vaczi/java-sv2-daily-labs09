package day02;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StringListsTest {

    @Test
    void testShortestWordsValid() {
        List<String> listToCheck = Arrays.asList("a", "bb", "ccc", "dddd", "eeeee", "a", "bb", "ccc", "dddd", "eeeee");
        assertEquals(Arrays.asList("a", "a"), new StringLists().shortestWords(listToCheck));
    }

    @Test
    void testShortestWordsEmpty() {
        List<String> listToCheck = Arrays.asList();
        assertEquals(Arrays.asList(), new StringLists().shortestWords(listToCheck));
    }
}