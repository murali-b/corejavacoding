public class MCUSM {
    public static void main(String args[]){
        String str = "Java Programming";

// Comparison
        System.out.println(str.equals("java programming"));       // false
        System.out.println(str.equalsIgnoreCase("java programming")); // true

// Content Checks
        System.out.println(str.contains("Java"));     // true
        System.out.println(str.startsWith("J"));      // true
        System.out.println(str.isEmpty());            // false

        String text = "  Hello World  ";

        System.out.println(text.trim());              // "Hello World"
        System.out.println(text.toLowerCase());       // "  hello world  "
        System.out.println(text.toUpperCase());       // "  HELLO WORLD  "
        System.out.println(text.replace("o", "0"));   // "  Hell0 W0rld

        String data = "Developer";

        System.out.println(data.length());            // 9
        System.out.println(data.charAt(0));           // 'D'
        System.out.println(data.indexOf("e"));        // 1 (first occurrence)
        System.out.println(data.lastIndexOf("e"));   // 7 (last occurrence)

// Substring (start index is inclusive, end index is exclusive)
        System.out.println(data.substring(0, 3));     // "Dev"

        // Splitting a sentence into an array
        String sentence = "Apple,Banana,Cherry";
        String[] fruits = sentence.split(",");
// Result: ["Apple", "Banana", "Cherry"]

// Joining elements back together
        String joined = String.join(" - ", "Red", "Green", "Blue");
// Result: "Red - Green - Blue"

        int year = 2024;
        String s = String.valueOf(year); // Converts int to "2024"
       // Key Performance Note
       // Because Strings are immutable in Java, every time you call a method like replace() or substring(), a new object is created in the String Constant Pool. If you are doing hundreds of transformations, use the StringBuilder class to save memory.

    }
}
