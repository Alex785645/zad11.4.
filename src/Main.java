import java.util.Scanner;
public class Main {
    private static final int array_size = 10;
    private static int[] number = new int[array_size];

    public static void main(String[] args) {
        fillAray();

        for (int i = 0; i < array_size; i++) {
            System.out.println("Elemant" + i + ": " + number[i]);
        }
    }

    public static int readNumber() throws NegativeNumberExpection {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();
        if (number < 0) {
            throw new NegativeNumberExpection("Negative numbers are not allowed");
        }
        return number;
    }
    public static void fillAray() {
        for (int i = 0; i < array_size; i++) {
            try {
                number[i]=readNumber();
            } catch (NegativeNumberExpection e){
                System.out.println(e.getMessage());
                number[i]=0;
            }
        }
    }
}