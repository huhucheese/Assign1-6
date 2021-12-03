import java.text.DecimalFormat;
import java.util.Scanner;

public class MathMain {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("###,###,###");

        System.out.println("Enter a begin number: ");
        int begin = scanner.nextInt();
        System.out.println("Enter an end number: ");
        int end = scanner.nextInt();

        long sum = getSumBetween(begin, end);
        System.out.printf("Sum between %d and %d : %s\n", begin, end, format.format(sum));

        long product = getProductBetween(begin, end);
        System.out.printf("Product between %d and %d : %s\n", begin, end, format.format(product));

        scanner.close();
    }

    private static long getProductBetween(int begin, int end) {
        int temp;
        for(temp = begin; begin < end; begin++) {
            temp *= begin + 1;
        }
        return temp;
    }

    private static long getSumBetween(int begin, int end) {
        int temp;
        for(temp = begin; begin < end; begin++) {
            temp += begin + 1;
        }
        return temp;
    }
}
