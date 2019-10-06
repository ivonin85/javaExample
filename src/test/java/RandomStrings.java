import java.util.Random;

public class RandomStrings {

    public static void main(String[] args) {
        for (String s : generateRandomWords(10)) {
            System.out.println(s);
        }

        for (int i = 0; i < 10; i++) {
            nnnT();
        }


    }

    public static String[] generateRandomWords(int numberOfWords) {
        String[] randomStrings = new String[numberOfWords];
        Random random = new Random();
        for (int i = 0; i < numberOfWords; i++) {
            char[] word = new char[random.nextInt(8) + 3]; // words of length 3 through 10. (1 and 2 letter words are boring.)
            for (int j = 0; j < word.length; j++) {
                word[j] = (char) ('a' + random.nextInt(26));
            }
            randomStrings[i] = new String(word);
        }
        return randomStrings;
    }

    public static void nnnT() {
        String symbols = "абвгдеёжзийклмнопрстуфхчшщъыьэюяАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЧШЩЪЫЬЭЮЯ";
        StringBuilder randString = new StringBuilder();
        /** длинна слова */
        int count = 10;
        for (int i = 0; i < count; i++)
            randString.append(symbols.charAt((int) (Math.random() * symbols.length())));

        System.out.println(randString);
    }
}
