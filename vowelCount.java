public class vowelCount{

    public static void main(String[] args){
        String mars = "This is a test string";
        int count = 0;

        for(int x = 0; x < mars.length(); x++){
            char lett = Character.toUpperCase(mars.charAt(x));

            if(lett == 'A' || lett == 'E' || lett == 'I' || lett == 'O' || lett == 'U'){
                count++;
            }
        }
        System.out.println("Number of vowels: " + count);
    }
}