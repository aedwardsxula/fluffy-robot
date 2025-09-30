public class Driver {
    public static void main(String[] args) {
        String testString = "Hello, World!";
        int vowelCount = countVowels(testString);
        System.out.println("Number of vowels in \"" + testString + "\": " + vowelCount);
    }
    // wrrite a fincion thatt counts the number of vowels in a given string
    public static int countVowels(String word) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (char c : word.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }
}