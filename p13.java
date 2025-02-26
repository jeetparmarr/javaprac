public class p13 {
    public static void main(String[] args) {
        String str = "Hello, World!";

        char ch = str.charAt(7);
        System.out.println("Character at index 7: " + ch);

        boolean contains = str.contains("World");
        System.out.println("Contains 'World': " + contains);

        String formattedStr = String.format("My name is %s and I am %d years old.", "John", 25);
        System.out.println("Formatted String: " + formattedStr);

        int length = str.length();
        System.out.println("Length of the string: " + length);

        String[] words = str.split(", ");
        System.out.println("Split string:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
