public class String0 {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "World";
        String sameAsA = "Hello";

        // a == b compares storage reference, not actual content.
        if (a == sameAsA) {
            System.out.println("a and sameAsA point to the same string in memory");
        }

        // equals checks the actual content of the string.
        if (a.equals(sameAsA)) {
            System.out.println("a and sameAsA have the same value");
        }

        // equalsIgnoreCase checks content without caring about uppercase/lowercase.
        if (a.equalsIgnoreCase("hello")) {
            System.out.println("Hello and hello are equal if case is ignored");
        }

        // compareTo compares strings like dictionary order.
        int result = a.compareTo(b);
        if (result == 0) {
            System.out.println("a and b are equal");
        } else if (result < 0) {
            System.out.println("a comes before b in dictionary order");
        } else {
            System.out.println("a comes after b in dictionary order");
        }

        String sentence = "   hello   what   world   ";

        // trim removes extra spaces from the start and end.
        System.out.println(sentence.trim());

        // split(" ") splits the string into an array at spaces.
        String[] words = sentence.trim().split(" ");
        for (String word : words) {
            System.out.println(word);
        }

        // trim().replaceAll("\\s+", " ") removes all extra spaces from a string.
        System.out.println(sentence.trim().replaceAll("\\s+", " "));

        // length gives the number of characters in the string.
        System.out.println("Length of a: " + a.length());

        // substring starts from start index and stops before the last index.
        System.out.println(a.substring(1, a.length()));

        // StringBuilder is used when we want to change the string.
        StringBuilder string = new StringBuilder("Hello");

        // setCharAt(index, 'character') changes a character at a point.
        string.setCharAt(1, 'a');
        System.out.println(string);

        // insert(index, 'character') inserts a character at a point.
        string.insert(2, 'y');
        System.out.println(string);

        // delete(start, end) deletes characters from start to end - 1.
        string.delete(2, 3);
        System.out.println(string);

        // append('character') adds a character at the end.
        string.append('!');
        System.out.println(string);
    }
}
