package day03;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CaesarTest {

    @Test
    void testEncrypts() {
        Caesar ceasar = new Caesar(3);
        assertEquals("DEF", ceasar.encrypts("abc"));
    }

}