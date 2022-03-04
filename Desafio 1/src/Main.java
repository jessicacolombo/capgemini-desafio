import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<Integer>();

        String stringValues = scanner.nextLine();
        String[] splitedValues = stringValues.split(" ");

        for( int i = 0; i < splitedValues.length; i++) {
            array.add(Integer.parseInt(splitedValues[i]));
        }

        int result = median(array);
        System.out.println(result);
    }

    public static int median(ArrayList<Integer> array) {
        Collections.sort(array);
        int index = array.size() / 2;
        return array.get(index);
    }
}
