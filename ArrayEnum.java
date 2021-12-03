import java.util.Scanner;

enum Command {ADD, LIST, SUM, QUIT, MAX, MIN, INVALID}

public class ArrayEnum {
    public static void main(String[] args){
        int[] values = new int[100];
        int index = 0;

        final Scanner scanner = new Scanner(System.in);

        while(true){
            final Command command = getCommand(scanner);
            if (command == Command.QUIT){
                System.out.println("Bye!");
                break;
            }

            switch (command){
                case ADD:
                    final int newValue = getValue(scanner);
                    values[index] = newValue;
                    index++;
                    break;
                case LIST:
                    printList(values, index);
                    break;
                case SUM:
                    System.out.println(getSum(values, index));
                    break;
                case MIN:
                    System.out.println(getMin(values, index));
                    break;
                case MAX:
                    System.out.println(getMax(values, index));
                    break;
                case INVALID:
                    System.out.println("Invalid Command");
                    break;
            }
        }
        scanner.close();
    }

    private static int getMax(int[] values, int index) {
        int max = values[0];
        for(int i = 0; i < index; i++){
            if(max < values[i])
                max = values[i];
        }
        return max;
    }

    private static int getMin(int[] values, int index) {
        int min = values[0];
        for(int i = 0; i < index; i++){
            if(min > values[i])
                min = values[i];
        }
        return min;
    }

    private static int getSum(int[] values, int index) {
        int temp = 0;
        for(int i = 0; i < index; i++){
            temp += values[i];
        }
        return temp;
    }

    private static void printList(int[] values, int index) {
        for(int i = 0; i < index; i++){
            System.out.printf("%s ", values[i]);
        }
        System.out.printf("\n");
    }

    private static int getValue(Scanner scanner) {
        return scanner.nextInt();
    }

    private static Command getCommand(Scanner scanner) {
        String commandName = scanner.next();
        Command code;
        try{
            code = Command.valueOf(commandName.toUpperCase());
        }
        catch (IllegalArgumentException e){
            code = Command.INVALID;
        }
        return code;
    }
}