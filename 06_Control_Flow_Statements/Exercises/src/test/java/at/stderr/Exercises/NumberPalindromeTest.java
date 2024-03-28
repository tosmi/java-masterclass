package at.stderr.Exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NumberPalindromeTest {
    @Test
    public void shouldReturnPalindrome() {
        assertEquals(NumberPalindrome.palindrome(321), 123);
        assertEquals(NumberPalindrome.palindrome(1211), 1121);
        assertEquals(NumberPalindrome.palindrome(-222), 222);
    }

    public void shouldBeAPalindrome() {
        assertTrue(NumberPalindrome.isPlaindrom(1221));
        assertTrue(NumberPalindrome.isPlaindrom(-222));
    }
}
