public class Chayoos2 {

    public static void main(String[] args) {

        // Hardcoded Input
        String s1 = "listen";
        String s2 = "silent";

        // If lengths are different, they cannot be anagram.
        if (s1.length() != s2.length()) {
            System.out.println("False");
            return;
        }

        // Frequency array for all ASCII characters.
        int[] freq = new int[26];

        // Count the frequency of characters in the first string.
        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i)]++;
        }

        // Decrease the frequency using the second string.
        for (int i = 0; i < s2.length(); i++) {
            freq[s2.charAt(i)]--;

            // If frequency becomes negative,
            // s2 contains an extra character.
            if (freq[s2.charAt(i)] < 0) {
                System.out.println("False");
                return;
            }
        }

        // If we reach here, both strings are anagram.
        System.out.println("True");
    }
}


