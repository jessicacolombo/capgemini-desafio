import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<Integer>();
        int result = 0;

        System.out.println("Forneça uma sequencia de numeros:");
        String stringValues = scanner.nextLine();
        String[] splitedValues = stringValues.split(" ");

        for( int i = 0; i < splitedValues.length; i++) {
            array.add(Integer.parseInt(splitedValues[i]));
        }

        System.out.println("Forneça um numero:");
        int x = scanner.nextInt();

        for(int i = 0; i < array.size(); i++) {
            for(int j = 0; j < array.size(); j++) {
                int sub = array.get(i) - array.get(j);

                if(sub == x) {
                    result++;
                }
            }
        }

        System.out.println(result);
    }
}
