import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int number[] = new int[3];
        for (int i = 0; i < 3; i++) {
            number[i] = scanner.nextInt();
        }

        for (int i = number.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (number[j + 1] > number[j]) {
                    int Auxiliary = number[j];
                    number[j] = number[j + 1];
                    number[j + 1] = Auxiliary;
                }
            }
        }

        for (int i = 0; i < number.length; i++) {
            if (i < 3) System.out.print(number[i] + " ");
            else if (i == 3) System.out.println(number[i]);
        }
    }
}
