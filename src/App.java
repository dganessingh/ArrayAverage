import java.util.*;

public class App {
  public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        double[] numList = new double[10];

        System.out.println("Please enter 10 numbers.");

        for (int i = 0; i < numList.length; i++) {
            String input = scanner.nextLine();

            if (input.matches("^\\d+$") == false) {
                System.out.println("Invalid input. Please enter an integer.");
                return;
            }

            numList[i] = Double.parseDouble(input);

        }

        System.out.println("The average is " + average(numList));


    }

    public static int average(int[] array) {
        int sum = 0;
        for (int arr : array) {
            sum += arr;
        } 
        return sum / array.length;

}

    public static double average(double[] array) {
        int sum = 0;
        for (double arr : array) {
            sum += arr;
        } 
        return sum / (double)array.length;

}

}

