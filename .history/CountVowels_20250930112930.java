import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        String input = "Hello World";
        int vowelCount = countVowels(input);
        System.out.println("Number of vowels in \"" + input + "\": " + vowelCount);
    }

    public static int countVowels(String str) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (char c : str.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }
}