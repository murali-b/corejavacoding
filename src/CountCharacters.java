import java.util.HashMap;

public class CountCharacters {
    public static void main(String[] args) {
        String inputString = "AAAAAaabbbcceaa";
        countConsecutiveChars(inputString);
    }
    /**
     * Counts and prints sequences of consecutive identical characters in a string.
     * @param str The input string.
     */
    public static void countConsecutiveChars(String str) {
        if (str == null || str.isEmpty()) {
            System.out.println("The string is empty or null.");
            return;
        }

        int n = str.length();
        int count = 1;

        for (int i = 0; i < n; i++) {
            // Check if the current character is the same as the next character (if it exists)
            if (i + 1 < n && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                // If the next character is different or we reached the end, print the result
                System.out.println("Character '" + str.charAt(i) + "' occurs " + count + " times consecutively.");
                System.out.println(""+str.charAt(i)+ count + " ");
                count = 1; // Reset count for the new sequence

            }
        }
        countCharsWithMAP();
    }
    public static void countCharsWithMAP() {
        String text = "banana";
        HashMap<Character, Integer> freq = new HashMap<>();

        for (char c : text.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        System.out.println("Total character frequencies: " + freq);
        // Output: Total character frequencies: {a=3, b=1, n=2}
    }
}