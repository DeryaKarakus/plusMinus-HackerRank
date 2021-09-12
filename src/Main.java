import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int array[] = new int[100];
        int n = array.length;
        int positiveNumbers = 0;
        int negativeNumbers = 0;
        int zeroNumbers = 0;
        System.out.print("Enter the number of elements you want to store: ");
        n = scanner.nextInt();
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n ; i ++ ) {
            array[i] = scanner.nextInt();
            if (array[i] > 0 ) {
                positiveNumbers++;
            }
            else if (array[i] < 0 ) {
                negativeNumbers++;
            }else if (array [i] == 0) {
                zeroNumbers++;
            }

        }
        System.out.println((double) positiveNumbers / n );
        System.out.println((double) negativeNumbers / n );
        System.out.println((double) zeroNumbers / n );

    }
}
