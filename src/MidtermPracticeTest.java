import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class MidtermPracticeTest {

    // =========================================================
    // findLongestWord
    // =========================================================

    @Test
    public void findLongestWord_example() {
        List<String> words = List.of("apple", "banana", "kiwi");
        assertEquals("banana", MidtermPractice.findLongestWord(words));
    }

    @Test
    public void findLongestWord_longestIsFirst() {
        List<String> words = List.of("strawberry", "fig", "mango", "plum");
        assertEquals("strawberry", MidtermPractice.findLongestWord(words));
    }

    @Test
    public void findLongestWord_longestIsLast() {
        List<String> words = List.of("cat", "horse", "dog", "rhinoceros");
        assertEquals("rhinoceros", MidtermPractice.findLongestWord(words));
    }

    @Test
    public void findLongestWord_oneWord() {
        List<String> words = List.of("telescope");
        assertEquals("telescope", MidtermPractice.findLongestWord(words));
    }

    @Test
    public void findLongestWord_emptyList() {
        List<String> words = List.of();
        assertEquals("", MidtermPractice.findLongestWord(words));
    }

    // =========================================================
    // countLongWords
    // =========================================================

    @Test
    public void countLongWords_example() {
        Map<String, Integer> map = Map.of(
                "why", 7,
                "hello", 8,
                "brilliant", 99,
                "world", 15,
                "amazing", 17);
        assertEquals(2, MidtermPractice.countLongWords(map));
    }

    @Test
    public void countLongWords_exactlyFiveIsNotLong() {
        // "tiger" and "ocean" have exactly 5 letters, so they do NOT count.
        // "planet" has 6 letters, so it counts.
        Map<String, Integer> map = Map.of(
                "tiger", 3,
                "ocean", 41,
                "planet", 12);
        assertEquals(1, MidtermPractice.countLongWords(map));
    }

    @Test
    public void countLongWords_allLong() {
        Map<String, Integer> map = Map.of(
                "keyboard", 0,
                "monitor", -6,
                "speaker", 250);
        assertEquals(3, MidtermPractice.countLongWords(map));
    }

    @Test
    public void countLongWords_noneLong() {
        Map<String, Integer> map = Map.of(
                "sun", 1,
                "moon", 2,
                "star", 300);
        assertEquals(0, MidtermPractice.countLongWords(map));
    }

    @Test
    public void countLongWords_emptyMap() {
        Map<String, Integer> map = Map.of();
        assertEquals(0, MidtermPractice.countLongWords(map));
    }

    // =========================================================
    // findAverage
    // =========================================================

    @Test
    public void findAverage_example() {
        float[] arr = {1.5f, 3.5f, 2.0f, 3.0f};
        assertEquals(2.5, MidtermPractice.findAverage(arr), 0.0001);
    }

    @Test
    public void findAverage_notAWholeNumber() {
        // (10.5 + 0.25 + 3.0) / 3 = 13.75 / 3 = 4.58333...
        float[] arr = {10.5f, 0.25f, 3.0f};
        assertEquals(4.583333, MidtermPractice.findAverage(arr), 0.0001);
    }

    @Test
    public void findAverage_withNegatives() {
        // (-4.5 + 2.0 + 7.25 + -0.75) / 4 = 4.0 / 4 = 1.0
        float[] arr = {-4.5f, 2.0f, 7.25f, -0.75f};
        assertEquals(1.0, MidtermPractice.findAverage(arr), 0.0001);
    }

    @Test
    public void findAverage_oneValue() {
        float[] arr = {8.75f};
        assertEquals(8.75, MidtermPractice.findAverage(arr), 0.0001);
    }

    @Test
    public void findAverage_emptyArray() {
        float[] arr = {};
        assertEquals(0.0, MidtermPractice.findAverage(arr), 0.0001);
    }

    // =========================================================
    // countOddNumbers
    // =========================================================

    @Test
    public void countOddNumbers_example() {
        Map<String, Integer> map = Map.of(
                "a", 7,
                "x", 4,
                "z", 5);
        assertEquals(2, MidtermPractice.countOddNumbers(map));
    }

    @Test
    public void countOddNumbers_negativeOddNumbers() {
        // -3 and 11 are odd. -8 and 0 are even.
        Map<String, Integer> map = Map.of(
                "p", -3,
                "q", -8,
                "r", 11,
                "s", 0);
        assertEquals(2, MidtermPractice.countOddNumbers(map));
    }

    @Test
    public void countOddNumbers_allEven() {
        Map<String, Integer> map = Map.of(
                "red", 12,
                "green", 0,
                "blue", -26);
        assertEquals(0, MidtermPractice.countOddNumbers(map));
    }

    @Test
    public void countOddNumbers_allOdd() {
        Map<String, Integer> map = Map.of(
                "one", 1,
                "nine", 99,
                "neg", -15,
                "big", 1001);
        assertEquals(4, MidtermPractice.countOddNumbers(map));
    }

    @Test
    public void countOddNumbers_emptyMap() {
        Map<String, Integer> map = Map.of();
        assertEquals(0, MidtermPractice.countOddNumbers(map));
    }

    // =========================================================
    // allDivisibleBy3
    // =========================================================

    @Test
    public void allDivisibleBy3_example() {
        int[] arr = {3, 6, 9};
        assertTrue(MidtermPractice.allDivisibleBy3(arr));
    }

    @Test
    public void allDivisibleBy3_example2() {
        int[] arr = {3, 4, 6, 9};
        assertFalse(MidtermPractice.allDivisibleBy3(arr));
    }

    @Test
    public void allDivisibleBy3_firstValueFails() {
        int[] arr = {7, 12, 15, 300};
        assertFalse(MidtermPractice.allDivisibleBy3(arr));
    }

    @Test
    public void allDivisibleBy3_lastValueFails() {
        int[] arr = {21, 33, 48, 40};
        assertFalse(MidtermPractice.allDivisibleBy3(arr));
    }

    @Test
    public void allDivisibleBy3_negativesAndZero() {
        // 0 and negative multiples of 3 are divisible by 3
        int[] arr = {-9, 0, 27, -42};
        assertTrue(MidtermPractice.allDivisibleBy3(arr));
    }

    @Test
    public void allDivisibleBy3_oneValueFails() {
        int[] arr = {14};
        assertFalse(MidtermPractice.allDivisibleBy3(arr));
    }

    @Test
    public void allDivisibleBy3_emptyArray() {
        int[] arr = {};
        assertTrue(MidtermPractice.allDivisibleBy3(arr));
    }

    // =========================================================
    // allStartWithA
    // =========================================================

    @Test
    public void allStartWithA_example() {
        List<String> words = List.of("apple", "Apricot", "avocado");
        assertTrue(MidtermPractice.allStartWithA(words));
    }

    @Test
    public void allStartWithA_example2() {
        List<String> words = List.of("apple", "banana", "avocado");
        assertFalse(MidtermPractice.allStartWithA(words));
    }

    @Test
    public void allStartWithA_firstWordFails() {
        List<String> words = List.of("Zebra", "ant", "Alligator");
        assertFalse(MidtermPractice.allStartWithA(words));
    }

    @Test
    public void allStartWithA_lastWordFails() {
        List<String> words = List.of("Anchor", "arrow", "Atlas", "compass");
        assertFalse(MidtermPractice.allStartWithA(words));
    }

    @Test
    public void allStartWithA_hasAButNotAtStart() {
        // "maple" contains an 'a', but does not START with one
        List<String> words = List.of("Antelope", "maple");
        assertFalse(MidtermPractice.allStartWithA(words));
    }

    @Test
    public void allStartWithA_allUppercase() {
        List<String> words = List.of("ALASKA", "Arizona", "Alabama");
        assertTrue(MidtermPractice.allStartWithA(words));
    }

    @Test
    public void allStartWithA_emptyList() {
        List<String> words = List.of();
        assertTrue(MidtermPractice.allStartWithA(words));
    }

    // =========================================================
    // allPositive
    // =========================================================

    @Test
    public void allPositive_allPositive() {
        // 14 -> 2 -> 87 -> 5
        ListNode head = new ListNode(14, new ListNode(2, new ListNode(87, new ListNode(5))));
        assertTrue(MidtermPractice.allPositive(head));
    }

    @Test
    public void allPositive_firstIsNegative() {
        // -6 -> 20 -> 13
        ListNode head = new ListNode(-6, new ListNode(20, new ListNode(13)));
        assertFalse(MidtermPractice.allPositive(head));
    }

    @Test
    public void allPositive_lastIsNegative() {
        // 9 -> 31 -> 4 -> -1
        ListNode head = new ListNode(9, new ListNode(31, new ListNode(4, new ListNode(-1))));
        assertFalse(MidtermPractice.allPositive(head));
    }

    @Test
    public void allPositive_zeroIsNotPositive() {
        // 18 -> 0 -> 7
        ListNode head = new ListNode(18, new ListNode(0, new ListNode(7)));
        assertFalse(MidtermPractice.allPositive(head));
    }

    @Test
    public void allPositive_oneNode() {
        // 42
        ListNode head = new ListNode(42);
        assertTrue(MidtermPractice.allPositive(head));
    }

    @Test
    public void allPositive_nullHead() {
        ListNode head = null;
        assertTrue(MidtermPractice.allPositive(head));
    }

    // =========================================================
    // product
    // =========================================================

    @Test
    public void product_example() {
        // 5 -> 3 -> 4
        ListNode head = new ListNode(5, new ListNode(3, new ListNode(4)));
        assertEquals(60, MidtermPractice.product(head));
    }

    @Test
    public void product_withNegatives() {
        // -2 -> 7 -> -3     (-2 * 7 * -3 = 42)
        ListNode head = new ListNode(-2, new ListNode(7, new ListNode(-3)));
        assertEquals(42, MidtermPractice.product(head));
    }

    @Test
    public void product_zeroAtEnd() {
        // 11 -> 6 -> 0
        ListNode head = new ListNode(11, new ListNode(6, new ListNode(0)));
        assertEquals(0, MidtermPractice.product(head));
    }

    @Test
    public void product_oneNode() {
        // 13
        ListNode head = new ListNode(13);
        assertEquals(13, MidtermPractice.product(head));
    }

    @Test
    public void product_nullHead() {
        ListNode head = null;
        assertEquals(1, MidtermPractice.product(head));
    }

    // =========================================================
    // removeSmall
    // =========================================================

    @Test
    public void removeSmall_example() {
        // 6 -> 99 -> 2 -> 33 -> 10 -> 4   becomes   99 -> 33 -> 10
        ListNode head = new ListNode(6, new ListNode(99, new ListNode(2,
                new ListNode(33, new ListNode(10, new ListNode(4))))));

        ListNode result = MidtermPractice.removeSmall(head);

        assertEquals(99, result.data);
        assertEquals(33, result.next.data);
        assertEquals(10, result.next.next.data);
        assertNull(result.next.next.next);
    }

    @Test
    public void removeSmall_severalSmallAtStart() {
        // 1 -> 3 -> 50 -> 12   becomes   50 -> 12
        ListNode head = new ListNode(1, new ListNode(3, new ListNode(50, new ListNode(12))));

        ListNode result = MidtermPractice.removeSmall(head);

        assertEquals(50, result.data);
        assertEquals(12, result.next.data);
        assertNull(result.next.next);
    }

    @Test
    public void removeSmall_smallAtEnd() {
        // 45 -> 20 -> 7   becomes   45 -> 20
        ListNode head = new ListNode(45, new ListNode(20, new ListNode(7)));

        ListNode result = MidtermPractice.removeSmall(head);

        assertEquals(45, result.data);
        assertEquals(20, result.next.data);
        assertNull(result.next.next);
    }

    @Test
    public void removeSmall_negativesAndBoundary() {
        // -15 -> 10 -> 9 -> 64   becomes   10 -> 64
        // (10 is NOT strictly less than 10, so it stays. 9 and -15 are removed.)
        ListNode head = new ListNode(-15, new ListNode(10, new ListNode(9, new ListNode(64))));

        ListNode result = MidtermPractice.removeSmall(head);

        assertEquals(10, result.data);
        assertEquals(64, result.next.data);
        assertNull(result.next.next);
    }

    @Test
    public void removeSmall_nothingRemoved() {
        // 88 -> 15 -> 10   stays   88 -> 15 -> 10
        ListNode head = new ListNode(88, new ListNode(15, new ListNode(10)));

        ListNode result = MidtermPractice.removeSmall(head);

        assertEquals(88, result.data);
        assertEquals(15, result.next.data);
        assertEquals(10, result.next.next.data);
        assertNull(result.next.next.next);
    }

    @Test
    public void removeSmall_everythingRemoved() {
        // 8 -> 0 -> -4 -> 3   becomes   null
        ListNode head = new ListNode(8, new ListNode(0, new ListNode(-4, new ListNode(3))));

        ListNode result = MidtermPractice.removeSmall(head);

        assertNull(result);
    }
}