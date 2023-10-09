import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("D:\\JavaProject\\labik\\src\\24_demo.txt"));
            String line;
            String input = "";

            while ((line = reader.readLine()) != null) {
                input += line;
            }

            int maxLength = 0;
            int currentLength = 0;

            for (int i = 0; i < input.length(); i++) {
                char currentChar = input.charAt(i);

                if (currentChar == 'X') {
                    currentLength++;
                } else {

                    currentLength = 0;
                }

                if (currentLength > maxLength) {
                    maxLength = currentLength;
                }
            }

            System.out.println("Самая длинная последовательность 'X': " + maxLength);
        } catch (IOException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }
}