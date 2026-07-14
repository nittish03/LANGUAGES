import java.util.HashMap;

public class Chayoos2Nittish {

    public static void main(String[] args) {

        // Hardcoded Input
        String s1 = "listen";
        String s2 = "silent";

        // If lengths are different, they cannot be anagrams.
        if (s1.length() != s2.length()) {
            System.out.println("False");
            return;
        }

        // HashMap to store frequency of characters.
        HashMap<Character, Integer> map = new HashMap<>();

        // Count the frequency of characters in the first string.
        for (int i = 0; i < s1.length(); i++) {
            map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i), 0) + 1);
        }

        // Decrease the frequency using the second string.
        for (int i = 0; i < s2.length(); i++) {

            // Character doesn't exist or its count is already 0.
            if (!map.containsKey(s2.charAt(i)) || map.get(s2.charAt(i)) == 0) {
                System.out.println("False");
                return;
            }

            map.put(s2.charAt(i), map.get(s2.charAt(i)) - 1);
        }

        // Verify that all frequencies became 0.
        for (int count : map.values()) {
            if (count != 0) {
                System.out.println("False");
                return;
            }
        }

        // If we reach here, both strings are anagrams.
        System.out.println("True");
    }
}