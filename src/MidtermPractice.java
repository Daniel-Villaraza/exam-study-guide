import java.util.List;
import java.util.Map;

public class MidtermPractice {

    public static void main(String[] args) {
        // After implementing a method, call it here with
        // some sample input and print the result to
        // check if it works. Fix any issues you find.
    }

    /**
     * Finds the longest word in an List of Strings.
     * @param list an ArrayList of words
     * @return the longest word in the list
     * Example: input: ["apple", "banana", "kiwi"] -> output: "banana"
     */
    public static String findLongestWord(List<String> list) {
        return "";
    }

    /**
     * Counts how many words are longer than 5 characters in the keys of a Map.
     * @param map a Map of strings to integers
     * @return the count of words longer than 5 characters
     * Example: input: ["why"=7, "hello"=8, "brilliant"=99, "world"=15, "amazing"=17] -> output: 2
     */
    public static int countLongWords(Map<String, Integer> map) {
        return -1;
    }

    /**
     * Finds the average of the floats in an array.
     * @param arr an array of floats
     * @return the average of the values
     * Example: input: [1.5, 3.5, 2.0, 3.0] -> output: 2.5
     */
    public static double findAverage(float[] arr) {
        return -1.0;
    }

    /**
     * Counts how many odd numbers there are in the values of a Map.
     * @param map a HashMap of String keys and Integer values
     * @return the count of odd numbers in the values
     * Example: input: {"a"=7, "x"=4, "z"=5} -> output: 2
     */
    public static int countOddNumbers(Map<String, Integer> map) {
        return -1;
    }

    /**
     * Returns true if all values are divisible by 3 in an array.
     * @param arr an array of integers
     * @return true if all values are divisible by 3, false otherwise
     * Example: input: [3, 6, 9] -> output: true
     * Example 2: input: [3, 4, 6, 9] -> output: false
     */
    public static boolean allDivisibleBy3(int[] arr) {
        return false;
    }

    /**
     * Returns true if all words start with 'a' in an ArrayList of Strings.
     * @param list an ArrayList of words
     * @return true if all words start with 'a', false otherwise
     * Example: input: ["apple", "apricot", "avocado"] -> output: true
     * Example: input: ["apple", "banana", "avocado"] -> output: false
     */
    public static boolean allStartWithA(List<String> list) {
        return false;
    }

    /**
     * Prints out each value in a linked list on a separate line.
     * Does not print anything if the head is null
     * @param head the head of the linked list.
     */
    public static void printList(ListNode head) {
    }

    /**
     * Returns the product of all values in a linked list or 1 if the head is null.
     * @param head the head of the linked list
     * @return the product of all values in a linked list or 1 if the head is null.
     * Example Input: 5 -> 3 -> 4
     * Example output: 60
     * Explanation: 5 * 3 * 4 = 20
     */
    public static int product(ListNode head) {
        return 1;
    }

    /**
     * CHALLENGE PROBLEM: take extra time for this problem if needed
     * 
     * Removes all nodes with values strictly less than 10.
     * 
     * @param head the original head of the linked list
     * @return the new head of the linked list
     * Example Input: 6 -> 99 -> 2 -> 33 -> 10 -> 4
     * Example output: 99 -> 33 -> 10
     * Explanation: 6, 2, and 4 are each strictly less than 10, so they are removed from the list
     */
    public static int removeSmall(ListNode head) {
        return 1;
    }

    /**
     * CHALLENGE PROBLEM: take extra time for this problem if needed
     *
     * Determines if the array can be split into two contiguous subarrays with equal sums.
     * The method checks if there exists an index where the sum of elements to the left of the index
     * is equal to the sum of elements to the right. Both subarrays must be contiguous.
     *
     * @param arr an array of integers to evaluate
     * @return true if there exists a split point where the left and right contiguous subarrays have equal sums, false otherwise
     *
     * Example:
     * Input: [1, 3, 8, 2, 1, 2, 7]
     * Output: true (since [1, 3, 8] and [2, 1, 2, 7] both sum to 12)
     *
     * Input: [1, 2, 3, 4, 5]
     * Output: false (no contiguous split results in equal sums)
     */
    public static boolean canPartitionWithEqualSums(int[] arr) {
        return false;
    }

}