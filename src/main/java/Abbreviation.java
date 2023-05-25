import java.util.Scanner;

public class Abbreviation {
    Scanner scanner = new Scanner(System.in);

    String[] words = {"btw", "asap", "lol", "omg", "brb", "thx"};
    String[] decoding = {"by the way", "as soon as possible", "laugh out loud", "oh my god", "be right back", "thanks"};

    public void showAbbreviations() {
        System.out.println("Введите сообщение");
        String message = scanner.nextLine();
        String messageLow = message.toLowerCase();
        StringBuilder stringBuilder = new StringBuilder(messageLow);

        for (int i = 0; i < words.length; i++) {
            int startIndex = messageLow.indexOf(words[i]);
            while (startIndex != -1) {
                int stopIndex = startIndex + words[i].length();

                stringBuilder.delete(startIndex, stopIndex);
                stringBuilder.insert(startIndex, decoding[i]);

                messageLow = stringBuilder.toString();
                startIndex = messageLow.indexOf(words[i], stopIndex);
            }
        }

        System.out.println(stringBuilder);
    }
}
