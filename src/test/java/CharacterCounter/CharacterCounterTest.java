package CharacterCounter;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CharacterCounterTest {


    @Test
    public void testValidWords() {
        assertTrue(CharacterCounter.validateWord("abcabc"));
        assertTrue(CharacterCounter.validateWord("Abcabc"));
        assertTrue(CharacterCounter.validateWord("AbcCBa"));
        assertTrue(CharacterCounter.validateWord("?!?!?!"));
        assertTrue(CharacterCounter.validateWord("abc123"));
        assertTrue(CharacterCounter.validateWord("abc!abc!"));
    }

    @Test
    public void testInvalidWords() {
        assertFalse(CharacterCounter.validateWord("AbcabcC"));
        assertFalse(CharacterCounter.validateWord("pippi"));
        assertFalse(CharacterCounter.validateWord("abcabcd"));
        assertFalse(CharacterCounter.validateWord("?abc:abc"));
    }
}