import java.util.ArrayList;
import java.util.Collections;

public class Main {
    static final int SIZE = 26;

    public static void main(String[] args) {
        ArrayList <String> stringList = new ArrayList<>();
        ArrayList <Integer> lengthList = new ArrayList<>();
        ArrayList <String> reversedList = new ArrayList<>();

        // Adding elements in list
        stringList.add("teststring");
        stringList.add("yuliaikan");
        stringList.add("somehowdoo");
        stringList.add("doooooooor");

        // String Length
        for(String word : stringList) { lengthList.add(word.length()); }

        // Reverse Strings
        for(String word : stringList) { reversedList.add(reverseString(word)); }

        // Output All
        System.out.println(stringList);
        System.out.println(reversedList);
        System.out.println(lengthList);

        Collections.sort(lengthList);
        System.out.println(lengthList);

        // Show stat by found occurrence
        for(String word : stringList) {
            System.out.println("Original string - " + word + " ||| Stat by current string - " + printCharWithFreq(word));
        }
    }

    // reverse string method
    public static String reverseString(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) { result = str.charAt(i) + result; }
        return result;
    }

    // function to print the character and its
    // frequency in order of its occurrence
    static String printCharWithFreq(String str)
    {
        String result = "";
        int n = str.length();
        int[] freq = new int[SIZE];
        for (int i = 0; i < n; i++)
            freq[str.charAt(i) - 'a']++;
        for (int i = 0; i < n; i++) {
            if (freq[str.charAt(i) - 'a'] != 0) {
                result += str.charAt(i);
                result += (freq[str.charAt(i) - 'a'] + " ");
                freq[str.charAt(i) - 'a'] = 0;
            }
        }
        return result;
    }
}