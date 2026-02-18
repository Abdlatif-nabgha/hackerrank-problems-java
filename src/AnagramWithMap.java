import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class AnagramWithMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        scanner.close();

        boolean ret = isAnagram(a, b);
        System.out.println(ret ? a + " and " + b + " are anagrams" : a + " and " + b + " are not anagrams");
    }

    public static boolean isAnagram(String a, String b) {
        
        // Check if the length of the two strings is equal
        if (a.length() != b.length()) {
            return false;
        }

        // Convert both strings to lowercase
        a = a.toLowerCase();
        b = b.toLowerCase();

        // Create a HashMap to store the frequency of each character in the first string
        Map<Character, Integer> freq = new HashMap<>();
        
        // Build freq map from string a
        for (char c : a.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        // Substract frequency using string b
        for (char c : b.toCharArray()) {
            if (!freq.containsKey(c)) {
                return false;
            }
            freq.put(c, freq.get(c) - 1);
            if (freq.get(c) == 0) {
                freq.remove(c);
            }
        }

        return freq.isEmpty();
    }
}
