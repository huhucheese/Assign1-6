import java.util.Scanner;
public class FactorialMain {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = scanner.nextInt();
        for (int i=1; i<=num; i++){
            System.out.println("Factorial of "+i+" = "+getFactorial(i));
        }
        scanner.close();
    }

    public static long getFactorial(final int n){
        if (n == 1)
            return 1;
        return n * getFactorial(n-1);
    }
}
