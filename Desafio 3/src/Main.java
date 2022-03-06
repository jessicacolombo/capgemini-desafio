import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        String stringOutSpace = string.replaceAll(" ","");
        int finalSquare = GetSquareOfString(stringOutSpace);

        ArrayList<String> firstSliptString = SlitString(stringOutSpace, finalSquare);
        System.out.println("firstSliptString: " + firstSliptString.toString());
    }

    private static ArrayList<String> SlitString(String string, int index) {
        int timesToBreak = string.length() / index;
        ArrayList<String> result = new ArrayList<String>();
        int aux = 0;
        int originalIndex = index;

        for(int i = 0; i <= timesToBreak; i++) {
            if (i == timesToBreak) {
                result.add(string.substring(aux, string.length()));
            } else {
                result.add(string.substring(aux, index));
            }
            aux = index;
            index += originalIndex;
        }
        return result;
    }

    private static int GetSquareOfString(String string) {
        int sizeString = string.length();
        double squareRoot = Math.sqrt(sizeString);
        BigDecimal bd = new BigDecimal(squareRoot).setScale(0, RoundingMode.CEILING);
        return bd.intValue();
    }
}
