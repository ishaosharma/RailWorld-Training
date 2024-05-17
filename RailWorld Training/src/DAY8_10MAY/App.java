package DAY8_10MAY;
import java.lang.String;

public class App {
    public static void main(String[] args) {
        int startYear = 2000;

        int numberOfStrings = 3; // You can change this to print more strings if needed

        for (int i = 0; i < numberOfStrings; i++) {
            String currentString = "$" + (startYear + i);

            System.out.println(currentString);
        }
    }
}