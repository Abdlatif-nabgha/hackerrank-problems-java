import java.util.Scanner;

public class Anagrams {
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

        // Converts both strins to lowercase
        a = a.toLowerCase();
        b = b.toLowerCase();

        // Frequency array of English letters
        int[] freq = new int[26];
        
        // Loop through arrays increment for first one and decrement for last one
        for (int i = 0; i < a.length(); i++) {
            freq[a.charAt(i) - 'a']++;
            freq[b.charAt(i) - 'a']--;
        }

        // Check if all values in the frequency array are zero
        for (int i : freq) {
            if (i != 0) {
                return false;
            }
        }

        return true;
    }
}
